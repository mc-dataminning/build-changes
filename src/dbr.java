import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dbr extends csv implements czw {
   public static final dga a = dfz.J;
   public static final dgh<dgv> b = dfz.W;
   public static final dgh<dgv> c = dfz.X;
   public static final dgh<dgv> d = dfz.Y;
   public static final dgh<dgv> e = dfz.Z;
   public static final dga f = dfz.C;
   private final Map<dfj, eig> g;
   private final Map<dfj, eig> h;
   private static final int i = 3;
   private static final int j = 14;
   private static final int k = 4;
   private static final int l = 1;
   private static final int m = 7;
   private static final int n = 9;
   private static final eig D = csv.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eig E = csv.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final eig F = csv.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final eig G = csv.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final eig H = csv.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public dbr(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)).a(c, dgv.a).a(b, dgv.a).a(d, dgv.a).a(e, dgv.a).a(f, Boolean.valueOf(false)));
      this.g = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.h = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static eig a(eig $$0, dgv $$1, eig $$2, eig $$3) {
      if ($$1 == dgv.c) {
         return eid.a($$0, $$3);
      } else {
         return $$1 == dgv.b ? eid.a($$0, $$2) : $$0;
      }
   }

   private Map<dfj, eig> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      eig $$10 = csv.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      eig $$11 = csv.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      eig $$12 = csv.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      eig $$13 = csv.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      eig $$14 = csv.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      eig $$15 = csv.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      eig $$16 = csv.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      eig $$17 = csv.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      eig $$18 = csv.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dfj, eig> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : a.a()) {
         for (dgv $$21 : b.a()) {
            for (dgv $$22 : c.a()) {
               for (dgv $$23 : e.a()) {
                  for (dgv $$24 : d.a()) {
                     eig $$25 = eid.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = eid.a($$25, $$10);
                     }

                     dfj $$26 = this.n().a(a, $$20).a(b, $$21).a(e, $$23).a(c, $$22).a(d, $$24);
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
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.g.get($$0);
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return this.h.get($$0);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }

   private boolean a(dfj $$0, boolean $$1, ha $$2) {
      csv $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cvq && cvq.a($$0, $$2);
      return $$0.a(aps.L) || !j($$0) && $$1 || $$3 instanceof cwt || $$4;
   }

   @Override
   public dfj a(cln $$0) {
      cpy $$1 = $$0.q();
      gw $$2 = $$0.a();
      eam $$3 = $$0.q().b_($$0.a());
      gw $$4 = $$2.e();
      gw $$5 = $$2.h();
      gw $$6 = $$2.f();
      gw $$7 = $$2.g();
      gw $$8 = $$2.c();
      dfj $$9 = $$1.a_($$4);
      dfj $$10 = $$1.a_($$5);
      dfj $$11 = $$1.a_($$6);
      dfj $$12 = $$1.a_($$7);
      dfj $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ha.d), ha.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ha.e), ha.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ha.c), ha.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ha.f), ha.f);
      dfj $$18 = this.n().a(f, Boolean.valueOf($$3.a() == ean.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      if ($$1 == ha.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ha.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dfj $$0, dgm<dgv> $$1) {
      return $$0.c($$1) != dgv.a;
   }

   private static boolean a(eig $$0, eig $$1) {
      return !eid.c($$1, $$0, ehr.e);
   }

   private dfj a(cpy $$0, dfj $$1, gw $$2, dfj $$3) {
      boolean $$4 = a($$1, c);
      boolean $$5 = a($$1, b);
      boolean $$6 = a($$1, d);
      boolean $$7 = a($$1, e);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dfj a(cpy $$0, gw $$1, dfj $$2, gw $$3, dfj $$4, ha $$5) {
      ha $$6 = $$5.g();
      boolean $$7 = $$5 == ha.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$8 = $$5 == ha.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, b);
      boolean $$9 = $$5 == ha.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$10 = $$5 == ha.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      gw $$11 = $$1.c();
      dfj $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dfj a(cpy $$0, dfj $$1, gw $$2, dfj $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      eig $$8 = $$3.k($$0, $$2).a(ha.a);
      dfj $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(a, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dfj $$0, dfj $$1, eig $$2) {
      boolean $$3 = $$1.b() instanceof dbr && $$1.c(a);
      if ($$3) {
         return true;
      } else {
         dgv $$4 = $$0.c(c);
         dgv $$5 = $$0.c(d);
         dgv $$6 = $$0.c(b);
         dgv $$7 = $$0.c(e);
         boolean $$8 = $$5 == dgv.a;
         boolean $$9 = $$7 == dgv.a;
         boolean $$10 = $$6 == dgv.a;
         boolean $$11 = $$4 == dgv.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dgv.c && $$5 == dgv.c || $$6 == dgv.c && $$7 == dgv.c;
            return $$13 ? false : $$1.a(aps.aN) || a($$2, D);
         }
      }
   }

   private dfj a(dfj $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, eig $$5) {
      return $$0.a(c, this.a($$1, $$5, E)).a(b, this.a($$2, $$5, H)).a(d, this.a($$3, $$5, F)).a(e, this.a($$4, $$5, G));
   }

   private dgv a(boolean $$0, eig $$1, eig $$2) {
      if ($$0) {
         return a($$1, $$2) ? dgv.c : dgv.b;
      } else {
         return dgv.a;
      }
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(f) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dfj $$0, cpb $$1, gw $$2) {
      return !$$0.c(f);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, c, b, e, d, f);
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
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
   public dfj a(dfj $$0, cxq $$1) {
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
