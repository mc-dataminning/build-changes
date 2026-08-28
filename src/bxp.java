import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bxp implements bax, Iterable<bxo> {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bxo.a),
   c(2, "offhand", bxo.b),
   d(3, "hand", $$0 -> $$0.a() == bxo.a.a),
   e(4, "feet", bxo.c),
   f(5, "legs", bxo.d),
   g(6, "chest", bxo.e),
   h(7, "head", bxo.f),
   i(8, "armor", bxo::f),
   j(9, "body", bxo.g),
   k(10, "saddle", bxo.h);

   public static final IntFunction<bxp> l = ayo.a($$0 -> $$0.o, values(), ayo.a.a);
   public static final Codec<bxp> m = bax.a(bxp::values);
   public static final ze<ByteBuf, bxp> n = zc.a(l, $$0 -> $$0.o);
   private final int o;
   private final String p;
   private final Predicate<bxo> q;
   private final List<bxo> r;

   private bxp(final int $$0, final String $$1, final Predicate<bxo> $$2) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = bxo.j.stream().filter($$2).toList();
   }

   private bxp(final int $$0, final String $$1, final bxo $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bxp a(bxo $$0) {
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

   public boolean b(bxo $$0) {
      return this.q.test($$0);
   }

   public List<bxo> a() {
      return this.r;
   }

   @Override
   public Iterator<bxo> iterator() {
      return this.r.iterator();
   }
}
