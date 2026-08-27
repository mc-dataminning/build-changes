import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bsc implements ayx {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bsb.a),
   c(2, "offhand", bsb.b),
   d(3, "hand", $$0 -> $$0.a() == bsb.a.a),
   e(4, "feet", bsb.c),
   f(5, "legs", bsb.d),
   g(6, "chest", bsb.e),
   h(7, "head", bsb.f),
   i(8, "armor", bsb::f),
   j(9, "body", bsb.g);

   public static final IntFunction<bsc> k = awv.a($$0 -> $$0.n, values(), awv.a.a);
   public static final Codec<bsc> l = ayx.a(bsc::values);
   public static final yv<ByteBuf, bsc> m = yt.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bsb> p;

   private bsc(int $$0, String $$1, Predicate<bsb> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bsc(int $$0, String $$1, bsb $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   @Override
   public String c() {
      return this.o;
   }

   public boolean a(bsb $$0) {
      return this.p.test($$0);
   }
}
