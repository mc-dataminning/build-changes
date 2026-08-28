import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Map;

public class dof extends dfh implements dmi {
   public static final MapCodec<dof> a = b(dof::new);
   public static final dtb b = dta.J;
   public static final dti<dtw> c = dta.W;
   public static final dti<dtw> d = dta.X;
   public static final dti<dtw> e = dta.Y;
   public static final dti<dtw> f = dta.Z;
   public static final dtb g = dta.C;
   private final Map<dsk, ewy> h;
   private final Map<dsk, ewy> i;
   private static final int j = 3;
   private static final int k = 14;
   private static final int l = 4;
   private static final int m = 1;
   private static final int n = 7;
   private static final int o = 9;
   private static final ewy F = dfh.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewy G = dfh.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ewy H = dfh.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ewy I = dfh.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ewy J = dfh.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   @Override
   public MapCodec<dof> a() {
      return a;
   }

   public dof(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)).a(d, dtw.a).a(c, dtw.a).a(e, dtw.a).a(f, dtw.a).a(g, Boolean.valueOf(false)));
      this.h = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.i = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ewy a(ewy $$0, dtw $$1, ewy $$2, ewy $$3) {
      if ($$1 == dtw.c) {
         return ewv.a($$0, $$3);
      } else {
         return $$1 == dtw.b ? ewv.a($$0, $$2) : $$0;
      }
   }

   private Map<dsk, ewy> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ewy $$10 = dfh.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ewy $$11 = dfh.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ewy $$12 = dfh.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ewy $$13 = dfh.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ewy $$14 = dfh.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ewy $$15 = dfh.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ewy $$16 = dfh.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ewy $$17 = dfh.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ewy $$18 = dfh.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dsk, ewy> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : b.a()) {
         for (dtw $$21 : c.a()) {
            for (dtw $$22 : d.a()) {
               for (dtw $$23 : f.a()) {
                  for (dtw $$24 : e.a()) {
                     ewy $$25 = ewv.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ewv.a($$25, $$10);
                     }

                     dsk $$26 = this.o().a(b, $$20).a(c, $$21).a(f, $$23).a(d, $$22).a(e, $$24);
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
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.h.get($$0);
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.i.get($$0);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   private boolean a(dsk $$0, boolean $$1, jf $$2) {
      dfh $$3 = $$0.b();
      boolean $$4 = $$3 instanceof dig && dig.a($$0, $$2);
      return $$0.a(avw.L) || !j($$0) && $$1 || $$3 instanceof dji || $$4;
   }

   @Override
   public dsk a(cxm $$0) {
      dci $$1 = $$0.q();
      ja $$2 = $$0.a();
      eoh $$3 = $$0.q().b_($$0.a());
      ja $$4 = $$2.e();
      ja $$5 = $$2.h();
      ja $$6 = $$2.f();
      ja $$7 = $$2.g();
      ja $$8 = $$2.c();
      dsk $$9 = $$1.a_($$4);
      dsk $$10 = $$1.a_($$5);
      dsk $$11 = $$1.a_($$6);
      dsk $$12 = $$1.a_($$7);
      dsk $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, jf.d), jf.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, jf.e), jf.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, jf.c), jf.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, jf.f), jf.f);
      dsk $$18 = this.o().a(g, Boolean.valueOf($$3.a() == eoi.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      if ($$1 == jf.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == jf.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dsk $$0, dtn<dtw> $$1) {
      return $$0.c($$1) != dtw.a;
   }

   private static boolean a(ewy $$0, ewy $$1) {
      return !ewv.c($$1, $$0, ewj.e);
   }

   private dsk a(dci $$0, dsk $$1, ja $$2, dsk $$3) {
      boolean $$4 = a($$1, d);
      boolean $$5 = a($$1, c);
      boolean $$6 = a($$1, e);
      boolean $$7 = a($$1, f);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dsk a(dci $$0, ja $$1, dsk $$2, ja $$3, dsk $$4, jf $$5) {
      jf $$6 = $$5.g();
      boolean $$7 = $$5 == jf.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$8 = $$5 == jf.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$9 = $$5 == jf.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      boolean $$10 = $$5 == jf.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, f);
      ja $$11 = $$1.c();
      dsk $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dsk a(dci $$0, dsk $$1, ja $$2, dsk $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ewy $$8 = $$3.k($$0, $$2).a(jf.a);
      dsk $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(b, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dsk $$0, dsk $$1, ewy $$2) {
      boolean $$3 = $$1.b() instanceof dof && $$1.c(b);
      if ($$3) {
         return true;
      } else {
         dtw $$4 = $$0.c(d);
         dtw $$5 = $$0.c(e);
         dtw $$6 = $$0.c(c);
         dtw $$7 = $$0.c(f);
         boolean $$8 = $$5 == dtw.a;
         boolean $$9 = $$7 == dtw.a;
         boolean $$10 = $$6 == dtw.a;
         boolean $$11 = $$4 == dtw.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dtw.c && $$5 == dtw.c || $$6 == dtw.c && $$7 == dtw.c;
            return $$13 ? false : $$1.a(avw.aO) || a($$2, F);
         }
      }
   }

   private dsk a(dsk $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ewy $$5) {
      return $$0.a(d, this.a($$1, $$5, G)).a(c, this.a($$2, $$5, J)).a(e, this.a($$3, $$5, H)).a(f, this.a($$4, $$5, I));
   }

   private dtw a(boolean $$0, ewy $$1, ewy $$2) {
      if ($$0) {
         return a($$1, $$2) ? dtw.c : dtw.b;
      } else {
         return dtw.a;
      }
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(g) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a_(dsk $$0, dbl $$1, ja $$2) {
      return !$$0.c(g);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, d, c, f, e, g);
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
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
   protected dsk a(dsk $$0, dke $$1) {
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
