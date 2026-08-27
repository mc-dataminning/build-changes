import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dfa extends dde implements dkf {
   public static final dqy a = dis.b;
   public static final dqy b = dis.c;
   public static final dqy c = dis.d;
   public static final dqy d = dis.e;
   public static final dqy e = dqx.C;
   protected static final Map<is, dqy> f = dis.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eui[] g;
   protected final eui[] h;
   private final Object2IntMap<dqh> i = new Object2IntOpenHashMap();

   protected dfa(float $$0, float $$1, float $$2, float $$3, float $$4, dqg.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dqh $$6 = (dqh)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dfa> a();

   protected eui[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eui $$9 = dde.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eui $$10 = dde.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eui $$11 = dde.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eui $$12 = dde.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eui $$13 = dde.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eui $$14 = euf.a($$10, $$13);
      eui $$15 = euf.a($$11, $$12);
      eui[] $$16 = new eui[]{
         euf.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         euf.a($$11, $$10),
         euf.a($$12, $$10),
         euf.a($$15, $$10),
         $$13,
         euf.a($$11, $$13),
         euf.a($$12, $$13),
         euf.a($$15, $$13),
         $$14,
         euf.a($$11, $$14),
         euf.a($$12, $$14),
         euf.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = euf.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dqh $$0, czj $$1, in $$2) {
      return !$$0.c(e);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(is $$0) {
      return 1 << $$0.e();
   }

   protected int g(dqh $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(is.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(is.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(is.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(is.e);
         }

         return $$1;
      });
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(e) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      switch ($$1) {
         case c:
            return $$0.a(a, $$0.c(c)).a(b, $$0.c(d)).a(c, $$0.c(a)).a(d, $$0.c(b));
         case d:
            return $$0.a(a, $$0.c(b)).a(b, $$0.c(c)).a(c, $$0.c(d)).a(d, $$0.c(a));
         case b:
            return $$0.a(a, $$0.c(d)).a(b, $$0.c(a)).a(c, $$0.c(b)).a(d, $$0.c(c));
         default:
            return $$0;
      }
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      switch ($$1) {
         case b:
            return $$0.a(a, $$0.c(c)).a(c, $$0.c(a));
         case c:
            return $$0.a(b, $$0.c(d)).a(d, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}
