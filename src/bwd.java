import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bwd implements bag, Iterable<bwc> {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bwc.a),
   c(2, "offhand", bwc.b),
   d(3, "hand", $$0 -> $$0.a() == bwc.a.a),
   e(4, "feet", bwc.c),
   f(5, "legs", bwc.d),
   g(6, "chest", bwc.e),
   h(7, "head", bwc.f),
   i(8, "armor", bwc::f),
   j(9, "body", bwc.g),
   k(10, "saddle", bwc.h);

   public static final IntFunction<bwd> l = aya.a($$0 -> $$0.o, values(), aya.a.a);
   public static final Codec<bwd> m = bag.a(bwd::values);
   public static final yt<ByteBuf, bwd> n = yr.a(l, $$0 -> $$0.o);
   private final int o;
   private final String p;
   private final Predicate<bwc> q;
   private final List<bwc> r;

   private bwd(final int $$0, final String $$1, final Predicate<bwc> $$2) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = bwc.j.stream().filter($$2).toList();
   }

   private bwd(final int $$0, final String $$1, final bwc $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bwd a(bwc $$0) {
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

   public boolean b(bwc $$0) {
      return this.q.test($$0);
   }

   public List<bwc> a() {
      return this.r;
   }

   @Override
   public Iterator<bwc> iterator() {
      return this.r.iterator();
   }
}
