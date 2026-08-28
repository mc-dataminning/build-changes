import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum btc implements azu {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", btb.a),
   c(2, "offhand", btb.b),
   d(3, "hand", $$0 -> $$0.a() == btb.a.a),
   e(4, "feet", btb.c),
   f(5, "legs", btb.d),
   g(6, "chest", btb.e),
   h(7, "head", btb.f),
   i(8, "armor", btb::f),
   j(9, "body", btb.g);

   public static final IntFunction<btc> k = axp.a($$0 -> $$0.n, values(), axp.a.a);
   public static final Codec<btc> l = azu.a(btc::values);
   public static final zn<ByteBuf, btc> m = zl.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<btb> p;

   private btc(final int $$0, final String $$1, final Predicate<btb> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private btc(final int $$0, final String $$1, final btb $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static btc a(btb $$0) {
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

   public boolean b(btb $$0) {
      return this.p.test($$0);
   }
}
