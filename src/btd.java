import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum btd implements azu {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", btc.a),
   c(2, "offhand", btc.b),
   d(3, "hand", $$0 -> $$0.a() == btc.a.a),
   e(4, "feet", btc.c),
   f(5, "legs", btc.d),
   g(6, "chest", btc.e),
   h(7, "head", btc.f),
   i(8, "armor", btc::f),
   j(9, "body", btc.g);

   public static final IntFunction<btd> k = axp.a($$0 -> $$0.n, values(), axp.a.a);
   public static final Codec<btd> l = azu.a(btd::values);
   public static final zn<ByteBuf, btd> m = zl.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<btc> p;

   private btd(final int $$0, final String $$1, final Predicate<btc> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private btd(final int $$0, final String $$1, final btc $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static btd a(btc $$0) {
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

   public boolean b(btc $$0) {
      return this.p.test($$0);
   }
}
