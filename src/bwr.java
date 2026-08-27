import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwr extends bxl {
   private static final afm<ht> d = afp.a(bwr.class, afo.n);
   private static final afm<Boolean> e = afp.a(bwr.class, afo.k);
   private static final afm<Integer> bT = afp.a(bwr.class, afo.b);
   static final bvk bU = bvk.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<caf> c = $$0 -> !$$0.y() && $$0.bv() && $$0.aX();

   public bwr(bkm<? extends bwr> $$0, crs $$1) {
      super($$0, $$1);
      this.bL = new bqy(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bqx(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      this.j(this.cg());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(ht $$0) {
      this.an.b(d, $$0);
   }

   public ht s() {
      return this.an.b(d);
   }

   public boolean t() {
      return this.an.b(e);
   }

   public void w(boolean $$0) {
      this.an.b(e, $$0);
   }

   public int y() {
      return this.an.b(bT);
   }

   public void c(int $$0) {
      this.an.b(bT, $$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, ht.b);
      this.an.a(e, false);
      this.an.a(bT, 2400);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(rz $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new ht($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bO.a(0, new bre(this));
      this.bO.a(0, new btd(this));
      this.bO.a(1, new bwr.a(this));
      this.bO.a(2, new bwr.b(this, 4.0));
      this.bO.a(4, new bsr(this, 1.0, 10));
      this.bO.a(4, new bso(this));
      this.bO.a(5, new bsb(this, cdm.class, 6.0F));
      this.bO.a(5, new brj(this, 10));
      this.bO.a(6, new bsd(this, 1.2F, true));
      this.bO.a(8, new bwr.c());
      this.bO.a(8, new bro(this));
      this.bO.a(9, new bra<>(this, caw.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new btl(this, caw.class).a());
   }

   public static bmd.a ge() {
      return bla.A().a(bme.l, 10.0).a(bme.m, 1.2F).a(bme.c, 3.0);
   }

   @Override
   protected buh b(crs $$0) {
      return new buj(this, $$0);
   }

   @Override
   public boolean C(bki $$0) {
      boolean $$1 = $$0.a(this.dM().b((bky)this), (float)((int)this.b(bme.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aqn.fV, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int cg() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.cg();
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 0.3F;
   }

   @Override
   public int Y() {
      return 1;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   protected boolean o(bki $$0) {
      return true;
   }

   @Override
   public boolean f(clb $$0) {
      bkn $$1 = bla.h($$0);
      return !this.c($$1).b() ? false : $$1 == bkn.a && super.f($$0);
   }

   @Override
   protected void b(caf $$0) {
      if (this.c(bkn.a).b()) {
         clb $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bkn.a, $$1);
            this.e(bkn.a);
            this.a($$0, $$1.L());
            $$0.ak();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.fU()) {
         this.j(this.cg());
      } else {
         if (this.aZ()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dM().r(), 1.0F);
            }

            if (this.aA()) {
               this.f(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dL().B && this.aX() && this.do().g() > 0.03) {
            eji $$0 = this.f(0.0F);
            float $$1 = ati.b(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ati.a(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dL()
                  .a(js.an, this.dq() - $$0.c * (double)$$3 + (double)$$1, this.ds() - $$0.d, this.dw() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dL()
                  .a(js.an, this.dq() - $$0.c * (double)$$3 - (double)$$1, this.ds() - $$0.d, this.dw() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(js.K);
      } else {
         super.b($$0);
      }
   }

   private void a(jq $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dL().a($$0, this.d(1.0), this.dt() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(ark.ao)) {
         if (!this.dL().B) {
            this.a(aqn.fX, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         return biq.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.fY;
   }

   @Nullable
   @Override
   protected aqm m_() {
      return aqn.fW;
   }

   @Nullable
   @Override
   protected aqm w() {
      return this.aX() ? aqn.fU : aqn.fT;
   }

   @Override
   protected aqm aM() {
      return aqn.gb;
   }

   @Override
   protected aqm aL() {
      return aqn.gc;
   }

   protected boolean gf() {
      ht $$0 = this.L().h();
      return $$0 != null ? $$0.a(this.dj(), 12.0) : false;
   }

   @Override
   public void h(eji $$0) {
      if (this.cX() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(ble.a, this.do());
         this.f(this.do().a(0.9));
         if (this.q() == null) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return true;
   }

   static class a extends brt {
      private final bwr a;
      private boolean b;

      a(bwr $$0) {
         this.a = $$0;
         this.a(EnumSet.of(brt.a.a, brt.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.t() && this.a.ch() >= 100;
      }

      @Override
      public boolean b() {
         ht $$0 = this.a.s();
         return !ht.a((double)$$0.u(), this.a.ds(), (double)$$0.w()).a(this.a.dj(), 4.0) && !this.b && this.a.ch() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dL() instanceof ama) {
            ama $$0 = (ama)this.a.dL();
            this.b = false;
            this.a.L().n();
            ht $$1 = this.a.dl();
            ht $$2 = $$0.a(arn.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.i($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void d() {
         ht $$0 = this.a.s();
         if (ht.a((double)$$0.u(), this.a.ds(), (double)$$0.w()).a(this.a.dj(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         crs $$0 = this.a.dL();
         if (this.a.gf() || this.a.L().l()) {
            eji $$1 = eji.b(this.a.s());
            eji $$2 = bvo.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bvo.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ht $$3 = ht.a($$2);
               if (!$$0.b_($$3).a(arh.a) || !$$0.a_($$3).a($$0, $$3, ecw.b)) {
                  $$2 = bvo.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.Z() + 20), (float)this.a.Y());
            this.a.L().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends brt {
      private final bwr a;
      private final double b;
      @Nullable
      private cdm c;

      b(bwr $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(brt.a.a, brt.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dL().a(bwr.bU, this.a);
         return this.c == null ? false : this.c.bY() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bY() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bjv(bjx.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.L().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.Z() + 20), (float)this.a.Y());
         if (this.a.f(this.c) < 6.25) {
            this.a.L().n();
         } else {
            this.a.L().a(this.c, this.b);
         }

         if (this.c.bY() && this.c.dL().z.a(6) == 0) {
            this.c.b(new bjv(bjx.D, 100), this.a);
         }
      }
   }

   class c extends brt {
      private int b;

      @Override
      public boolean a() {
         if (this.b > bwr.this.ah) {
            return false;
         } else {
            List<caf> $$0 = bwr.this.dL().a(caf.class, bwr.this.cG().c(8.0, 8.0, 8.0), bwr.c);
            return !$$0.isEmpty() || !bwr.this.c(bkn.a).b();
         }
      }

      @Override
      public void c() {
         List<caf> $$0 = bwr.this.dL().a(caf.class, bwr.this.cG().c(8.0, 8.0, 8.0), bwr.c);
         if (!$$0.isEmpty()) {
            bwr.this.L().a($$0.get(0), 1.2F);
            bwr.this.a(aqn.ga, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         clb $$0 = bwr.this.c(bkn.a);
         if (!$$0.b()) {
            this.a($$0);
            bwr.this.a(bkn.a, clb.b);
            this.b = bwr.this.ah + bwr.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<caf> $$0 = bwr.this.dL().a(caf.class, bwr.this.cG().c(8.0, 8.0, 8.0), bwr.c);
         clb $$1 = bwr.this.c(bkn.a);
         if (!$$1.b()) {
            this.a($$1);
            bwr.this.a(bkn.a, clb.b);
         } else if (!$$0.isEmpty()) {
            bwr.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(clb $$0) {
         if (!$$0.b()) {
            double $$1 = bwr.this.du() - 0.3F;
            caf $$2 = new caf(bwr.this.dL(), bwr.this.dq(), $$1, bwr.this.dw(), $$0);
            $$2.b(40);
            $$2.a(bwr.this);
            float $$3 = 0.3F;
            float $$4 = bwr.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * bwr.this.ag.i();
            $$2.o(
               (double)(0.3F * -ati.a(bwr.this.dB() * (float) (Math.PI / 180.0)) * ati.b(bwr.this.dD() * (float) (Math.PI / 180.0)) + ati.b($$4) * $$5),
               (double)(0.3F * ati.a(bwr.this.dD() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ati.b(bwr.this.dB() * (float) (Math.PI / 180.0)) * ati.b(bwr.this.dD() * (float) (Math.PI / 180.0)) + ati.a($$4) * $$5)
            );
            bwr.this.dL().b($$2);
         }
      }
   }
}
