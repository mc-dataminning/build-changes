import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bwq implements bak, Iterable<bwp> {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bwp.a),
   c(2, "offhand", bwp.b),
   d(3, "hand", $$0 -> $$0.a() == bwp.a.a),
   e(4, "feet", bwp.c),
   f(5, "legs", bwp.d),
   g(6, "chest", bwp.e),
   h(7, "head", bwp.f),
   i(8, "armor", bwp::f),
   j(9, "body", bwp.g),
   k(10, "saddle", bwp.h);

   public static final IntFunction<bwq> l = ayc.a($$0 -> $$0.o, values(), ayc.a.a);
   public static final Codec<bwq> m = bak.a(bwq::values);
   public static final yw<ByteBuf, bwq> n = yu.a(l, $$0 -> $$0.o);
   private final int o;
   private final String p;
   private final Predicate<bwp> q;
   private final List<bwp> r;

   private bwq(final int $$0, final String $$1, final Predicate<bwp> $$2) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = bwp.j.stream().filter($$2).toList();
   }

   private bwq(final int $$0, final String $$1, final bwp $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bwq a(bwp $$0) {
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

   public boolean b(bwp $$0) {
      return this.q.test($$0);
   }

   public List<bwp> a() {
      return this.r;
   }

   @Override
   public Iterator<bwp> iterator() {
      return this.r.iterator();
   }
}
