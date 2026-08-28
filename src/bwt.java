import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bwt implements bak, Iterable<bws> {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bws.a),
   c(2, "offhand", bws.b),
   d(3, "hand", $$0 -> $$0.a() == bws.a.a),
   e(4, "feet", bws.c),
   f(5, "legs", bws.d),
   g(6, "chest", bws.e),
   h(7, "head", bws.f),
   i(8, "armor", bws::f),
   j(9, "body", bws.g),
   k(10, "saddle", bws.h);

   public static final IntFunction<bwt> l = ayc.a($$0 -> $$0.o, values(), ayc.a.a);
   public static final Codec<bwt> m = bak.a(bwt::values);
   public static final yw<ByteBuf, bwt> n = yu.a(l, $$0 -> $$0.o);
   private final int o;
   private final String p;
   private final Predicate<bws> q;
   private final List<bws> r;

   private bwt(final int $$0, final String $$1, final Predicate<bws> $$2) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = bws.j.stream().filter($$2).toList();
   }

   private bwt(final int $$0, final String $$1, final bws $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bwt a(bws $$0) {
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

   public boolean b(bws $$0) {
      return this.q.test($$0);
   }

   public List<bws> a() {
      return this.r;
   }

   @Override
   public Iterator<bws> iterator() {
      return this.r.iterator();
   }
}
