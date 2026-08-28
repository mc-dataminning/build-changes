import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bsx implements azp {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bsw.a),
   c(2, "offhand", bsw.b),
   d(3, "hand", $$0 -> $$0.a() == bsw.a.a),
   e(4, "feet", bsw.c),
   f(5, "legs", bsw.d),
   g(6, "chest", bsw.e),
   h(7, "head", bsw.f),
   i(8, "armor", bsw::f),
   j(9, "body", bsw.g);

   public static final IntFunction<bsx> k = axl.a($$0 -> $$0.n, values(), axl.a.a);
   public static final Codec<bsx> l = azp.a(bsx::values);
   public static final zj<ByteBuf, bsx> m = zh.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bsw> p;

   private bsx(final int $$0, final String $$1, final Predicate<bsw> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bsx(final int $$0, final String $$1, final bsw $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bsx a(bsw $$0) {
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

   public boolean b(bsw $$0) {
      return this.p.test($$0);
   }
}
