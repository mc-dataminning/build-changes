import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum but implements azv {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bus.a),
   c(2, "offhand", bus.b),
   d(3, "hand", $$0 -> $$0.a() == bus.a.a),
   e(4, "feet", bus.c),
   f(5, "legs", bus.d),
   g(6, "chest", bus.e),
   h(7, "head", bus.f),
   i(8, "armor", bus::f),
   j(9, "body", bus.g);

   public static final IntFunction<but> k = axq.a($$0 -> $$0.n, values(), axq.a.a);
   public static final Codec<but> l = azv.a(but::values);
   public static final yn<ByteBuf, but> m = yl.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bus> p;

   private but(final int $$0, final String $$1, final Predicate<bus> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private but(final int $$0, final String $$1, final bus $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static but a(bus $$0) {
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

   public boolean b(bus $$0) {
      return this.p.test($$0);
   }
}
