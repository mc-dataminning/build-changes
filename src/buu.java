import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum buu implements azv {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", but.a),
   c(2, "offhand", but.b),
   d(3, "hand", $$0 -> $$0.a() == but.a.a),
   e(4, "feet", but.c),
   f(5, "legs", but.d),
   g(6, "chest", but.e),
   h(7, "head", but.f),
   i(8, "armor", but::f),
   j(9, "body", but.g);

   public static final IntFunction<buu> k = axq.a($$0 -> $$0.n, values(), axq.a.a);
   public static final Codec<buu> l = azv.a(buu::values);
   public static final yn<ByteBuf, buu> m = yl.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<but> p;

   private buu(final int $$0, final String $$1, final Predicate<but> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private buu(final int $$0, final String $$1, final but $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static buu a(but $$0) {
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

   public boolean b(but $$0) {
      return this.p.test($$0);
   }
}
