import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bua implements bab {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", btz.a),
   c(2, "offhand", btz.b),
   d(3, "hand", $$0 -> $$0.a() == btz.a.a),
   e(4, "feet", btz.c),
   f(5, "legs", btz.d),
   g(6, "chest", btz.e),
   h(7, "head", btz.f),
   i(8, "armor", btz::f),
   j(9, "body", btz.g);

   public static final IntFunction<bua> k = axw.a($$0 -> $$0.n, values(), axw.a.a);
   public static final Codec<bua> l = bab.a(bua::values);
   public static final zc<ByteBuf, bua> m = za.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<btz> p;

   private bua(final int $$0, final String $$1, final Predicate<btz> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bua(final int $$0, final String $$1, final btz $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bua a(btz $$0) {
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

   public boolean b(btz $$0) {
      return this.p.test($$0);
   }
}
