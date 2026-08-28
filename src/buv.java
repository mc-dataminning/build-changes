import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum buv implements azv {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", buu.a),
   c(2, "offhand", buu.b),
   d(3, "hand", $$0 -> $$0.a() == buu.a.a),
   e(4, "feet", buu.c),
   f(5, "legs", buu.d),
   g(6, "chest", buu.e),
   h(7, "head", buu.f),
   i(8, "armor", buu::f),
   j(9, "body", buu.g);

   public static final IntFunction<buv> k = axq.a($$0 -> $$0.n, values(), axq.a.a);
   public static final Codec<buv> l = azv.a(buv::values);
   public static final yn<ByteBuf, buv> m = yl.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<buu> p;

   private buv(final int $$0, final String $$1, final Predicate<buu> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private buv(final int $$0, final String $$1, final buu $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static buv a(buu $$0) {
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

   public boolean b(buu $$0) {
      return this.p.test($$0);
   }
}
