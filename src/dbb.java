import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dbb extends czf implements dgf {
   public static final dmv a = des.b;
   public static final dmv b = des.c;
   public static final dmv c = des.d;
   public static final dmv d = des.e;
   public static final dmv e = dmu.C;
   protected static final Map<ih, dmv> f = des.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final epo[] g;
   protected final epo[] h;
   private final Object2IntMap<dme> i = new Object2IntOpenHashMap();

   protected dbb(float $$0, float $$1, float $$2, float $$3, float $$4, dmd.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dme $$6 = (dme)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dbb> a();

   protected epo[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      epo $$9 = czf.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      epo $$10 = czf.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      epo $$11 = czf.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      epo $$12 = czf.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      epo $$13 = czf.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      epo $$14 = epl.a($$10, $$13);
      epo $$15 = epl.a($$11, $$12);
      epo[] $$16 = new epo[]{
         epl.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         epl.a($$11, $$10),
         epl.a($$12, $$10),
         epl.a($$15, $$10),
         $$13,
         epl.a($$11, $$13),
         epl.a($$12, $$13),
         epl.a($$15, $$13),
         $$14,
         epl.a($$11, $$14),
         epl.a($$12, $$14),
         epl.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = epl.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dme $$0, cvk $$1, ib $$2) {
      return !$$0.c(e);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ih $$0) {
      return 1 << $$0.e();
   }

   protected int g(dme $$0) {
      return this.i.computeIntIfAbsent($$0, $$0x -> {
         int $$1 = 0;
         if ($$0x.c(a)) {
            $$1 |= a(ih.c);
         }

         if ($$0x.c(b)) {
            $$1 |= a(ih.f);
         }

         if ($$0x.c(c)) {
            $$1 |= a(ih.d);
         }

         if ($$0x.c(d)) {
            $$1 |= a(ih.e);
         }

         return $$1;
      });
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(e) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
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
   protected dme a(dme $$0, deb $$1) {
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
