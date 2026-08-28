import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bwo implements bak, Iterable<bwn> {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bwn.a),
   c(2, "offhand", bwn.b),
   d(3, "hand", $$0 -> $$0.a() == bwn.a.a),
   e(4, "feet", bwn.c),
   f(5, "legs", bwn.d),
   g(6, "chest", bwn.e),
   h(7, "head", bwn.f),
   i(8, "armor", bwn::f),
   j(9, "body", bwn.g),
   k(10, "saddle", bwn.h);

   public static final IntFunction<bwo> l = ayc.a($$0 -> $$0.o, values(), ayc.a.a);
   public static final Codec<bwo> m = bak.a(bwo::values);
   public static final yw<ByteBuf, bwo> n = yu.a(l, $$0 -> $$0.o);
   private final int o;
   private final String p;
   private final Predicate<bwn> q;
   private final List<bwn> r;

   private bwo(final int $$0, final String $$1, final Predicate<bwn> $$2) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = bwn.j.stream().filter($$2).toList();
   }

   private bwo(final int $$0, final String $$1, final bwn $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bwo a(bwn $$0) {
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

   public boolean b(bwn $$0) {
      return this.q.test($$0);
   }

   public List<bwn> a() {
      return this.r;
   }

   @Override
   public Iterator<bwn> iterator() {
      return this.r.iterator();
   }
}
