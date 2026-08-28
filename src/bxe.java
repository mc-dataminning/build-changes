import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public enum bxe implements bam, Iterable<bxd> {
   a(0, "any", $$0 -> true),
   b(1, "mainhand", bxd.a),
   c(2, "offhand", bxd.b),
   d(3, "hand", $$0 -> $$0.a() == bxd.a.a),
   e(4, "feet", bxd.c),
   f(5, "legs", bxd.d),
   g(6, "chest", bxd.e),
   h(7, "head", bxd.f),
   i(8, "armor", bxd::f),
   j(9, "body", bxd.g),
   k(10, "saddle", bxd.h);

   public static final IntFunction<bxe> l = aye.a($$0 -> $$0.o, values(), aye.a.a);
   public static final Codec<bxe> m = bam.a(bxe::values);
   public static final yy<ByteBuf, bxe> n = yw.a(l, $$0 -> $$0.o);
   private final int o;
   private final String p;
   private final Predicate<bxd> q;
   private final List<bxd> r;

   private bxe(final int $$0, final String $$1, final Predicate<bxd> $$2) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = bxd.j.stream().filter($$2).toList();
   }

   private bxe(final int $$0, final String $$1, final bxd $$2) {
      this($$0, $$1, $$1x -> $$1x == $$2);
   }

   public static bxe a(bxd $$0) {
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

   public boolean b(bxd $$0) {
      return this.q.test($$0);
   }

   public List<bxd> a() {
      return this.r;
   }

   @Override
   public Iterator<bxd> iterator() {
      return this.r.iterator();
   }
}
