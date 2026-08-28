import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bsz implements azk {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bsy.a),
   c(2, "offhand", bsy.b),
   d(3, "hand", $$0 -> $$0.a() == bsy.a.a),
   e(4, "feet", bsy.c),
   f(5, "legs", bsy.d),
   g(6, "chest", bsy.e),
   h(7, "head", bsy.f),
   i(8, "armor", bsy::f),
   j(9, "body", bsy.g);

   public static final IntFunction<bsz> k = axe.a($$0 -> $$0.n, values(), axe.a.a);
   public static final Codec<bsz> l = azk.a(bsz::values);
   public static final yx<ByteBuf, bsz> m = yv.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bsy> p;

   private bsz(final int $$0, final String $$1, final Predicate<bsy> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bsz(final int $$0, final String $$1, final bsy $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bsz a(bsy $$0) {
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

   public boolean b(bsy $$0) {
      return this.p.test($$0);
   }
}
