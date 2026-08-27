import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbm extends ccg {
   private static final aim<ib> d = aiq.a(cbm.class, aio.n);
   private static final aim<Boolean> e = aiq.a(cbm.class, aio.k);
   private static final aim<Integer> bX = aiq.a(cbm.class, aio.b);
   static final caf bY = caf.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bZ = 2400;
   public static final Predicate<cfe> c = $$0 -> !$$0.y() && $$0.bA() && $$0.bc();

   public cbm(bpd<? extends cbm> $$0, cxb $$1) {
      super($$0, $$1);
      this.bO = new bvr(this, 85, 10, 0.02F, 0.1F, true);
      this.bN = new bvq(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      this.k(this.ch());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(ib $$0) {
      this.an.a(d, $$0);
   }

   public ib r() {
      return this.an.a(d);
   }

   public boolean s() {
      return this.an.a(e);
   }

   public void w(boolean $$0) {
      this.an.a(e, $$0);
   }

   public int y() {
      return this.an.a(bX);
   }

   public void c(int $$0) {
      this.an.a(bX, $$0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(d, ib.c);
      $$0.a(e, false);
      $$0.a(bX, 2400);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.r().u());
      $$0.a("TreasurePosY", this.r().v());
      $$0.a("TreasurePosZ", this.r().w());
      $$0.a("GotFish", this.s());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(ta $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new ib($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bR.a(0, new bvx(this));
      this.bR.a(0, new bxw(this));
      this.bR.a(1, new cbm.a(this));
      this.bR.a(2, new cbm.b(this, 4.0));
      this.bR.a(4, new bxk(this, 1.0, 10));
      this.bR.a(4, new bxh(this));
      this.bR.a(5, new bwu(this, ciu.class, 6.0F));
      this.bR.a(5, new bwc(this, 10));
      this.bR.a(6, new bww(this, 1.2F, true));
      this.bR.a(8, new cbm.c());
      this.bR.a(8, new bwh(this));
      this.bR.a(9, new bvt<>(this, cfw.class, 8.0F, 1.0, 1.0));
      this.bS.a(1, new bye(this, cfw.class).a());
   }

   public static bqv.a gn() {
      return bpr.A().a(bqw.q, 10.0).a(bqw.r, 1.2F).a(bqw.c, 3.0);
   }

   @Override
   protected bza b(cxb $$0) {
      return new bzc(this, $$0);
   }

   @Override
   public boolean C(box $$0) {
      boolean $$1 = $$0.a(this.dN().b((bpp)this), (float)((int)this.g(bqw.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aty.gR, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int ch() {
      return 4800;
   }

   @Override
   protected int o(int $$0) {
      return this.ch();
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   protected boolean o(box $$0) {
      return true;
   }

   @Override
   public boolean f(cqm $$0) {
      bpe $$1 = bpr.h($$0);
      return !this.d($$1).b() ? false : $$1 == bpe.a && super.f($$0);
   }

   @Override
   protected void b(cfe $$0) {
      if (this.d(bpe.a).b()) {
         cqm $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bpe.a, $$1);
            this.f(bpe.a);
            this.a($$0, $$1.M());
            $$0.am();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gd()) {
         this.k(this.ch());
      } else {
         if (this.be()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dN().r(), 1.0F);
            }

            if (this.aC()) {
               this.g(this.dp().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dM().B && this.bc() && this.dp().g() > 0.03) {
            ept $$0 = this.f(0.0F);
            float $$1 = aww.b(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = aww.a(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dM()
                  .a(kc.aq, this.dr() - $$0.c * (double)$$3 + (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dM()
                  .a(kc.aq, this.dr() - $$0.c * (double)$$3 - (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(kc.N);
      } else {
         super.b($$0);
      }
   }

   private void a(ka $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dM().a($$0, this.d(1.0), this.du() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(auv.ao)) {
         if (!this.dM().B) {
            this.a(aty.gT, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bnd.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.gU;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.gS;
   }

   @Nullable
   @Override
   protected atx v() {
      return this.bc() ? aty.gQ : aty.gP;
   }

   @Override
   protected atx aO() {
      return aty.gX;
   }

   @Override
   protected atx aN() {
      return aty.gY;
   }

   protected boolean go() {
      ib $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dk(), 12.0) : false;
   }

   @Override
   public void a(ept $$0) {
      if (this.cY() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bpu.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.p() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(ciu $$0) {
      return true;
   }

   static class a extends bwm {
      private final cbm a;
      private boolean b;

      a(cbm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwm.a.a, bwm.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.s() && this.a.ci() >= 100;
      }

      @Override
      public boolean b() {
         ib $$0 = this.a.r();
         return !ib.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) && !this.b && this.a.ci() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dM() instanceof apf) {
            apf $$0 = (apf)this.a.dM();
            this.b = false;
            this.a.K().n();
            ib $$1 = this.a.dm();
            ib $$2 = $$0.a(auz.b, $$1, 50, false);
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
         ib $$0 = this.a.r();
         if (ib.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cxb $$0 = this.a.dM();
         if (this.a.go() || this.a.K().l()) {
            ept $$1 = ept.b(this.a.r());
            ept $$2 = caj.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = caj.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ib $$3 = ib.a($$2);
               if (!$$0.b_($$3).a(aus.a) || !$$0.a_($$3).a($$0, $$3, eje.b)) {
                  $$2 = caj.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.aa() + 20), (float)this.a.Z());
            this.a.K().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bwm {
      private final cbm a;
      private final double b;
      @Nullable
      private ciu c;

      b(cbm $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bwm.a.a, bwm.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dM().a(cbm.bY, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bok(bom.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.aa() + 20), (float)this.a.Z());
         if (this.a.g(this.c) < 6.25) {
            this.a.K().n();
         } else {
            this.a.K().a(this.c, this.b);
         }

         if (this.c.bZ() && this.c.dM().z.a(6) == 0) {
            this.c.b(new bok(bom.D, 100), this.a);
         }
      }
   }

   class c extends bwm {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cbm.this.ah) {
            return false;
         } else {
            List<cfe> $$0 = cbm.this.dM().a(cfe.class, cbm.this.cH().c(8.0, 8.0, 8.0), cbm.c);
            return !$$0.isEmpty() || !cbm.this.d(bpe.a).b();
         }
      }

      @Override
      public void c() {
         List<cfe> $$0 = cbm.this.dM().a(cfe.class, cbm.this.cH().c(8.0, 8.0, 8.0), cbm.c);
         if (!$$0.isEmpty()) {
            cbm.this.K().a($$0.get(0), 1.2F);
            cbm.this.a(aty.gW, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cqm $$0 = cbm.this.d(bpe.a);
         if (!$$0.b()) {
            this.a($$0);
            cbm.this.a(bpe.a, cqm.h);
            this.b = cbm.this.ah + cbm.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<cfe> $$0 = cbm.this.dM().a(cfe.class, cbm.this.cH().c(8.0, 8.0, 8.0), cbm.c);
         cqm $$1 = cbm.this.d(bpe.a);
         if (!$$1.b()) {
            this.a($$1);
            cbm.this.a(bpe.a, cqm.h);
         } else if (!$$0.isEmpty()) {
            cbm.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(cqm $$0) {
         if (!$$0.b()) {
            double $$1 = cbm.this.dv() - 0.3F;
            cfe $$2 = new cfe(cbm.this.dM(), cbm.this.dr(), $$1, cbm.this.dx(), $$0);
            $$2.b(40);
            $$2.b(cbm.this);
            float $$3 = 0.3F;
            float $$4 = cbm.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cbm.this.ag.i();
            $$2.o(
               (double)(0.3F * -aww.a(cbm.this.dC() * (float) (Math.PI / 180.0)) * aww.b(cbm.this.dE() * (float) (Math.PI / 180.0)) + aww.b($$4) * $$5),
               (double)(0.3F * aww.a(cbm.this.dE() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * aww.b(cbm.this.dC() * (float) (Math.PI / 180.0)) * aww.b(cbm.this.dE() * (float) (Math.PI / 180.0)) + aww.a($$4) * $$5)
            );
            cbm.this.dM().b($$2);
         }
      }
   }
}
