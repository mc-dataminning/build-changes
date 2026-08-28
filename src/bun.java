import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bun implements bag {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bum.a),
   c(2, "offhand", bum.b),
   d(3, "hand", $$0 -> $$0.a() == bum.a.a),
   e(4, "feet", bum.c),
   f(5, "legs", bum.d),
   g(6, "chest", bum.e),
   h(7, "head", bum.f),
   i(8, "armor", bum::f),
   j(9, "body", bum.g);

   public static final IntFunction<bun> k = ayb.a($$0 -> $$0.n, values(), ayb.a.a);
   public static final Codec<bun> l = bag.a(bun::values);
   public static final zg<ByteBuf, bun> m = ze.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bum> p;

   private bun(final int $$0, final String $$1, final Predicate<bum> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bun(final int $$0, final String $$1, final bum $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bun a(bum $$0) {
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

   public boolean b(bum $$0) {
      return this.p.test($$0);
   }
}
