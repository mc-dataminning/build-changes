import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bui implements baf {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", buh.a),
   c(2, "offhand", buh.b),
   d(3, "hand", $$0 -> $$0.a() == buh.a.a),
   e(4, "feet", buh.c),
   f(5, "legs", buh.d),
   g(6, "chest", buh.e),
   h(7, "head", buh.f),
   i(8, "armor", buh::f),
   j(9, "body", buh.g);

   public static final IntFunction<bui> k = aya.a($$0 -> $$0.n, values(), aya.a.a);
   public static final Codec<bui> l = baf.a(bui::values);
   public static final zf<ByteBuf, bui> m = zd.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<buh> p;

   private bui(final int $$0, final String $$1, final Predicate<buh> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bui(final int $$0, final String $$1, final buh $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bui a(buh $$0) {
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

   public boolean b(buh $$0) {
      return this.p.test($$0);
   }
}
