import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bsd implements azg {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bsc.a),
   c(2, "offhand", bsc.b),
   d(3, "hand", $$0 -> $$0.a() == bsc.a.a),
   e(4, "feet", bsc.c),
   f(5, "legs", bsc.d),
   g(6, "chest", bsc.e),
   h(7, "head", bsc.f),
   i(8, "armor", bsc::f);

   public static final IntFunction<bsd> j = axd.a($$0 -> $$0.m, values(), axd.a.a);
   public static final Codec<bsd> k = azg.a(bsd::values);
   public static final zc<ByteBuf, bsd> l = za.a(j, $$0 -> $$0.m);
   private final int m;
   private final String n;
   private final Predicate<bsc> o;

   private bsd(int $$0, String $$1, Predicate<bsc> $$2) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
   }

   private bsd(int $$0, String $$1, bsc $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   @Override
   public String c() {
      return this.n;
   }

   public boolean a(bsc $$0) {
      return this.o.test($$0);
   }
}
