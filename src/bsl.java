import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bsl implements ayz {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bsk.a),
   c(2, "offhand", bsk.b),
   d(3, "hand", $$0 -> $$0.a() == bsk.a.a),
   e(4, "feet", bsk.c),
   f(5, "legs", bsk.d),
   g(6, "chest", bsk.e),
   h(7, "head", bsk.f),
   i(8, "armor", bsk::f),
   j(9, "body", bsk.g);

   public static final IntFunction<bsl> k = awu.a($$0 -> $$0.n, values(), awu.a.a);
   public static final Codec<bsl> l = ayz.a(bsl::values);
   public static final ys<ByteBuf, bsl> m = yq.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bsk> p;

   private bsl(final int $$0, final String $$1, final Predicate<bsk> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bsl(final int $$0, final String $$1, final bsk $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bsl a(bsk $$0) {
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

   public boolean b(bsk $$0) {
      return this.p.test($$0);
   }
}
