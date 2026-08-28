import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bvk implements baq {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bvj.a),
   c(2, "offhand", bvj.b),
   d(3, "hand", $$0 -> $$0.a() == bvj.a.a),
   e(4, "feet", bvj.c),
   f(5, "legs", bvj.d),
   g(6, "chest", bvj.e),
   h(7, "head", bvj.f),
   i(8, "armor", bvj::f),
   j(9, "body", bvj.g);

   public static final IntFunction<bvk> k = ayl.a($$0 -> $$0.n, values(), ayl.a.a);
   public static final Codec<bvk> l = baq.a(bvk::values);
   public static final zi<ByteBuf, bvk> m = zg.a(k, $$0 -> $$0.n);
   private final int n;
   private final String o;
   private final Predicate<bvj> p;

   private bvk(final int $$0, final String $$1, final Predicate<bvj> $$2) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
   }

   private bvk(final int $$0, final String $$1, final bvj $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bvk a(bvj $$0) {
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

   public boolean b(bvj $$0) {
      return this.p.test($$0);
   }
}
