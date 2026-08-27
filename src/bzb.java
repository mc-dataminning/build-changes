import java.util.List;
import javax.annotation.Nullable;

public class bzb extends bzs {
   @Nullable
   private bvn e;

   public bzb(biu<? extends bzb> $$0, cpv $$1) {
      super($$0, $$1);
      this.bJ = 10;
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpv(this));
      this.bO.a(1, new bzb.b());
      this.bO.a(2, new bpi<>(this, cbu.class, 8.0F, 0.6, 1.0));
      this.bO.a(4, new bzb.c());
      this.bO.a(5, new bzb.a());
      this.bO.a(6, new bzb.d());
      this.bO.a(8, new bqy(this, 0.6));
      this.bO.a(9, new bqj(this, cbu.class, 3.0F, 1.0F));
      this.bO.a(10, new bqj(this, bji.class, 8.0F));
      this.bP.a(1, new brt(this, cdc.class).a());
      this.bP.a(2, new bru<>(this, cbu.class, true).c(300));
      this.bP.a(3, new bru<>(this, cbc.class, false).c(300));
      this.bP.a(3, new bru<>(this, bvd.class, false));
   }

   public static bkl.a t() {
      return bzi.gj().a(bkm.d, 0.5).a(bkm.b, 12.0).a(bkm.a, 24.0);
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
   public apd ac_() {
      return ape.hs;
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
   public boolean s(biq $$0) {
      if ($$0 == null) {
         return false;
      } else if ($$0 == this) {
         return true;
      } else if (super.s($$0)) {
         return true;
      } else if ($$0 instanceof bzw) {
         return this.s(((bzw)$$0).t());
      } else {
         return $$0 instanceof bjg && ((bjg)$$0).eR() == bjl.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected apd w() {
      return ape.hq;
   }

   @Override
   protected apd l_() {
      return ape.ht;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.hv;
   }

   void a(@Nullable bvn $$0) {
      this.e = $$0;
   }

   @Nullable
   bvn gw() {
      return this.e;
   }

   @Override
   protected apd gd() {
      return ape.hr;
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   class a extends bzs.c {
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
         bjg $$0 = bzb.this.q();
         double $$1 = Math.min($$0.ds(), bzb.this.ds());
         double $$2 = Math.max($$0.ds(), bzb.this.ds()) + 1.0;
         float $$3 = (float)arx.d($$0.dw() - bzb.this.dw(), $$0.dq() - bzb.this.dq());
         if (bzb.this.f((biq)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(bzb.this.dq() + (double)arx.b($$5) * 1.5, bzb.this.dw() + (double)arx.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(bzb.this.dq() + (double)arx.b($$7) * 2.5, bzb.this.dw() + (double)arx.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(bzb.this.dq() + (double)arx.b($$3) * $$9, bzb.this.dw() + (double)arx.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         gw $$6 = gw.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            gw $$9 = $$6.d();
            dfj $$10 = bzb.this.dL().a_($$9);
            if ($$10.d(bzb.this.dL(), $$9, hc.b)) {
               if (!bzb.this.dL().t($$6)) {
                  dfj $$11 = bzb.this.dL().a_($$6);
                  eig $$12 = $$11.k(bzb.this.dL(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(hc.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.d();
         } while ($$6.v() >= arx.a($$2) - 1);

         if ($$7) {
            bzb.this.dL().b(new cce(bzb.this.dL(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, bzb.this));
            bzb.this.dL().a(djt.t, new ehn($$0, (double)$$6.v() + $$8, $$1), djt.a.a(bzb.this));
         }
      }

      @Override
      protected apd l() {
         return ape.hw;
      }

      @Override
      protected bzs.a m() {
         return bzs.a.c;
      }
   }

   class b extends bzs.b {
      @Override
      public void e() {
         if (bzb.this.q() != null) {
            bzb.this.G().a(bzb.this.q(), (float)bzb.this.Z(), (float)bzb.this.Y());
         } else if (bzb.this.gw() != null) {
            bzb.this.G().a(bzb.this.gw(), (float)bzb.this.Z(), (float)bzb.this.Y());
         }
      }
   }

   class c extends bzs.c {
      private final bts e = bts.b().a(16.0).d().e();

      @Override
      public boolean a() {
         if (!super.a()) {
            return false;
         } else {
            int $$0 = bzb.this.dL().a(bzw.class, this.e, bzb.this, bzb.this.cG().g(16.0)).size();
            return bzb.this.ag.a(8) + 1 > $$0;
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
         akr $$0 = (akr)bzb.this.dL();

         for (int $$1 = 0; $$1 < 3; $$1++) {
            gw $$2 = bzb.this.dl().b(-2 + bzb.this.ag.a(5), 1, -2 + bzb.this.ag.a(5));
            bzw $$3 = biu.be.a(bzb.this.dL());
            if ($$3 != null) {
               $$3.a($$2, 0.0F, 0.0F);
               $$3.a($$0, bzb.this.dL().d_($$2), bjk.f, null, null);
               $$3.a(bzb.this);
               $$3.i($$2);
               $$3.b(20 * (30 + bzb.this.ag.a(90)));
               $$0.a_($$3);
               $$0.a(djt.t, $$2, djt.a.a(bzb.this));
            }
         }
      }

      @Override
      protected apd l() {
         return ape.hx;
      }

      @Override
      protected bzs.a m() {
         return bzs.a.b;
      }
   }

   public class d extends bzs.c {
      private final bts e = bts.b().a(16.0).a($$0x -> ((bvn)$$0x).t() == cht.l);

      @Override
      public boolean a() {
         if (bzb.this.q() != null) {
            return false;
         } else if (bzb.this.gn()) {
            return false;
         } else if (bzb.this.ah < this.c) {
            return false;
         } else if (!bzb.this.dL().X().b(cpr.c)) {
            return false;
         } else {
            List<bvn> $$0 = bzb.this.dL().a(bvn.class, this.e, bzb.this, bzb.this.cG().c(16.0, 4.0, 16.0));
            if ($$0.isEmpty()) {
               return false;
            } else {
               bzb.this.a($$0.get(bzb.this.ag.a($$0.size())));
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return bzb.this.gw() != null && this.b > 0;
      }

      @Override
      public void d() {
         super.d();
         bzb.this.a(null);
      }

      @Override
      protected void k() {
         bvn $$0 = bzb.this.gw();
         if ($$0 != null && $$0.bv()) {
            $$0.b(cht.o);
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
      protected apd l() {
         return ape.hy;
      }

      @Override
      protected bzs.a m() {
         return bzs.a.d;
      }
   }
}
