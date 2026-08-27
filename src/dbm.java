import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dbm extends csq implements czr {
   public static final dfv a = dfu.J;
   public static final dgc<dgq> b = dfu.W;
   public static final dgc<dgq> c = dfu.X;
   public static final dgc<dgq> d = dfu.Y;
   public static final dgc<dgq> e = dfu.Z;
   public static final dfv f = dfu.C;
   private final Map<dfe, eib> g;
   private final Map<dfe, eib> h;
   private static final int i = 3;
   private static final int j = 14;
   private static final int k = 4;
   private static final int l = 1;
   private static final int m = 7;
   private static final int n = 9;
   private static final eib D = csq.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eib E = csq.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eib F = csq.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eib G = csq.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eib H = csq.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public dbm(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)).a(c, dgq.a).a(b, dgq.a).a(d, dgq.a).a(e, dgq.a).a(f, Boolean.valueOf(false)));
      this.g = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.h = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eib a(eib $$0, dgq $$1, eib $$2, eib $$3) {
      if ($$1 == dgq.c) {
         return ehy.a($$0, $$3);
      } else {
         return $$1 == dgq.b ? ehy.a($$0, $$2) : $$0;
      }
   }

   private Map<dfe, eib> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eib $$10 = csq.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eib $$11 = csq.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eib $$12 = csq.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eib $$13 = csq.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eib $$14 = csq.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eib $$15 = csq.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eib $$16 = csq.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eib $$17 = csq.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eib $$18 = csq.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dfe, eib> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : a.a()) {
         for (dgq $$21 : b.a()) {
            for (dgq $$22 : c.a()) {
               for (dgq $$23 : e.a()) {
                  for (dgq $$24 : d.a()) {
                     eib $$25 = ehy.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ehy.a($$25, $$10);
                     }

                     dfe $$26 = this.n().a(a, $$20).a(b, $$21).a(e, $$23).a(c, $$22).a(d, $$24);
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
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.g.get($$0);
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return this.h.get($$0);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   private boolean a(dfe $$0, boolean $$1, hc $$2) {
      csq $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cvl && cvl.a($$0, $$2);
      return $$0.a(apo.L) || !j($$0) && $$1 || $$3 instanceof cwo || $$4;
   }

   @Override
   public dfe a(cli $$0) {
      cpt $$1 = $$0.q();
      gw $$2 = $$0.a();
      eah $$3 = $$0.q().b_($$0.a());
      gw $$4 = $$2.e();
      gw $$5 = $$2.h();
      gw $$6 = $$2.f();
      gw $$7 = $$2.g();
      gw $$8 = $$2.c();
      dfe $$9 = $$1.a_($$4);
      dfe $$10 = $$1.a_($$5);
      dfe $$11 = $$1.a_($$6);
      dfe $$12 = $$1.a_($$7);
      dfe $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, hc.d), hc.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, hc.e), hc.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, hc.c), hc.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, hc.f), hc.f);
      dfe $$18 = this.n().a(f, Boolean.valueOf($$3.a() == eai.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      if ($$1 == hc.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == hc.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dfe $$0, dgh<dgq> $$1) {
      return $$0.c($$1) != dgq.a;
   }

   private static boolean a(eib $$0, eib $$1) {
      return !ehy.c($$1, $$0, ehm.e);
   }

   private dfe a(cpt $$0, dfe $$1, gw $$2, dfe $$3) {
      boolean $$4 = a($$1, c);
      boolean $$5 = a($$1, b);
      boolean $$6 = a($$1, d);
      boolean $$7 = a($$1, e);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dfe a(cpt $$0, gw $$1, dfe $$2, gw $$3, dfe $$4, hc $$5) {
      hc $$6 = $$5.g();
      boolean $$7 = $$5 == hc.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$8 = $$5 == hc.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, b);
      boolean $$9 = $$5 == hc.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$10 = $$5 == hc.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      gw $$11 = $$1.c();
      dfe $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dfe a(cpt $$0, dfe $$1, gw $$2, dfe $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eib $$8 = $$3.k($$0, $$2).a(hc.a);
      dfe $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(a, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dfe $$0, dfe $$1, eib $$2) {
      boolean $$3 = $$1.b() instanceof dbm && $$1.c(a);
      if ($$3) {
         return true;
      } else {
         dgq $$4 = $$0.c(c);
         dgq $$5 = $$0.c(d);
         dgq $$6 = $$0.c(b);
         dgq $$7 = $$0.c(e);
         boolean $$8 = $$5 == dgq.a;
         boolean $$9 = $$7 == dgq.a;
         boolean $$10 = $$6 == dgq.a;
         boolean $$11 = $$4 == dgq.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dgq.c && $$5 == dgq.c || $$6 == dgq.c && $$7 == dgq.c;
            return $$13 ? false : $$1.a(apo.aN) || a($$2, D);
         }
      }
   }

   private dfe a(dfe $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eib $$5) {
      return $$0.a(c, this.a($$1, $$5, E)).a(b, this.a($$2, $$5, H)).a(d, this.a($$3, $$5, F)).a(e, this.a($$4, $$5, G));
   }

   private dgq a(boolean $$0, eib $$1, eib $$2) {
      if ($$0) {
         return a($$1, $$2) ? dgq.c : dgq.b;
      } else {
         return dgq.a;
      }
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(f) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dfe $$0, cow $$1, gw $$2) {
      return !$$0.c(f);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, c, b, e, d, f);
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
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
   public dfe a(dfe $$0, cxl $$1) {
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
