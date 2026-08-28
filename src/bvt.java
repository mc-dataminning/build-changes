import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bvt implements bba {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bvs.a),
   c(2, "offhand", bvs.b),
   d(3, "hand", $$0 -> $$0.a() == bvs.a.a),
   e(4, "feet", bvs.c),
   f(5, "legs", bvs.d),
   g(6, "chest", bvs.e),
   h(7, "head", bvs.f),
   i(8, "armor", bvs::f),
   j(9, "body", bvs.g);

   public static final IntFunction<bvt> k = ayv.a($$0 -> $$0.n, values(), ayv.a.a);
   public static final Codec<bvt> l = bba.a(bvt::values);
   public static final zt<ByteBuf, bvt> m = zr.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bvs> p;

   private bvt(final int $$0, final String $$1, final Predicate<bvs> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bvt(final int $$0, final String $$1, final bvs $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bvt a(bvs $$0) {
      return switch ($$0) {
         case a -> b;
         case b -> c;
         case c -> e;
         case d -> f;
         case e -> g;
         case f -> h;
         case g -> j;
      };
   }

   @Override
   public String c() {
      return this.o;
   }

   public boolean b(bvs $$0) {
      return this.p.test($$0);
   }
}
