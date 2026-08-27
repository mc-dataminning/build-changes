import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcy extends cya {
   public static final MapCodec<dcy> a = b(dcy::new);
   public static final dlz b = dcj.aE;
   public static final dlw c = dlv.w;
   public static final dlw d = dlv.o;
   public static final eol e = cyo.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final eol f = cyo.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final eol g = eoi.a(e, f);
   public static final eol h = cyo.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final eol i = eoi.a(g, h);
   public static final eol j = eoi.a(
      cyo.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), cyo.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), cyo.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final eol k = eoi.a(
      cyo.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), cyo.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), cyo.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final eol l = eoi.a(
      cyo.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), cyo.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), cyo.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final eol m = eoi.a(
      cyo.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), cyo.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), cyo.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dcy> a() {
      return a;
   }

   protected dcy(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ie.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected det b_(dlf $$0) {
      return det.c;
   }

   @Override
   protected eol f(dlf $$0, cut $$1, hz $$2) {
      return g;
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   public dlf a(crg $$0) {
      cvn $$1 = $$0.q();
      coz $$2 = $$0.n();
      chh $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gq()) {
         sw $$5 = cms.a($$2);
         if ($$5 != null && $$5.e("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected eol b(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return i;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      switch ((ie)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djv($$0, $$1);
   }

   public static boolean a(@Nullable bno $$0, cvn $$1, hz $$2, dlf $$3, coz $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bno $$0, cvn $$1, hz $$2, dlf $$3, coz $$4) {
      if ($$1.c_($$2) instanceof djv $$6) {
         $$6.a($$4.a(1));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, atk.cr, atl.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bno $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      dlf $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dpp.c, $$2, dpp.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(cvn $$0, hz $$1, dlf $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(cvn $$0, hz $$1, dlf $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(cvn $$0, hz $$1, dlf $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dlf $$0, cvn $$1, hz $$2) {
      if ($$1.c_($$2) instanceof djv $$4) {
         ie $$5 = $$0.c(b);
         coz $$6 = $$4.c().q();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cds $$9 = new cds($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.u();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$3 == ie.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean d_(dlf $$0) {
      return true;
   }

   @Override
   protected int a(dlf $$0, cvn $$1, hz $$2) {
      if ($$0.c(d)) {
         dit $$3 = $$1.c_($$2);
         if ($$3 instanceof djv) {
            return ((djv)$$3).k();
         }
      }

      return 0;
   }

   @Override
   protected blw a(coz $$0, dlf $$1, cvn $$2, hz $$3, chh $$4, blt $$5, eno $$6) {
      if ($$1.c(d)) {
         return blw.d;
      } else if ($$0.a(auh.au)) {
         return a($$4, $$2, $$3, $$1, $$0) ? blw.a($$2.B) : blw.e;
      } else {
         return $$0.b() && $$5 == blt.a ? blw.e : blw.d;
      }
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return blu.a($$1.B);
      } else {
         return blu.b;
      }
   }

   @Nullable
   @Override
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(cvn $$0, hz $$1, chh $$2) {
      dit $$3 = $$0.c_($$1);
      if ($$3 instanceof djv) {
         $$2.a((djv)$$3);
         $$2.a(atu.au);
      }
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
