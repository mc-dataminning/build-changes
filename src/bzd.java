import java.util.List;
import javax.annotation.Nullable;

public class bzd extends bzu {
   @Nullable
   private bvp e;

   public bzd(biw<? extends bzd> $$0, cpx $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpx(this));
      this.bO.a(1, new bzd.b());
      this.bO.a(2, new bpk<>(this, cbw.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new bzd.c());
      this.bO.a(5, new bzd.a());
      this.bO.a(6, new bzd.d());
      this.bO.a(8, new bra(this, 0.6));
      this.bO.a(9, new bql(this, cbw.class, 3.0F, 1.0F));
      this.bO.a(10, new bql(this, bjk.class, 8.0F));
      this.bP.a(1, new brv(this, cde.class).a());
      this.bP.a(2, new brw<>(this, cbw.class, true).c(300));
      this.bP.a(3, new brw<>(this, cbe.class, false).c(300));
      this.bP.a(3, new brw<>(this, bvf.class, false));
   }

   public static bkn.a t() {
      return bzk.gj().a(bko.d, 0.5).a(bko.b, 12.0).a(bko.a, 24.0);
   }

   @Override
   protected void a_() {
      super.a_();
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
   }

   @Override
   public ape ac_() {
      return apf.hs;
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
   }

   @Override
   protected void X() {
      super.X();
   }

   @Override
   public boolean s(bis $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof bzy) {
         return this.s(((bzy)$$0).t());
      } else {
         return $$0 instanceof bji && ((bji)$$0).eR() == bjn.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected ape w() {
      return apf.hq;
   }

   @Override
   protected ape l_() {
      return apf.ht;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.hv;
   }

   void a(@Nullable bvp $$0) {
      this.e = $$0;
   }

   @Nullable
   bvp gw() {
      return this.e;
   }

   @Override
   protected ape gd() {
      return apf.hr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends bzu.c {
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
         bji $$0 = bzd.this.q();
         double $$1 = Math.min($$0.ds(), bzd.this.ds());
         double $$2 = Math.max($$0.ds(), bzd.this.ds()) + 1.0;
         float $$3 = (float)ary.d($$0.dw() - bzd.this.dw(), $$0.dq() - bzd.this.dq());
         if (bzd.this.f((bis)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(bzd.this.dq() + (double)ary.b($$5) * 1.5, bzd.this.dw() + (double)ary.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(bzd.this.dq() + (double)ary.b($$7) * 2.5, bzd.this.dw() + (double)ary.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(bzd.this.dq() + (double)ary.b($$3) * $$9, bzd.this.dw() + (double)ary.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         gw $$6 = gw.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            gw $$9 = $$6.d();
            dfl $$10 = bzd.this.dL().a_($$9);
            if ($$10.d(bzd.this.dL(), $$9, hc.b)) {
               if (!bzd.this.dL().t($$6)) {
                  dfl $$11 = bzd.this.dL().a_($$6);
                  eii $$12 = $$11.k(bzd.this.dL(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(hc.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= ary.a($$2) - 1);

         if ($$7) {
            bzd.this.dL().b(new ccg(bzd.this.dL(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, bzd.this));
            bzd.this.dL().a(djv.t, new ehp($$0, (double)$$6.v() + $$8, $$1), djv.a.a(bzd.this));
         }
      }

      @Override
      protected ape l() {
         return apf.hw;
      }

      @Override
      protected bzu.a m() {
         return bzu.a.c;
      }
   }

   class b extends bzu.b {
      @Override
      public void e() {
         if (bzd.this.q() != null) {
            bzd.this.G().a(bzd.this.q(), (float)bzd.this.Z(), (float)bzd.this.Y());
         } else if (bzd.this.gw() != null) {
            bzd.this.G().a(bzd.this.gw(), (float)bzd.this.Z(), (float)bzd.this.Y());
         }
      }
   }

   class c extends bzu.c {
      private final btu e = btu.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = bzd.this.dL().a(bzy.class, this.e, bzd.this, bzd.this.cG().g(16.0)).size();
            return bzd.this.ag.a(8) + 1 > $$0;
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
         aks $$0 = (aks)bzd.this.dL();

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gw $$2 = bzd.this.dl().b(-2 + bzd.this.ag.a(5), 1, -2 + bzd.this.ag.a(5));
            bzy $$3 = biw.be.a(bzd.this.dL());
            if ($$3 != null) {
               $$3.a($$2, 0.0F, 0.0F);
               $$3.a($$0, bzd.this.dL().d_($$2), bjm.f, null, null);
               $$3.a(bzd.this);
               $$3.i($$2);
               $$3.b(20 * (30 + bzd.this.ag.a(90)));
               $$0.a_($$3);
               $$0.a(djv.t, $$2, djv.a.a(bzd.this));
            }
         }
      }

      @Override
      protected ape l() {
         return apf.hx;
      }

      @Override
      protected bzu.a m() {
         return bzu.a.b;
      }
   }

   public class d extends bzu.c {
      private final btu e = btu.b().a(16.0).a($$0x -> ((bvp)$$0x).t() == chv.l);

      @Override
      public boolean a() {
         if (bzd.this.q() != null) {
            return false;
         } else if (bzd.this.gn()) {
            return false;
         } else if (bzd.this.ah < this.c) {
            return false;
         } else if (!bzd.this.dL().X().b(cpt.c)) {
            return false;
         } else {
            List<bvp> $$0 = bzd.this.dL().a(bvp.class, this.e, bzd.this, bzd.this.cG().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               bzd.this.a($$0.get(bzd.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return bzd.this.gw() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         bzd.this.a(null);
      }

      @Override
      protected void k() {
         bvp $$0 = bzd.this.gw();
         if ($$0 != null && $$0.bv()) {
            $$0.b(chv.o);
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
      protected ape l() {
         return apf.hy;
      }

      @Override
      protected bzu.a m() {
         return bzu.a.d;
      }
   }
}
