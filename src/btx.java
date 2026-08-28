import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum btx implements azz {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", btw.a),
   c(2, "offhand", btw.b),
   d(3, "hand", $$0 -> $$0.a() == btw.a.a),
   e(4, "feet", btw.c),
   f(5, "legs", btw.d),
   g(6, "chest", btw.e),
   h(7, "head", btw.f),
   i(8, "armor", btw::f),
   j(9, "body", btw.g);

   public static final IntFunction<btx> k = axu.a($$0 -> $$0.n, values(), axu.a.a);
   public static final Codec<btx> l = azz.a(btx::values);
   public static final zb<ByteBuf, btx> m = yz.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<btw> p;

   private btx(final int $$0, final String $$1, final Predicate<btw> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private btx(final int $$0, final String $$1, final btw $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static btx a(btw $$0) {
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

   public boolean b(btw $$0) {
      return this.p.test($$0);
   }
}
