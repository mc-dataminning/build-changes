import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bvo implements bba {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bvn.a),
   c(2, "offhand", bvn.b),
   d(3, "hand", $$0 -> $$0.a() == bvn.a.a),
   e(4, "feet", bvn.c),
   f(5, "legs", bvn.d),
   g(6, "chest", bvn.e),
   h(7, "head", bvn.f),
   i(8, "armor", bvn::f),
   j(9, "body", bvn.g);

   public static final IntFunction<bvo> k = ayv.a($$0 -> $$0.n, values(), ayv.a.a);
   public static final Codec<bvo> l = bba.a(bvo::values);
   public static final zt<ByteBuf, bvo> m = zr.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bvn> p;

   private bvo(final int $$0, final String $$1, final Predicate<bvn> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bvo(final int $$0, final String $$1, final bvn $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bvo a(bvn $$0) {
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

   public boolean b(bvn $$0) {
      return this.p.test($$0);
   }
}
