import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bxg implements bao, Iterable<bxf> {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bxf.a),
   c(2, "offhand", bxf.b),
   d(3, "hand", $$0 -> $$0.a() == bxf.a.a),
   e(4, "feet", bxf.c),
   f(5, "legs", bxf.d),
   g(6, "chest", bxf.e),
   h(7, "head", bxf.f),
   i(8, "armor", bxf::f),
   j(9, "body", bxf.g),
   k(10, "saddle", bxf.h);

   public static final IntFunction<bxg> l = ayg.a($$0 -> $$0.o, values(), ayg.a.a);
   public static final Codec<bxg> m = bao.a(bxg::values);
   public static final za<ByteBuf, bxg> n = yy.a(l, $$0 -> $$0.o);
   private final int o;
   private final String p;
   private final Predicate<bxf> q;
   private final List<bxf> r;

   private bxg(final int $$0, final String $$1, final Predicate<bxf> $$2) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = bxf.j.stream().filter($$2).toList();
   }

   private bxg(final int $$0, final String $$1, final bxf $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bxg a(bxf $$0) {
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

   public boolean b(bxf $$0) {
      return this.q.test($$0);
   }

   public List<bxf> a() {
      return this.r;
   }

   @Override
   public Iterator<bxf> iterator() {
      return this.r.iterator();
   }
}
