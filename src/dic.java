import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dic extends czf implements dgf {
   public static final MapCodec<dic> a = b(dic::new);
   public static final dmv b = dmu.J;
   public static final dnc<dnq> c = dmu.W;
   public static final dnc<dnq> d = dmu.X;
   public static final dnc<dnq> e = dmu.Y;
   public static final dnc<dnq> f = dmu.Z;
   public static final dmv g = dmu.C;
   private final Map<dme, epo> h;
   private final Map<dme, epo> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final epo F = czf.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final epo G = czf.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final epo H = czf.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final epo I = czf.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final epo J = czf.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   public dic(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dnq.a).a(c, dnq.a).a(e, dnq.a).a(f, dnq.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static epo a(epo $$0, dnq $$1, epo $$2, epo $$3) {
      if ($$1 == dnq.c) {
         return epl.a($$0, $$3);
      } else {
         return $$1 == dnq.b ? epl.a($$0, $$2) : $$0;
      }
   }

   private Map<dme, epo> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      epo $$10 = czf.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      epo $$11 = czf.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      epo $$12 = czf.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      epo $$13 = czf.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      epo $$14 = czf.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      epo $$15 = czf.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      epo $$16 = czf.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      epo $$17 = czf.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      epo $$18 = czf.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dme, epo> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dnq $$21 : c.a()) {
            for (dnq $$22 : d.a()) {
               for (dnq $$23 : f.a()) {
                  for (dnq $$24 : e.a()) {
                     epo $$25 = epl.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = epl.a($$25, $$10);
                     }

                     dme $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
                     $$19.put($$26.a(g, Boolean.valueOf(false)), $$25);
                     $$19.put($$26.a(g, Boolean.valueOf(true)), $$25);
                  }
               }
            }
         }
      }

      return $$19.build();
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.h.get($$0);
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   private boolean a(dme $$0, boolean $$1, ih $$2) {
      czf $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dce && dce.a($$0, $$2);
      return $$0.a(aue.L) || !j($$0) && $$1 || $$3 instanceof ddf || $$4;
   }

   @Override
   public dme a(crx $$0) {
      cwh $$1 = $$0.q();
      ib $$2 = $$0.a();
      ehr $$3 = $$0.q().b_($$0.a());
      ib $$4 = $$2.e();
      ib $$5 = $$2.h();
      ib $$6 = $$2.f();
      ib $$7 = $$2.g();
      ib $$8 = $$2.c();
      dme $$9 = $$1.a_($$4);
      dme $$10 = $$1.a_($$5);
      dme $$11 = $$1.a_($$6);
      dme $$12 = $$1.a_($$7);
      dme $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ih.d), ih.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ih.e), ih.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ih.c), ih.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ih.f), ih.f);
      dme $$18 = this.o().a(g, Boolean.valueOf($$3.a() == ehs.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      if ($$1 == ih.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ih.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dme $$0, dnh<dnq> $$1) {
      return $$0.c($$1) != dnq.a;
   }

   private static boolean a(epo $$0, epo $$1) {
      return !epl.c($$1, $$0, eoz.e);
   }

   private dme a(cwh $$0, dme $$1, ib $$2, dme $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dme a(cwh $$0, ib $$1, dme $$2, ib $$3, dme $$4, ih $$5) {
      ih $$6 = $$5.g();
      boolean $$7 = $$5 == ih.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == ih.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == ih.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == ih.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ib $$11 = $$1.c();
      dme $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dme a(cwh $$0, dme $$1, ib $$2, dme $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      epo $$8 = $$3.k($$0, $$2).a(ih.a);
      dme $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dme $$0, dme $$1, epo $$2) {
      boolean $$3 = $$1.b() instanceof dic && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dnq $$4 = $$0.c(d);
         dnq $$5 = $$0.c(e);
         dnq $$6 = $$0.c(c);
         dnq $$7 = $$0.c(f);
         boolean $$8 = $$5 == dnq.a;
         boolean $$9 = $$7 == dnq.a;
         boolean $$10 = $$6 == dnq.a;
         boolean $$11 = $$4 == dnq.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dnq.c && $$5 == dnq.c || $$6 == dnq.c && $$7 == dnq.c;
            return $$13 ? false : $$1.a(aue.aN) || a($$2, F);
         }
      }
   }

   private dme a(dme $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, epo $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dnq a(boolean $$0, epo $$1, epo $$2) {
      if ($$0) {
         return a($$1, $$2) ? dnq.c : dnq.b;
      } else {
         return dnq.a;
      }
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(g) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a_(dme $$0, cvk $$1, ib $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      switch ($$1) {
         case c:
            return $$0.a(d, $$0.c(e)).a(c, $$0.c(f)).a(e, $$0.c(d)).a(f, $$0.c(c));
         case d:
            return $$0.a(d, $$0.c(c)).a(c, $$0.c(e)).a(e, $$0.c(f)).a(f, $$0.c(d));
         case b:
            return $$0.a(d, $$0.c(f)).a(c, $$0.c(d)).a(e, $$0.c(c)).a(f, $$0.c(e));
         default:
            return $$0;
      }
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      switch ($$1) {
         case b:
            return $$0.a(d, $$0.c(e)).a(e, $$0.c(d));
         case c:
            return $$0.a(c, $$0.c(f)).a(f, $$0.c(c));
         default:
            return super.a($$0, $$1);
      }
   }
}
