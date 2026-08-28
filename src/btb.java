import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum btb implements azt {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bta.a),
   c(2, "offhand", bta.b),
   d(3, "hand", $$0 -> $$0.a() == bta.a.a),
   e(4, "feet", bta.c),
   f(5, "legs", bta.d),
   g(6, "chest", bta.e),
   h(7, "head", bta.f),
   i(8, "armor", bta::f),
   j(9, "body", bta.g);

   public static final IntFunction<btb> k = axo.a($$0 -> $$0.n, values(), axo.a.a);
   public static final Codec<btb> l = azt.a(btb::values);
   public static final zm<ByteBuf, btb> m = zk.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bta> p;

   private btb(final int $$0, final String $$1, final Predicate<bta> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private btb(final int $$0, final String $$1, final bta $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static btb a(bta $$0) {
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

   public boolean b(bta $$0) {
      return this.p.test($$0);
   }
}
