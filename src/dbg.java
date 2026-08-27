import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class dbg extends csk implements czl {
   public static final dfp a = dfo.J;
   public static final dfw<dgk> b = dfo.W;
   public static final dfw<dgk> c = dfo.X;
   public static final dfw<dgk> d = dfo.Y;
   public static final dfw<dgk> e = dfo.Z;
   public static final dfp f = dfo.C;
   private final Map<dey, ehy> g;
   private final Map<dey, ehy> h;
   private static final int i = 3;
   private static final int j = 14;
   private static final int k = 4;
   private static final int l = 1;
   private static final int m = 7;
   private static final int n = 9;
   private static final ehy D = csk.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ehy E = csk.a(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final ehy F = csk.a(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final ehy G = csk.a(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final ehy H = csk.a(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public dbg(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)).a(c, dgk.a).a(b, dgk.a).a(d, dgk.a).a(e, dgk.a).a(f, Boolean.valueOf(false)));
      this.g = this.a(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.h = this.a(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private static ehy a(ehy $$0, dgk $$1, ehy $$2, ehy $$3) {
      if ($$1 == dgk.c) {
         return ehv.a($$0, $$3);
      } else {
         return $$1 == dgk.b ? ehv.a($$0, $$2) : $$0;
      }
   }

   private Map<dey, ehy> a(float $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = 8.0F - $$0;
      float $$7 = 8.0F + $$0;
      float $$8 = 8.0F - $$1;
      float $$9 = 8.0F + $$1;
      ehy $$10 = csk.a((double)$$6, 0.0, (double)$$6, (double)$$7, (double)$$2, (double)$$7);
      ehy $$11 = csk.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$4, (double)$$9);
      ehy $$12 = csk.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$4, 16.0);
      ehy $$13 = csk.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$4, (double)$$9);
      ehy $$14 = csk.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$4, (double)$$9);
      ehy $$15 = csk.a((double)$$8, (double)$$3, 0.0, (double)$$9, (double)$$5, (double)$$9);
      ehy $$16 = csk.a((double)$$8, (double)$$3, (double)$$8, (double)$$9, (double)$$5, 16.0);
      ehy $$17 = csk.a(0.0, (double)$$3, (double)$$8, (double)$$9, (double)$$5, (double)$$9);
      ehy $$18 = csk.a((double)$$8, (double)$$3, (double)$$8, 16.0, (double)$$5, (double)$$9);
      Builder<dey, ehy> $$19 = ImmutableMap.builder();

      for (Boolean $$20 : a.a()) {
         for (dgk $$21 : b.a()) {
            for (dgk $$22 : c.a()) {
               for (dgk $$23 : e.a()) {
                  for (dgk $$24 : d.a()) {
                     ehy $$25 = ehv.a();
                     $$25 = a($$25, $$21, $$14, $$18);
                     $$25 = a($$25, $$23, $$13, $$17);
                     $$25 = a($$25, $$22, $$11, $$15);
                     $$25 = a($$25, $$24, $$12, $$16);
                     if ($$20) {
                        $$25 = ehv.a($$25, $$10);
                     }

                     dey $$26 = this.n().a(a, $$20).a(b, $$21).a(e, $$23).a(c, $$22).a(d, $$24);
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
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.g.get($$0);
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.h.get($$0);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   private boolean a(dey $$0, boolean $$1, hb $$2) {
      csk $$3 = $$0.b();
      boolean $$4 = $$3 instanceof cvf && cvf.a($$0, $$2);
      return $$0.a(apj.L) || !j($$0) && $$1 || $$3 instanceof cwi || $$4;
   }

   @Override
   public dey a(cle $$0) {
      cpn $$1 = $$0.q();
      gv $$2 = $$0.a();
      eab $$3 = $$0.q().b_($$0.a());
      gv $$4 = $$2.e();
      gv $$5 = $$2.h();
      gv $$6 = $$2.f();
      gv $$7 = $$2.g();
      gv $$8 = $$2.c();
      dey $$9 = $$1.a_($$4);
      dey $$10 = $$1.a_($$5);
      dey $$11 = $$1.a_($$6);
      dey $$12 = $$1.a_($$7);
      dey $$13 = $$1.a_($$8);
      boolean $$14 = this.a($$9, $$9.d($$1, $$4, hb.d), hb.d);
      boolean $$15 = this.a($$10, $$10.d($$1, $$5, hb.e), hb.e);
      boolean $$16 = this.a($$11, $$11.d($$1, $$6, hb.c), hb.c);
      boolean $$17 = this.a($$12, $$12.d($$1, $$7, hb.f), hb.f);
      dey $$18 = this.n().a(f, Boolean.valueOf($$3.a() == eac.c));
      return this.a($$1, $$18, $$8, $$13, $$14, $$15, $$16, $$17);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      if ($$1 == hb.a) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$1 == hb.b ? this.a($$3, $$0, $$5, $$2) : this.a($$3, $$4, $$0, $$5, $$2, $$1);
      }
   }

   private static boolean a(dey $$0, dgb<dgk> $$1) {
      return $$0.c($$1) != dgk.a;
   }

   private static boolean a(ehy $$0, ehy $$1) {
      return !ehv.c($$1, $$0, ehj.e);
   }

   private dey a(cpn $$0, dey $$1, gv $$2, dey $$3) {
      boolean $$4 = a($$1, c);
      boolean $$5 = a($$1, b);
      boolean $$6 = a($$1, d);
      boolean $$7 = a($$1, e);
      return this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private dey a(cpn $$0, gv $$1, dey $$2, gv $$3, dey $$4, hb $$5) {
      hb $$6 = $$5.g();
      boolean $$7 = $$5 == hb.c ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, c);
      boolean $$8 = $$5 == hb.f ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, b);
      boolean $$9 = $$5 == hb.d ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, d);
      boolean $$10 = $$5 == hb.e ? this.a($$4, $$4.d($$0, $$3, $$6), $$6) : a($$2, e);
      gv $$11 = $$1.c();
      dey $$12 = $$0.a_($$11);
      return this.a($$0, $$2, $$11, $$12, $$7, $$8, $$9, $$10);
   }

   private dey a(cpn $$0, dey $$1, gv $$2, dey $$3, boolean $$4, boolean $$5, boolean $$6, boolean $$7) {
      ehy $$8 = $$3.k($$0, $$2).a(hb.a);
      dey $$9 = this.a($$1, $$4, $$5, $$6, $$7, $$8);
      return $$9.a(a, Boolean.valueOf(this.a($$9, $$3, $$8)));
   }

   private boolean a(dey $$0, dey $$1, ehy $$2) {
      boolean $$3 = $$1.b() instanceof dbg && $$1.c(a);
      if ($$3) {
         return true;
      } else {
         dgk $$4 = $$0.c(c);
         dgk $$5 = $$0.c(d);
         dgk $$6 = $$0.c(b);
         dgk $$7 = $$0.c(e);
         boolean $$8 = $$5 == dgk.a;
         boolean $$9 = $$7 == dgk.a;
         boolean $$10 = $$6 == dgk.a;
         boolean $$11 = $$4 == dgk.a;
         boolean $$12 = $$11 && $$8 && $$9 && $$10 || $$11 != $$8 || $$9 != $$10;
         if ($$12) {
            return true;
         } else {
            boolean $$13 = $$4 == dgk.c && $$5 == dgk.c || $$6 == dgk.c && $$7 == dgk.c;
            return $$13 ? false : $$1.a(apj.aN) || a($$2, D);
         }
      }
   }

   private dey a(dey $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4, ehy $$5) {
      return $$0.a(c, this.a($$1, $$5, E)).a(b, this.a($$2, $$5, H)).a(d, this.a($$3, $$5, F)).a(e, this.a($$4, $$5, G));
   }

   private dgk a(boolean $$0, ehy $$1, ehy $$2) {
      if ($$0) {
         return a($$1, $$2) ? dgk.c : dgk.b;
      } else {
         return dgk.a;
      }
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(f) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean c(dey $$0, coq $$1, gv $$2) {
      return !$$0.c(f);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, c, b, e, d, f);
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
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
   public dey a(dey $$0, cxf $$1) {
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
