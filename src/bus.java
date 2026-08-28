import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bus implements azu {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bur.a),
   c(2, "offhand", bur.b),
   d(3, "hand", $$0 -> $$0.a() == bur.a.a),
   e(4, "feet", bur.c),
   f(5, "legs", bur.d),
   g(6, "chest", bur.e),
   h(7, "head", bur.f),
   i(8, "armor", bur::f),
   j(9, "body", bur.g);

   public static final IntFunction<bus> k = axp.a($$0 -> $$0.n, values(), axp.a.a);
   public static final Codec<bus> l = azu.a(bus::values);
   public static final ym<ByteBuf, bus> m = yk.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bur> p;

   private bus(final int $$0, final String $$1, final Predicate<bur> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bus(final int $$0, final String $$1, final bur $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bus a(bur $$0) {
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

   public boolean b(bur $$0) {
      return this.p.test($$0);
   }
}
