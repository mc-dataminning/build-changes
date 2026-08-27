import java.util.List;
import javax.annotation.Nullable;

public class bys extends bzj {
   @Nullable
   private bve e;

   public bys(bik<? extends bys> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new bys.b());
      this.bO.a(2, new boz<>(this, cbl.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new bys.c());
      this.bO.a(5, new bys.a());
      this.bO.a(6, new bys.d());
      this.bO.a(8, new bqp(this, 0.6));
      this.bO.a(9, new bqa(this, cbl.class, 3.0F, 1.0F));
      this.bO.a(10, new bqa(this, biy.class, 8.0F));
      this.bP.a(1, new brk(this, cct.class).a());
      this.bP.a(2, new brl<>(this, cbl.class, true).c(300));
      this.bP.a(3, new brl<>(this, cat.class, false).c(300));
      this.bP.a(3, new brl<>(this, buu.class, false));
   }

   public static bkc.a q() {
      return byz.gf().a(bkd.d, 0.5).a(bkd.b, 12.0).a(bkd.a, 24.0);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
   }

   @Override
   public aot Y_() {
      return aou.hs;
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
   }

   @Override
   protected void V() {
      super.V();
   }

   @Override
   public boolean s(big $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof bzn) {
         return this.s(((bzn)$$0).q());
      } else {
         return $$0 instanceof biw && ((biw)$$0).eQ() == bjb.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aot r() {
      return aou.hq;
   }

   @Override
   protected aot h_() {
      return aou.ht;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.hv;
   }

   void a(@Nullable bve $$0) {
      this.e = $$0;
   }

   @Nullable
   bve gs() {
      return this.e;
   }

   @Override
   protected aot fZ() {
      return aou.hr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends bzj.c {
      @Override
      protected int h() {
         return 40;
      }

      @Override
      protected int i() {
         return 100;
      }

      @Override
      protected void k() {
         biw $$0 = bys.this.j();
         double $$1 = Math.min($$0.dr(), bys.this.dr());
         double $$2 = Math.max($$0.dr(), bys.this.dr()) + 1.0;
         float $$3 = (float)aro.d($$0.dv() - bys.this.dv(), $$0.dp() - bys.this.dp());
         if (bys.this.f((big)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(bys.this.dp() + (double)aro.b($$5) * 1.5, bys.this.dv() + (double)aro.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(bys.this.dp() + (double)aro.b($$7) * 2.5, bys.this.dv() + (double)aro.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(bys.this.dp() + (double)aro.b($$3) * $$9, bys.this.dv() + (double)aro.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         gv $$6 = gv.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            gv $$9 = $$6.d();
            dey $$10 = bys.this.dK().a_($$9);
            if ($$10.d(bys.this.dK(), $$9, hb.b)) {
               if (!bys.this.dK().t($$6)) {
                  dey $$11 = bys.this.dK().a_($$6);
                  ehy $$12 = $$11.k(bys.this.dK(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(hb.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= aro.a($$2) - 1);

         if ($$7) {
            bys.this.dK().b(new cbv(bys.this.dK(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, bys.this));
         }
      }

      @Override
      protected aot l() {
         return aou.hw;
      }

      @Override
      protected bzj.a m() {
         return bzj.a.c;
      }
   }

   class b extends bzj.b {
      @Override
      public void e() {
         if (bys.this.j() != null) {
            bys.this.D().a(bys.this.j(), (float)bys.this.X(), (float)bys.this.W());
         } else if (bys.this.gs() != null) {
            bys.this.D().a(bys.this.gs(), (float)bys.this.X(), (float)bys.this.W());
         }
      }
   }

   class c extends bzj.c {
      private final btj e = btj.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = bys.this.dK().a(bzn.class, this.e, bys.this, bys.this.cG().g(16.0)).size();
            return bys.this.ag.a(8) + 1 > $$0;
         }
      }

      @Override
      protected int h() {
         return 100;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         aki $$0 = (aki)bys.this.dK();

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gv $$2 = bys.this.dk().b(-2 + bys.this.ag.a(5), 1, -2 + bys.this.ag.a(5));
            bzn $$3 = bik.be.a(bys.this.dK());
            if ($$3 != null) {
               $$3.a($$2, 0.0F, 0.0F);
               $$3.a($$0, bys.this.dK().d_($$2), bja.f, null, null);
               $$3.a(bys.this);
               $$3.i($$2);
               $$3.b(20 * (30 + bys.this.ag.a(90)));
               $$0.a_($$3);
            }
         }
      }

      @Override
      protected aot l() {
         return aou.hx;
      }

      @Override
      protected bzj.a m() {
         return bzj.a.b;
      }
   }

   public class d extends bzj.c {
      private final btj e = btj.b().a(16.0).a($$0x -> ((bve)$$0x).q() == chk.l);

      @Override
      public boolean a() {
         if (bys.this.j() != null) {
            return false;
         } else if (bys.this.gj()) {
            return false;
         } else if (bys.this.ah < this.c) {
            return false;
         } else if (!bys.this.dK().X().b(cpg.c)) {
            return false;
         } else {
            List<bve> $$0 = bys.this.dK().a(bve.class, this.e, bys.this, bys.this.cG().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               bys.this.a($$0.get(bys.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return bys.this.gs() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         bys.this.a(null);
      }

      @Override
      protected void k() {
         bve $$0 = bys.this.gs();
         if ($$0 != null && $$0.bv()) {
            $$0.b(chk.o);
         }
      }

      @Override
      protected int n() {
         return 40;
      }

      @Override
      protected int h() {
         return 60;
      }

      @Override
      protected int i() {
         return 140;
      }

      @Override
      protected aot l() {
         return aou.hy;
      }

      @Override
      protected bzj.a m() {
         return bzj.a.d;
      }
   }
}
