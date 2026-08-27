import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public abstract class dby extends dac implements dhc {
   public static final dns a = dfp.b;
   public static final dns b = dfp.c;
   public static final dns c = dfp.d;
   public static final dns d = dfp.e;
   public static final dns e = dnr.C;
   protected static final Map<ih, dns> f = dfp.h.entrySet().stream().filter($$0 -> $$0.getKey().o().d()).collect(ac.a());
   protected final eqm[] g;
   protected final eqm[] h;
   private final Object2IntMap<dnb> i = new Object2IntOpenHashMap();

   protected dby(float $$0, float $$1, float $$2, float $$3, float $$4, dna.d $$5) {
      super($$5);
      this.g = this.a($$0, $$1, $$4, 0.0F, $$4);
      this.h = this.a($$0, $$1, $$2, 0.0F, $$3);
      UnmodifiableIterator var7 = this.E.a().iterator();

      while (var7.hasNext()) {
         dnb $$6 = (dnb)var7.next();
         this.g($$6);
      }
   }

   @Override
   protected abstract MapCodec<? extends dby> a();

   protected eqm[] a(float $$0, float $$1, float $$2, float $$3, float $$4) {
      float $$5 = 8.0F - $$0;
      float $$6 = 8.0F + $$0;
      float $$7 = 8.0F - $$1;
      float $$8 = 8.0F + $$1;
      eqm $$9 = dac.a((double)$$5, 0.0, (double)$$5, (double)$$6, (double)$$2, (double)$$6);
      eqm $$10 = dac.a((double)$$7, (double)$$3, 0.0, (double)$$8, (double)$$4, (double)$$8);
      eqm $$11 = dac.a((double)$$7, (double)$$3, (double)$$7, (double)$$8, (double)$$4, 16.0);
      eqm $$12 = dac.a(0.0, (double)$$3, (double)$$7, (double)$$8, (double)$$4, (double)$$8);
      eqm $$13 = dac.a((double)$$7, (double)$$3, (double)$$7, 16.0, (double)$$4, (double)$$8);
      eqm $$14 = eqj.a($$10, $$13);
      eqm $$15 = eqj.a($$11, $$12);
      eqm[] $$16 = new eqm[]{
         eqj.a(),
         $$11,
         $$12,
         $$15,
         $$10,
         eqj.a($$11, $$10),
         eqj.a($$12, $$10),
         eqj.a($$15, $$10),
         $$13,
         eqj.a($$11, $$13),
         eqj.a($$12, $$13),
         eqj.a($$15, $$13),
         $$14,
         eqj.a($$11, $$14),
         eqj.a($$12, $$14),
         eqj.a($$15, $$14)
      };

      for (int $$17 = 0; $$17 < 16; $$17++) {
         $$16[$$17] = eqj.a($$9, $$16[$$17]);
      }

      return $$16;
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return !$$0.c(e);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.h[this.g($$0)];
   }

   @Override
   protected eqm b(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return this.g[this.g($$0)];
   }

   private static int a(ih $$0) {
      return 1 << $$0.e();
   }

   protected int g(dnb $$0) {
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
   protected eip c_(dnb $$0) {
      return $$0.c(e) ? eiq.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
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
   protected dnb a(dnb $$0, dey $$1) {
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
