import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bsp implements azc {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bso.a),
   c(2, "offhand", bso.b),
   d(3, "hand", $$0 -> $$0.a() == bso.a.a),
   e(4, "feet", bso.c),
   f(5, "legs", bso.d),
   g(6, "chest", bso.e),
   h(7, "head", bso.f),
   i(8, "armor", bso::f),
   j(9, "body", bso.g);

   public static final IntFunction<bsp> k = aww.a($$0 -> $$0.n, values(), aww.a.a);
   public static final Codec<bsp> l = azc.a(bsp::values);
   public static final ys<ByteBuf, bsp> m = yq.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bso> p;

   private bsp(final int $$0, final String $$1, final Predicate<bso> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bsp(final int $$0, final String $$1, final bso $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bsp a(bso $$0) {
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

   public boolean b(bso $$0) {
      return this.p.test($$0);
   }
}
