import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bse implements ayz {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bsd.a),
   c(2, "offhand", bsd.b),
   d(3, "hand", $$0 -> $$0.a() == bsd.a.a),
   e(4, "feet", bsd.c),
   f(5, "legs", bsd.d),
   g(6, "chest", bsd.e),
   h(7, "head", bsd.f),
   i(8, "armor", bsd::f),
   j(9, "body", bsd.g);

   public static final IntFunction<bse> k = aww.a($$0 -> $$0.n, values(), aww.a.a);
   public static final Codec<bse> l = ayz.a(bse::values);
   public static final yv<ByteBuf, bse> m = yt.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bsd> p;

   private bse(int $$0, String $$1, Predicate<bsd> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bse(int $$0, String $$1, bsd $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bse a(bsd $$0) {
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

   public boolean b(bsd $$0) {
      return this.p.test($$0);
   }
}
