import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dbh extends csl implements czm {
   public static final dfq a = dfp.J;
   public static final dfx<dgl> b = dfp.W;
   public static final dfx<dgl> c = dfp.X;
   public static final dfx<dgl> d = dfp.Y;
   public static final dfx<dgl> e = dfp.Z;
   public static final dfq f = dfp.C;
   private final Map<dez, ehw> g;
   private final Map<dez, ehw> h;
   private static final int i = 3;
   private static final int j = 14;
   private static final int k = 4;
   private static final int l = 1;
   private static final int m = 7;
   private static final int n = 9;
   private static final ehw D = csl.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ehw E = csl.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ehw F = csl.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ehw G = csl.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ehw H = csl.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public dbh(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)).a(c, dgl.a).a(b, dgl.a).a(d, dgl.a).a(e, dgl.a).a(f, Boolean.valueOf(false)));
      this.g = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.h = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ehw a(ehw $$0, dgl $$1, ehw $$2, ehw $$3) {
      if ($$1 == dgl.c) {
         return eht.a($$0, $$3);
      } else {
         return $$1 == dgl.b ? eht.a($$0, $$2) : $$0;
      }
   }

   private Map<dez, ehw> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ehw $$10 = csl.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ehw $$11 = csl.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ehw $$12 = csl.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ehw $$13 = csl.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ehw $$14 = csl.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ehw $$15 = csl.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ehw $$16 = csl.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ehw $$17 = csl.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ehw $$18 = csl.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dez, ehw> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : a.a()) {
         for (dgl $$21 : b.a()) {
            for (dgl $$22 : c.a()) {
               for (dgl $$23 : e.a()) {
                  for (dgl $$24 : d.a()) {
                     ehw $$25 = eht.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = eht.a($$25, $$10);
                     }

                     dez $$26 = this.n().a(a, $$20).a(b, $$21).a(e, $$23).a(c, $$22).a(d, $$24);
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
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.g.get($$0);
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return this.h.get($$0);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   private boolean a(dez $$0, boolean $$1, ha $$2) {
      csl $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cvg && cvg.a($$0, $$2);
      return $$0.a(apl.L) || !j($$0) && $$1 || $$3 instanceof cwj || $$4;
   }

   @Override
   public dez a(clf $$0) {
      cpo $$1 = $$0.q();
      gu $$2 = $$0.a();
      eac $$3 = $$0.q().b_($$0.a());
      gu $$4 = $$2.e();
      gu $$5 = $$2.h();
      gu $$6 = $$2.f();
      gu $$7 = $$2.g();
      gu $$8 = $$2.c();
      dez $$9 = $$1.a_($$4);
      dez $$10 = $$1.a_($$5);
      dez $$11 = $$1.a_($$6);
      dez $$12 = $$1.a_($$7);
      dez $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ha.d), ha.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ha.e), ha.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ha.c), ha.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ha.f), ha.f);
      dez $$18 = this.n().a(f, Boolean.valueOf($$3.a() == ead.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      if ($$1 == ha.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ha.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dez $$0, dgc<dgl> $$1) {
      return $$0.c($$1) != dgl.a;
   }

   private static boolean a(ehw $$0, ehw $$1) {
      return !eht.c($$1, $$0, ehh.e);
   }

   private dez a(cpo $$0, dez $$1, gu $$2, dez $$3) {
      boolean $$4 = a($$1, c);
      boolean $$5 = a($$1, b);
      boolean $$6 = a($$1, d);
      boolean $$7 = a($$1, e);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dez a(cpo $$0, gu $$1, dez $$2, gu $$3, dez $$4, ha $$5) {
      ha $$6 = $$5.g();
      boolean $$7 = $$5 == ha.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$8 = $$5 == ha.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, b);
      boolean $$9 = $$5 == ha.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$10 = $$5 == ha.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      gu $$11 = $$1.c();
      dez $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dez a(cpo $$0, dez $$1, gu $$2, dez $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ehw $$8 = $$3.k($$0, $$2).a(ha.a);
      dez $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(a, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dez $$0, dez $$1, ehw $$2) {
      boolean $$3 = $$1.b() instanceof dbh && $$1.c(a);
      if ($$3) {
         return true;
      } else {
         dgl $$4 = $$0.c(c);
         dgl $$5 = $$0.c(d);
         dgl $$6 = $$0.c(b);
         dgl $$7 = $$0.c(e);
         boolean $$8 = $$5 == dgl.a;
         boolean $$9 = $$7 == dgl.a;
         boolean $$10 = $$6 == dgl.a;
         boolean $$11 = $$4 == dgl.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dgl.c && $$5 == dgl.c || $$6 == dgl.c && $$7 == dgl.c;
            return $$13 ? false : $$1.a(apl.aN) || a($$2, D);
         }
      }
   }

   private dez a(dez $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ehw $$5) {
      return $$0.a(c, this.a($$1, $$5, E)).a(b, this.a($$2, $$5, H)).a(d, this.a($$3, $$5, F)).a(e, this.a($$4, $$5, G));
   }

   private dgl a(boolean $$0, ehw $$1, ehw $$2) {
      if ($$0) {
         return a($$1, $$2) ? dgl.c : dgl.b;
      } else {
         return dgl.a;
      }
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(f) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dez $$0, cor $$1, gu $$2) {
      return !$$0.c(f);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, c, b, e, d, f);
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
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
   public dez a(dez $$0, cxg $$1) {
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
