import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doz extends djy {
   public static final MapCodec<doz> a = b(doz::new);
   public static final dys<jm> b = dok.aF;
   public static final dym c = dyl.x;
   public static final dym d = dyl.o;
   public static final fcs e = dkm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fcs f = dkm.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fcs g = fcp.a(e, f);
   public static final fcs h = dkm.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fcs i = fcp.a(g, h);
   public static final fcs j = fcp.a(
      dkm.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dkm.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dkm.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fcs k = fcp.a(
      dkm.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dkm.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dkm.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fcs l = fcp.a(
      dkm.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dkm.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dkm.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fcs m = fcp.a(
      dkm.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dkm.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dkm.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   protected doz(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.c;
   }

   @Override
   protected fcs d_(dxv $$0) {
      return g;
   }

   @Override
   protected boolean g_(dxv $$0) {
      return true;
   }

   @Override
   public dxv a(dbg $$0) {
      dhi $$1 = $$0.q();
      cxp $$2 = $$0.n();
      cpx $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gG()) {
         czy $$5 = $$2.a(ku.Y, czy.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fcs b(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return i;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      switch ((jm)$$0.c(b)) {
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
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dwc($$0, $$1);
   }

   public static boolean a(@Nullable bwg $$0, dhi $$1, jh $$2, dxv $$3, cxp $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bwg $$0, dhi $$1, jh $$2, dxv $$3, cxp $$4) {
      if ($$1.c_($$2) instanceof dwc $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, axf.cz, axg.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bvk $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      dxv $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(ecr.c, $$2, ecr.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dhi $$0, jh $$1, dxv $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dhi $$0, jh $$1, dxv $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dhi $$0, jh $$1, dxv $$2) {
      evf $$3 = evb.a($$0, $$2.c(b).g(), jm.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dxv $$0, dhi $$1, jh $$2, dxv $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(c)) {
            b($$1, $$2, $$0);
         }
      }
   }

   private void e(dxv $$0, dhi $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dwc $$4) {
         jm $$5 = $$0.c(b);
         cxp $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         cmb $$9 = new cmb($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.s();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dxv $$0, dgn $$1, jh $$2, jm $$3) {
      return $$3 == jm.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dxv $$0) {
      return true;
   }

   @Override
   protected int a(dxv $$0, dhi $$1, jh $$2) {
      if ($$0.c(d)) {
         dux $$3 = $$1.c_($$2);
         if ($$3 instanceof dwc) {
            return ((dwc)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected btj a(cxp $$0, dxv $$1, dhi $$2, jh $$3, cpx $$4, bti $$5, fbu $$6) {
      if ($$1.c(d)) {
         return btj.f;
      } else if ($$0.a(ayd.ba)) {
         return (btj)(a($$4, $$2, $$3, $$1, $$0) ? btj.a : btj.e);
      } else {
         return (btj)($$0.f() && $$5 == bti.a ? btj.e : btj.f);
      }
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return btj.a;
      } else {
         return btj.c;
      }
   }

   @Nullable
   @Override
   protected btl b(dxv $$0, dhi $$1, jh $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dhi $$0, jh $$1, cpx $$2) {
      dux $$3 = $$0.c_($$1);
      if ($$3 instanceof dwc) {
         $$2.a((dwc)$$3);
         $$2.a(axp.au);
      }
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
