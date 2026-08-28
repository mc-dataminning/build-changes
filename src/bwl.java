import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bwl implements bai, Iterable<bwk> {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bwk.a),
   c(2, "offhand", bwk.b),
   d(3, "hand", $$0 -> $$0.a() == bwk.a.a),
   e(4, "feet", bwk.c),
   f(5, "legs", bwk.d),
   g(6, "chest", bwk.e),
   h(7, "head", bwk.f),
   i(8, "armor", bwk::f),
   j(9, "body", bwk.g),
   k(10, "saddle", bwk.h);

   public static final IntFunction<bwl> l = aya.a($$0 -> $$0.o, values(), aya.a.a);
   public static final Codec<bwl> m = bai.a(bwl::values);
   public static final yu<ByteBuf, bwl> n = ys.a(l, $$0 -> $$0.o);
   private final int o;
   private final String p;
   private final Predicate<bwk> q;
   private final List<bwk> r;

   private bwl(final int $$0, final String $$1, final Predicate<bwk> $$2) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = bwk.j.stream().filter($$2).toList();
   }

   private bwl(final int $$0, final String $$1, final bwk $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bwl a(bwk $$0) {
      return switch ($$0) {
         case a -> b;
         case b -> c;
         case c -> e;
         case d -> f;
         case e -> g;
         case f -> h;
         case g -> j;
         case h -> k;
      };
   }

   @Override
   public String c() {
      return this.p;
   }

   public boolean b(bwk $$0) {
      return this.q.test($$0);
   }

   public List<bwk> a() {
      return this.r;
   }

   @Override
   public Iterator<bwk> iterator() {
      return this.r.iterator();
   }
}
