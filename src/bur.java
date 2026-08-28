import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bur implements baj {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", buq.a),
   c(2, "offhand", buq.b),
   d(3, "hand", $$0 -> $$0.a() == buq.a.a),
   e(4, "feet", buq.c),
   f(5, "legs", buq.d),
   g(6, "chest", buq.e),
   h(7, "head", buq.f),
   i(8, "armor", buq::f),
   j(9, "body", buq.g);

   public static final IntFunction<bur> k = aye.a($$0 -> $$0.n, values(), aye.a.a);
   public static final Codec<bur> l = baj.a(bur::values);
   public static final zj<ByteBuf, bur> m = zh.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<buq> p;

   private bur(final int $$0, final String $$1, final Predicate<buq> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bur(final int $$0, final String $$1, final buq $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bur a(buq $$0) {
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

   public boolean b(buq $$0) {
      return this.p.test($$0);
   }
}
