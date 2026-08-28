import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bsy implements azj {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bsx.a),
   c(2, "offhand", bsx.b),
   d(3, "hand", $$0 -> $$0.a() == bsx.a.a),
   e(4, "feet", bsx.c),
   f(5, "legs", bsx.d),
   g(6, "chest", bsx.e),
   h(7, "head", bsx.f),
   i(8, "armor", bsx::f),
   j(9, "body", bsx.g);

   public static final IntFunction<bsy> k = axd.a($$0 -> $$0.n, values(), axd.a.a);
   public static final Codec<bsy> l = azj.a(bsy::values);
   public static final yw<ByteBuf, bsy> m = yu.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bsx> p;

   private bsy(final int $$0, final String $$1, final Predicate<bsx> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bsy(final int $$0, final String $$1, final bsx $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bsy a(bsx $$0) {
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

   public boolean b(bsx $$0) {
      return this.p.test($$0);
   }
}
