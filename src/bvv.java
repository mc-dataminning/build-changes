import java.util.List;
import javax.annotation.Nullable;

public class bvv extends bwm {
   @Nullable
   private bsh e;

   public bvv(bfn<? extends bvv> $$0, cmm $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void x() {
      super.x();
      this.bO.a(0, new bmp(this));
      this.bO.a(1, new bvv.b());
      this.bO.a(2, new bmc<>(this, byo.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new bvv.c());
      this.bO.a(5, new bvv.a());
      this.bO.a(6, new bvv.d());
      this.bO.a(8, new bns(this, 0.6));
      this.bO.a(9, new bnd(this, byo.class, 3.0F, 1.0F));
      this.bO.a(10, new bnd(this, bgb.class, 8.0F));
      this.bP.a(1, new bon(this, bzw.class).a());
      this.bP.a(2, new boo<>(this, byo.class, true).c(300));
      this.bP.a(3, new boo<>(this, bxw.class, false).c(300));
      this.bP.a(3, new boo<>(this, brx.class, false));
   }

   public static bhf.a r() {
      return bwc.ge().a(bhg.d, 0.5).a(bhg.b, 12.0).a(bhg.a, 24.0);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
   }

   @Override
   public amg Y_() {
      return amh.hs;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
   }

   @Override
   protected void W() {
      super.W();
   }

   @Override
   public boolean p(bfj $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.p($$0)) {
         return true;
      } else if ($$0 instanceof bwq) {
         return this.p(((bwq)$$0).r());
      } else {
         return $$0 instanceof bfz && ((bfz)$$0).eN() == bge.d ? this.cd() == null && $$0.cd() == null : false;
      }
   }

   @Override
   protected amg s() {
      return amh.hq;
   }

   @Override
   protected amg g_() {
      return amh.ht;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.hv;
   }

   void a(@Nullable bsh $$0) {
      this.e = $$0;
   }

   @Nullable
   bsh gr() {
      return this.e;
   }

   @Override
   protected amg fY() {
      return amh.hr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends bwm.c {
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
         bfz $$0 = bvv.this.j();
         double $$1 = Math.min($$0.dp(), bvv.this.dp());
         double $$2 = Math.max($$0.dp(), bvv.this.dp()) + 1.0;
         float $$3 = (float)apa.d($$0.dt() - bvv.this.dt(), $$0.dn() - bvv.this.dn());
         if (bvv.this.f((bfj)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(bvv.this.dn() + (double)apa.b($$5) * 1.5, bvv.this.dt() + (double)apa.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(bvv.this.dn() + (double)apa.b($$7) * 2.5, bvv.this.dt() + (double)apa.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(bvv.this.dn() + (double)apa.b($$3) * $$9, bvv.this.dt() + (double)apa.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         gu $$6 = gu.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            gu $$9 = $$6.d();
            dcb $$10 = bvv.this.dI().a_($$9);
            if ($$10.d(bvv.this.dI(), $$9, ha.b)) {
               if (!bvv.this.dI().t($$6)) {
                  dcb $$11 = bvv.this.dI().a_($$6);
                  efb $$12 = $$11.k(bvv.this.dI(), $$6);
                  if (!$$12.b()) {
                     $$8 = $$12.c(ha.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= apa.a($$2) - 1);

         if ($$7) {
            bvv.this.dI().b(new byy(bvv.this.dI(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, bvv.this));
         }
      }

      @Override
      protected amg l() {
         return amh.hw;
      }

      @Override
      protected bwm.a m() {
         return bwm.a.c;
      }
   }

   class b extends bwm.b {
      @Override
      public void e() {
         if (bvv.this.j() != null) {
            bvv.this.E().a(bvv.this.j(), (float)bvv.this.fC(), (float)bvv.this.X());
         } else if (bvv.this.gr() != null) {
            bvv.this.E().a(bvv.this.gr(), (float)bvv.this.fC(), (float)bvv.this.X());
         }
      }
   }

   class c extends bwm.c {
      private final bqm e = bqm.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = bvv.this.dI().a(bwq.class, this.e, bvv.this, bvv.this.cE().g(16.0)).size();
            return bvv.this.af.a(8) + 1 > $$0;
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
         aif $$0 = (aif)bvv.this.dI();

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gu $$2 = bvv.this.di().b(-2 + bvv.this.af.a(5), 1, -2 + bvv.this.af.a(5));
            bwq $$3 = bfn.be.a(bvv.this.dI());
            if ($$3 != null) {
               $$3.a($$2, 0.0F, 0.0F);
               $$3.a($$0, bvv.this.dI().d_($$2), bgd.f, null, null);
               $$3.a(bvv.this);
               $$3.i($$2);
               $$3.b(20 * (30 + bvv.this.af.a(90)));
               $$0.a_($$3);
            }
         }
      }

      @Override
      protected amg l() {
         return amh.hx;
      }

      @Override
      protected bwm.a m() {
         return bwm.a.b;
      }
   }

   public class d extends bwm.c {
      private final bqm e = bqm.b().a(16.0).a($$0x -> ((bsh)$$0x).r() == cen.l);

      @Override
      public boolean a() {
         if (bvv.this.j() != null) {
            return false;
         } else if (bvv.this.gi()) {
            return false;
         } else if (bvv.this.ag < this.c) {
            return false;
         } else if (!bvv.this.dI().X().b(cmi.c)) {
            return false;
         } else {
            List<bsh> $$0 = bvv.this.dI().a(bsh.class, this.e, bvv.this, bvv.this.cE().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               bvv.this.a($$0.get(bvv.this.af.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return bvv.this.gr() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         bvv.this.a(null);
      }

      @Override
      protected void k() {
         bsh $$0 = bvv.this.gr();
         if ($$0 != null && $$0.bs()) {
            $$0.b(cen.o);
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
      protected amg l() {
         return amh.hy;
      }

      @Override
      protected bwm.a m() {
         return bwm.a.d;
      }
   }
}
