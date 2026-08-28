import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bta implements azs {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bsz.a),
   c(2, "offhand", bsz.b),
   d(3, "hand", $$0 -> $$0.a() == bsz.a.a),
   e(4, "feet", bsz.c),
   f(5, "legs", bsz.d),
   g(6, "chest", bsz.e),
   h(7, "head", bsz.f),
   i(8, "armor", bsz::f),
   j(9, "body", bsz.g);

   public static final IntFunction<bta> k = axo.a($$0 -> $$0.n, values(), axo.a.a);
   public static final Codec<bta> l = azs.a(bta::values);
   public static final zm<ByteBuf, bta> m = zk.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bsz> p;

   private bta(final int $$0, final String $$1, final Predicate<bsz> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bta(final int $$0, final String $$1, final bsz $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bta a(bsz $$0) {
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

   public boolean b(bsz $$0) {
      return this.p.test($$0);
   }
}
