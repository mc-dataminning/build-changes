import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bte implements azu {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", btd.a),
   c(2, "offhand", btd.b),
   d(3, "hand", $$0 -> $$0.a() == btd.a.a),
   e(4, "feet", btd.c),
   f(5, "legs", btd.d),
   g(6, "chest", btd.e),
   h(7, "head", btd.f),
   i(8, "armor", btd::f),
   j(9, "body", btd.g);

   public static final IntFunction<bte> k = axp.a($$0 -> $$0.n, values(), axp.a.a);
   public static final Codec<bte> l = azu.a(bte::values);
   public static final zn<ByteBuf, bte> m = zl.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<btd> p;

   private bte(final int $$0, final String $$1, final Predicate<btd> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bte(final int $$0, final String $$1, final btd $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bte a(btd $$0) {
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

   public boolean b(btd $$0) {
      return this.p.test($$0);
   }
}
