import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bso implements azc {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bsn.a),
   c(2, "offhand", bsn.b),
   d(3, "hand", $$0 -> $$0.a() == bsn.a.a),
   e(4, "feet", bsn.c),
   f(5, "legs", bsn.d),
   g(6, "chest", bsn.e),
   h(7, "head", bsn.f),
   i(8, "armor", bsn::f),
   j(9, "body", bsn.g);

   public static final IntFunction<bso> k = aww.a($$0 -> $$0.n, values(), aww.a.a);
   public static final Codec<bso> l = azc.a(bso::values);
   public static final ys<ByteBuf, bso> m = yq.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bsn> p;

   private bso(final int $$0, final String $$1, final Predicate<bsn> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bso(final int $$0, final String $$1, final bsn $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bso a(bsn $$0) {
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

   public boolean b(bsn $$0) {
      return this.p.test($$0);
   }
}
