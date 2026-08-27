import java.util.List;
import javax.annotation.Nullable;

public class cat extends cbk {
   @Nullable
   private bxf e;

   public cat(bkm<? extends cat> $$0, crs $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new brn(this));
      this.bO.a(1, new cat.b());
      this.bO.a(2, new bra<>(this, cdm.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new cat.c());
      this.bO.a(5, new cat.a());
      this.bO.a(6, new cat.d());
      this.bO.a(8, new bsq(this, 0.6));
      this.bO.a(9, new bsb(this, cdm.class, 3.0F, 1.0F));
      this.bO.a(10, new bsb(this, bla.class, 8.0F));
      this.bP.a(1, new btl(this, ceu.class).a());
      this.bP.a(2, new btm<>(this, cdm.class, true).c(300));
      this.bP.a(3, new btm<>(this, ccu.class, false).c(300));
      this.bP.a(3, new btm<>(this, bwv.class, false));
   }

   public static bmd.a t() {
      return cba.gk().a(bme.m, 0.5).a(bme.g, 12.0).a(bme.l, 24.0);
   }

   @Override
   protected void b_() {
      super.b_();
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
   }

   @Override
   public aqm ad_() {
      return aqn.hw;
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
   }

   @Override
   protected void X() {
      super.X();
   }

   @Override
   public boolean s(bki $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof cbo) {
         return this.s(((cbo)$$0).t());
      } else {
         return $$0 instanceof bky && ((bky)$$0).eR() == bld.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aqm w() {
      return aqn.hu;
   }

   @Override
   protected aqm m_() {
      return aqn.hx;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.hz;
   }

   void a(@Nullable bxf $$0) {
      this.e = $$0;
   }

   @Nullable
   bxf gx() {
      return this.e;
   }

   @Override
   protected aqm ge() {
      return aqn.hv;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends cbk.c {
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
         bky $$0 = cat.this.q();
         double $$1 = Math.min($$0.ds(), cat.this.ds());
         double $$2 = Math.max($$0.ds(), cat.this.ds()) + 1.0;
         float $$3 = (float)ati.d($$0.dw() - cat.this.dw(), $$0.dq() - cat.this.dq());
         if (cat.this.f((bki)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cat.this.dq() + (double)ati.b($$5) * 1.5, cat.this.dw() + (double)ati.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cat.this.dq() + (double)ati.b($$7) * 2.5, cat.this.dw() + (double)ati.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cat.this.dq() + (double)ati.b($$3) * $$9, cat.this.dw() + (double)ati.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         ht $$6 = ht.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            ht $$9 = $$6.d();
            dgw $$10 = cat.this.dL().a_($$9);
            if ($$10.d(cat.this.dL(), $$9, hx.b)) {
               if (!cat.this.dL().t($$6)) {
                  dgw $$11 = cat.this.dL().a_($$6);
                  ekb $$12 = $$11.k(cat.this.dL(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(hx.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= ati.a($$2) - 1);

         if ($$7) {
            cat.this.dL().b(new cdw(cat.this.dL(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cat.this));
            cat.this.dL().a(dlg.t, new eji($$0, (double)$$6.v() + $$8, $$1), dlg.a.a(cat.this));
         }
      }

      @Override
      protected aqm l() {
         return aqn.hA;
      }

      @Override
      protected cbk.a m() {
         return cbk.a.c;
      }
   }

   class b extends cbk.b {
      @Override
      public void e() {
         if (cat.this.q() != null) {
            cat.this.G().a(cat.this.q(), (float)cat.this.Z(), (float)cat.this.Y());
         } else if (cat.this.gx() != null) {
            cat.this.G().a(cat.this.gx(), (float)cat.this.Z(), (float)cat.this.Y());
         }
      }
   }

   class c extends cbk.c {
      private final bvk e = bvk.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = cat.this.dL().a(cbo.class, this.e, cat.this, cat.this.cG().g(16.0)).size();
            return cat.this.ag.a(8) + 1 > $$0;
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
         ama $$0 = (ama)cat.this.dL();
         ekf $$1 = cat.this.cf();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            ht $$3 = cat.this.dl().b(-2 + cat.this.ag.a(5), 1, -2 + cat.this.ag.a(5));
            cbo $$4 = bkm.be.a(cat.this.dL());
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cat.this.dL().d_($$3), blc.f, null, null);
               $$4.a(cat.this);
               $$4.i($$3);
               $$4.b(20 * (30 + cat.this.ag.a(90)));
               if ($$1 != null) {
                  $$0.f().a($$4.cx(), $$1);
               }

               $$0.a_($$4);
               $$0.a(dlg.t, $$3, dlg.a.a(cat.this));
            }
         }
      }

      @Override
      protected aqm l() {
         return aqn.hB;
      }

      @Override
      protected cbk.a m() {
         return cbk.a.b;
      }
   }

   public class d extends cbk.c {
      private final bvk e = bvk.b().a(16.0).a($$0x -> ((bxf)$$0x).t() == cjp.l);

      @Override
      public boolean a() {
         if (cat.this.q() != null) {
            return false;
         } else if (cat.this.go()) {
            return false;
         } else if (cat.this.ah < this.c) {
            return false;
         } else if (!cat.this.dL().X().b(cro.c)) {
            return false;
         } else {
            List<bxf> $$0 = cat.this.dL().a(bxf.class, this.e, cat.this, cat.this.cG().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               cat.this.a($$0.get(cat.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return cat.this.gx() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         cat.this.a(null);
      }

      @Override
      protected void k() {
         bxf $$0 = cat.this.gx();
         if ($$0 != null && $$0.bv()) {
            $$0.b(cjp.o);
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
      protected aqm l() {
         return aqn.hC;
      }

      @Override
      protected cbk.a m() {
         return cbk.a.d;
      }
   }
}
