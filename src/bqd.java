import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bqd implements aye {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bqc.a),
   c(2, "offhand", bqc.b),
   d(3, "hand", $$0 -> $$0.a() == bqc.a.a),
   e(4, "feet", bqc.c),
   f(5, "legs", bqc.d),
   g(6, "chest", bqc.e),
   h(7, "head", bqc.f),
   i(8, "armor", bqc::f);

   public static final IntFunction<bqd> j = awb.a($$0 -> $$0.m, values(), awb.a.a);
   public static final Codec<bqd> k = aye.a(bqd::values);
   public static final ye<ByteBuf, bqd> l = yc.a(j, $$0 -> $$0.m);
   private final int m;
   private final String n;
   private final Predicate<bqc> o;

   private bqd(int $$0, String $$1, Predicate<bqc> $$2) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
   }

   private bqd(int $$0, String $$1, bqc $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   @Override
   public String c() {
      return this.n;
   }

   public boolean a(bqc $$0) {
      return this.o.test($$0);
   }
}
