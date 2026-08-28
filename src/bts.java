import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bts implements azy {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", btr.a),
   c(2, "offhand", btr.b),
   d(3, "hand", $$0 -> $$0.a() == btr.a.a),
   e(4, "feet", btr.c),
   f(5, "legs", btr.d),
   g(6, "chest", btr.e),
   h(7, "head", btr.f),
   i(8, "armor", btr::f),
   j(9, "body", btr.g);

   public static final IntFunction<bts> k = axt.a($$0 -> $$0.n, values(), axt.a.a);
   public static final Codec<bts> l = azy.a(bts::values);
   public static final zb<ByteBuf, bts> m = yz.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<btr> p;

   private bts(final int $$0, final String $$1, final Predicate<btr> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bts(final int $$0, final String $$1, final btr $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bts a(btr $$0) {
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

   public boolean b(btr $$0) {
      return this.p.test($$0);
   }
}
