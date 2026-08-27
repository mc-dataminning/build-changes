import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dbt extends csx implements czy {
   public static final dgc a = dgb.J;
   public static final dgj<dgx> b = dgb.W;
   public static final dgj<dgx> c = dgb.X;
   public static final dgj<dgx> d = dgb.Y;
   public static final dgj<dgx> e = dgb.Z;
   public static final dgc f = dgb.C;
   private final Map<dfl, eii> g;
   private final Map<dfl, eii> h;
   private static final int i = 3;
   private static final int j = 14;
   private static final int k = 4;
   private static final int l = 1;
   private static final int m = 7;
   private static final int n = 9;
   private static final eii D = csx.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eii E = csx.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eii F = csx.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eii G = csx.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eii H = csx.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public dbt(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)).a(c, dgx.a).a(b, dgx.a).a(d, dgx.a).a(e, dgx.a).a(f, Boolean.valueOf(false)));
      this.g = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.h = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eii a(eii $$0, dgx $$1, eii $$2, eii $$3) {
      if ($$1 == dgx.c) {
         return eif.a($$0, $$3);
      } else {
         return $$1 == dgx.b ? eif.a($$0, $$2) : $$0;
      }
   }

   private Map<dfl, eii> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eii $$10 = csx.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eii $$11 = csx.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eii $$12 = csx.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eii $$13 = csx.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eii $$14 = csx.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eii $$15 = csx.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eii $$16 = csx.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eii $$17 = csx.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eii $$18 = csx.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dfl, eii> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : a.a()) {
         for (dgx $$21 : b.a()) {
            for (dgx $$22 : c.a()) {
               for (dgx $$23 : e.a()) {
                  for (dgx $$24 : d.a()) {
                     eii $$25 = eif.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = eif.a($$25, $$10);
                     }

                     dfl $$26 = this.n().a(a, $$20).a(b, $$21).a(e, $$23).a(c, $$22).a(d, $$24);
                     $$19.put($$26.a(f, Boolean.valueOf(false)), $$25);
                     $$19.put($$26.a(f, Boolean.valueOf(true)), $$25);
                  }
               }
            }
         }
      }

      return $$19.build();
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.g.get($$0);
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return this.h.get($$0);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   private boolean a(dfl $$0, boolean $$1, hc $$2) {
      csx $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cvs && cvs.a($$0, $$2);
      return $$0.a(apu.L) || !j($$0) && $$1 || $$3 instanceof cwv || $$4;
   }

   @Override
   public dfl a(clp $$0) {
      cqa $$1 = $$0.q();
      gw $$2 = $$0.a();
      eao $$3 = $$0.q().b_($$0.a());
      gw $$4 = $$2.e();
      gw $$5 = $$2.h();
      gw $$6 = $$2.f();
      gw $$7 = $$2.g();
      gw $$8 = $$2.c();
      dfl $$9 = $$1.a_($$4);
      dfl $$10 = $$1.a_($$5);
      dfl $$11 = $$1.a_($$6);
      dfl $$12 = $$1.a_($$7);
      dfl $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, hc.d), hc.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, hc.e), hc.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, hc.c), hc.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, hc.f), hc.f);
      dfl $$18 = this.n().a(f, Boolean.valueOf($$3.a() == eap.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      if ($$1 == hc.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == hc.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dfl $$0, dgo<dgx> $$1) {
      return $$0.c($$1) != dgx.a;
   }

   private static boolean a(eii $$0, eii $$1) {
      return !eif.c($$1, $$0, eht.e);
   }

   private dfl a(cqa $$0, dfl $$1, gw $$2, dfl $$3) {
      boolean $$4 = a($$1, c);
      boolean $$5 = a($$1, b);
      boolean $$6 = a($$1, d);
      boolean $$7 = a($$1, e);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dfl a(cqa $$0, gw $$1, dfl $$2, gw $$3, dfl $$4, hc $$5) {
      hc $$6 = $$5.g();
      boolean $$7 = $$5 == hc.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$8 = $$5 == hc.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, b);
      boolean $$9 = $$5 == hc.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$10 = $$5 == hc.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      gw $$11 = $$1.c();
      dfl $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dfl a(cqa $$0, dfl $$1, gw $$2, dfl $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eii $$8 = $$3.k($$0, $$2).a(hc.a);
      dfl $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(a, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dfl $$0, dfl $$1, eii $$2) {
      boolean $$3 = $$1.b() instanceof dbt && $$1.c(a);
      if ($$3) {
         return true;
      } else {
         dgx $$4 = $$0.c(c);
         dgx $$5 = $$0.c(d);
         dgx $$6 = $$0.c(b);
         dgx $$7 = $$0.c(e);
         boolean $$8 = $$5 == dgx.a;
         boolean $$9 = $$7 == dgx.a;
         boolean $$10 = $$6 == dgx.a;
         boolean $$11 = $$4 == dgx.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dgx.c && $$5 == dgx.c || $$6 == dgx.c && $$7 == dgx.c;
            return $$13 ? false : $$1.a(apu.aN) || a($$2, D);
         }
      }
   }

   private dfl a(dfl $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eii $$5) {
      return $$0.a(c, this.a($$1, $$5, E)).a(b, this.a($$2, $$5, H)).a(d, this.a($$3, $$5, F)).a(e, this.a($$4, $$5, G));
   }

   private dgx a(boolean $$0, eii $$1, eii $$2) {
      if ($$0) {
         return a($$1, $$2) ? dgx.c : dgx.b;
      } else {
         return dgx.a;
      }
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(f) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dfl $$0, cpd $$1, gw $$2) {
      return !$$0.c(f);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, c, b, e, d, f);
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      switch ($$1) {
         case c:
            return $$0.a(c, $$0.c(d)).a(b, $$0.c(e)).a(d, $$0.c(c)).a(e, $$0.c(b));
         case d:
            return $$0.a(c, $$0.c(b)).a(b, $$0.c(d)).a(d, $$0.c(e)).a(e, $$0.c(c));
         case b:
            return $$0.a(c, $$0.c(e)).a(b, $$0.c(c)).a(d, $$0.c(b)).a(e, $$0.c(d));
         default:
            return $$0;
      }
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      switch ($$1) {
         case b:
            return $$0.a(c, $$0.c(d)).a(d, $$0.c(c));
         case c:
            return $$0.a(b, $$0.c(e)).a(e, $$0.c(b));
         default:
            return super.a($$0, $$1);
      }
   }
}
