import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dbi extends csm implements czn {
   public static final dfr a = dfq.J;
   public static final dfy<dgm> b = dfq.W;
   public static final dfy<dgm> c = dfq.X;
   public static final dfy<dgm> d = dfq.Y;
   public static final dfy<dgm> e = dfq.Z;
   public static final dfr f = dfq.C;
   private final Map<dfa, ehx> g;
   private final Map<dfa, ehx> h;
   private static final int i = 3;
   private static final int j = 14;
   private static final int k = 4;
   private static final int l = 1;
   private static final int m = 7;
   private static final int n = 9;
   private static final ehx D = csm.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ehx E = csm.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ehx F = csm.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ehx G = csm.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ehx H = csm.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public dbi(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)).a(c, dgm.a).a(b, dgm.a).a(d, dgm.a).a(e, dgm.a).a(f, Boolean.valueOf(false)));
      this.g = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.h = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ehx a(ehx $$0, dgm $$1, ehx $$2, ehx $$3) {
      if ($$1 == dgm.c) {
         return ehu.a($$0, $$3);
      } else {
         return $$1 == dgm.b ? ehu.a($$0, $$2) : $$0;
      }
   }

   private Map<dfa, ehx> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ehx $$10 = csm.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ehx $$11 = csm.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ehx $$12 = csm.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ehx $$13 = csm.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ehx $$14 = csm.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ehx $$15 = csm.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ehx $$16 = csm.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ehx $$17 = csm.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ehx $$18 = csm.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dfa, ehx> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : a.a()) {
         for (dgm $$21 : b.a()) {
            for (dgm $$22 : c.a()) {
               for (dgm $$23 : e.a()) {
                  for (dgm $$24 : d.a()) {
                     ehx $$25 = ehu.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ehu.a($$25, $$10);
                     }

                     dfa $$26 = this.n().a(a, $$20).a(b, $$21).a(e, $$23).a(c, $$22).a(d, $$24);
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
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.g.get($$0);
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return this.h.get($$0);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }

   private boolean a(dfa $$0, boolean $$1, ha $$2) {
      csm $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cvh && cvh.a($$0, $$2);
      return $$0.a(apl.L) || !j($$0) && $$1 || $$3 instanceof cwk || $$4;
   }

   @Override
   public dfa a(clg $$0) {
      cpp $$1 = $$0.q();
      gu $$2 = $$0.a();
      ead $$3 = $$0.q().b_($$0.a());
      gu $$4 = $$2.e();
      gu $$5 = $$2.h();
      gu $$6 = $$2.f();
      gu $$7 = $$2.g();
      gu $$8 = $$2.c();
      dfa $$9 = $$1.a_($$4);
      dfa $$10 = $$1.a_($$5);
      dfa $$11 = $$1.a_($$6);
      dfa $$12 = $$1.a_($$7);
      dfa $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, ha.d), ha.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, ha.e), ha.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, ha.c), ha.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, ha.f), ha.f);
      dfa $$18 = this.n().a(f, Boolean.valueOf($$3.a() == eae.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      if ($$1 == ha.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == ha.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dfa $$0, dgd<dgm> $$1) {
      return $$0.c($$1) != dgm.a;
   }

   private static boolean a(ehx $$0, ehx $$1) {
      return !ehu.c($$1, $$0, ehi.e);
   }

   private dfa a(cpp $$0, dfa $$1, gu $$2, dfa $$3) {
      boolean $$4 = a($$1, c);
      boolean $$5 = a($$1, b);
      boolean $$6 = a($$1, d);
      boolean $$7 = a($$1, e);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dfa a(cpp $$0, gu $$1, dfa $$2, gu $$3, dfa $$4, ha $$5) {
      ha $$6 = $$5.g();
      boolean $$7 = $$5 == ha.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$8 = $$5 == ha.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, b);
      boolean $$9 = $$5 == ha.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$10 = $$5 == ha.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      gu $$11 = $$1.c();
      dfa $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dfa a(cpp $$0, dfa $$1, gu $$2, dfa $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ehx $$8 = $$3.k($$0, $$2).a(ha.a);
      dfa $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(a, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dfa $$0, dfa $$1, ehx $$2) {
      boolean $$3 = $$1.b() instanceof dbi && $$1.c(a);
      if ($$3) {
         return true;
      } else {
         dgm $$4 = $$0.c(c);
         dgm $$5 = $$0.c(d);
         dgm $$6 = $$0.c(b);
         dgm $$7 = $$0.c(e);
         boolean $$8 = $$5 == dgm.a;
         boolean $$9 = $$7 == dgm.a;
         boolean $$10 = $$6 == dgm.a;
         boolean $$11 = $$4 == dgm.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dgm.c && $$5 == dgm.c || $$6 == dgm.c && $$7 == dgm.c;
            return $$13 ? false : $$1.a(apl.aN) || a($$2, D);
         }
      }
   }

   private dfa a(dfa $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ehx $$5) {
      return $$0.a(c, this.a($$1, $$5, E)).a(b, this.a($$2, $$5, H)).a(d, this.a($$3, $$5, F)).a(e, this.a($$4, $$5, G));
   }

   private dgm a(boolean $$0, ehx $$1, ehx $$2) {
      if ($$0) {
         return a($$1, $$2) ? dgm.c : dgm.b;
      } else {
         return dgm.a;
      }
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(f) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dfa $$0, cos $$1, gu $$2) {
      return !$$0.c(f);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, c, b, e, d, f);
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
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
   public dfa a(dfa $$0, cxh $$1) {
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
