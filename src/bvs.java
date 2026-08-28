import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bvs implements bba {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bvr.a),
   c(2, "offhand", bvr.b),
   d(3, "hand", $$0 -> $$0.a() == bvr.a.a),
   e(4, "feet", bvr.c),
   f(5, "legs", bvr.d),
   g(6, "chest", bvr.e),
   h(7, "head", bvr.f),
   i(8, "armor", bvr::f),
   j(9, "body", bvr.g);

   public static final IntFunction<bvs> k = ayv.a($$0 -> $$0.n, values(), ayv.a.a);
   public static final Codec<bvs> l = bba.a(bvs::values);
   public static final zt<ByteBuf, bvs> m = zr.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bvr> p;

   private bvs(final int $$0, final String $$1, final Predicate<bvr> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bvs(final int $$0, final String $$1, final bvr $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bvs a(bvr $$0) {
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

   public boolean b(bvr $$0) {
      return this.p.test($$0);
   }
}
