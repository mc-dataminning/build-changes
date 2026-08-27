import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdx extends cer {
   private static final ajm<in> d = ajq.a(cdx.class, ajo.o);
   private static final ajm<Boolean> e = ajq.a(cdx.class, ajo.k);
   private static final ajm<Integer> bY = ajq.a(cdx.class, ajo.b);
   static final ccq bZ = ccq.b().a(10.0).d();
   public static final int b = 4800;
   private static final int ca = 2400;
   public static final Predicate<chr> c = $$0 -> !$$0.y() && $$0.bB() && $$0.bc();

   public cdx(brn<? extends cdx> $$0, dad $$1) {
      super($$0, $$1);
      this.bP = new byc(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new byb(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      this.k(this.ci());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(in $$0) {
      this.ao.a(d, $$0);
   }

   public in r() {
      return this.ao.a(d);
   }

   public boolean u() {
      return this.ao.a(e);
   }

   public void w(boolean $$0) {
      this.ao.a(e, $$0);
   }

   public int y() {
      return this.ao.a(bY);
   }

   public void c(int $$0) {
      this.ao.a(bY, $$0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(d, in.c);
      $$0.a(e, false);
      $$0.a(bY, 2400);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.r().u());
      $$0.a("TreasurePosY", this.r().v());
      $$0.a("TreasurePosZ", this.r().w());
      $$0.a("GotFish", this.u());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(ua $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new in($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bS.a(0, new byi(this));
      this.bS.a(0, new cah(this));
      this.bS.a(1, new cdx.a(this));
      this.bS.a(2, new cdx.b(this, 4.0));
      this.bS.a(4, new bzv(this, 1.0, 10));
      this.bS.a(4, new bzs(this));
      this.bS.a(5, new bzf(this, clh.class, 6.0F));
      this.bS.a(5, new byn(this, 10));
      this.bS.a(6, new bzh(this, 1.2F, true));
      this.bS.a(8, new cdx.c());
      this.bS.a(8, new bys(this));
      this.bS.a(9, new bye<>(this, cij.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new cap(this, cij.class).a());
   }

   public static btg.a gp() {
      return bsc.A().a(bth.q, 10.0).a(bth.r, 1.2F).a(bth.c, 3.0);
   }

   @Override
   protected cbl b(dad $$0) {
      return new cbn(this, $$0);
   }

   @Override
   public boolean C(brh $$0) {
      boolean $$1 = $$0.a(this.dO().b((bsa)this), (float)((int)this.g(bth.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avc.gS, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int ci() {
      return 4800;
   }

   @Override
   protected int o(int $$0) {
      return this.ci();
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
   protected boolean o(brh $$0) {
      return true;
   }

   @Override
   public boolean f(csz $$0) {
      bro $$1 = bsc.h($$0);
      return !this.d($$1).d() ? false : $$1 == bro.a && super.f($$0);
   }

   @Override
   protected void b(chr $$0) {
      if (this.d(bro.a).d()) {
         csz $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bro.a, $$1);
            this.f(bro.a);
            this.a($$0, $$1.G());
            $$0.am();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gf()) {
         this.k(this.ci());
      } else {
         if (this.be()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dO().r(), 1.0F);
            }

            if (this.aC()) {
               this.g(this.dq().b((double)((this.ah.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ah.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ah.i() * 360.0F);
               this.d(false);
               this.av = true;
            }
         }

         if (this.dN().B && this.bc() && this.dq().g() > 0.03) {
            etp $$0 = this.f(0.0F);
            float $$1 = axz.b(this.dD() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = axz.a(this.dD() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ah.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dN()
                  .a(kx.ap, this.ds() - $$0.c * (double)$$3 + (double)$$1, this.du() - $$0.d, this.dy() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dN()
                  .a(kx.ap, this.ds() - $$0.c * (double)$$3 - (double)$$1, this.du() - $$0.d, this.dy() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(kx.M);
      } else {
         super.b($$0);
      }
   }

   private void a(kv $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ah.k() * 0.01;
         double $$3 = this.ah.k() * 0.01;
         double $$4 = this.ah.k() * 0.01;
         this.dN().a($$0, this.d(1.0), this.dv() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bpm b(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      if (!$$2.d() && $$2.a(avz.aP)) {
         if (!this.dN().B) {
            this.a(avc.gU, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bpm.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.gV;
   }

   @Nullable
   @Override
   protected avb o_() {
      return avc.gT;
   }

   @Nullable
   @Override
   protected avb v() {
      return this.bc() ? avc.gR : avc.gQ;
   }

   @Override
   protected avb aO() {
      return avc.gY;
   }

   @Override
   protected avb aN() {
      return avc.gZ;
   }

   protected boolean gq() {
      in $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dl(), 12.0) : false;
   }

   @Override
   public void a(etp $$0) {
      if (this.cZ() && this.bc()) {
         this.a(this.fl(), $$0);
         this.a(bsf.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.p() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(clh $$0) {
      return true;
   }

   static class a extends byx {
      private final cdx a;
      private boolean b;

      a(cdx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byx.a.a, byx.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.u() && this.a.cj() >= 100;
      }

      @Override
      public boolean b() {
         in $$0 = this.a.r();
         return !in.a((double)$$0.u(), this.a.du(), (double)$$0.w()).a(this.a.dl(), 4.0) && !this.b && this.a.cj() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dN() instanceof aqh) {
            aqh $$0 = (aqh)this.a.dN();
            this.b = false;
            this.a.K().n();
            in $$1 = this.a.dn();
            in $$2 = $$0.a(awc.b, $$1, 50, false);
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
         in $$0 = this.a.r();
         if (in.a((double)$$0.u(), this.a.du(), (double)$$0.w()).a(this.a.dl(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         dad $$0 = this.a.dN();
         if (this.a.gq() || this.a.K().l()) {
            etp $$1 = etp.b(this.a.r());
            etp $$2 = ccu.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = ccu.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               in $$3 = in.a($$2);
               if (!$$0.b_($$3).a(avw.a) || !$$0.a_($$3).a(emp.b)) {
                  $$2 = ccu.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends byx {
      private final cdx a;
      private final double b;
      @Nullable
      private clh c;

      b(cdx $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(byx.a.a, byx.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dN().a(cdx.bZ, this.a);
         return this.c == null ? false : this.c.ca() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.ca() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bqt(bqv.D, 100), this.a);
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

         if (this.c.ca() && this.c.dN().z.a(6) == 0) {
            this.c.b(new bqt(bqv.D, 100), this.a);
         }
      }
   }

   class c extends byx {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cdx.this.ai) {
            return false;
         } else {
            List<chr> $$0 = cdx.this.dN().a(chr.class, cdx.this.cI().c(8.0, 8.0, 8.0), cdx.c);
            return !$$0.isEmpty() || !cdx.this.d(bro.a).d();
         }
      }

      @Override
      public void c() {
         List<chr> $$0 = cdx.this.dN().a(chr.class, cdx.this.cI().c(8.0, 8.0, 8.0), cdx.c);
         if (!$$0.isEmpty()) {
            cdx.this.K().a($$0.get(0), 1.2F);
            cdx.this.a(avc.gX, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         csz $$0 = cdx.this.d(bro.a);
         if (!$$0.d()) {
            this.a($$0);
            cdx.this.a(bro.a, csz.i);
            this.b = cdx.this.ai + cdx.this.ah.a(100);
         }
      }

      @Override
      public void e() {
         List<chr> $$0 = cdx.this.dN().a(chr.class, cdx.this.cI().c(8.0, 8.0, 8.0), cdx.c);
         csz $$1 = cdx.this.d(bro.a);
         if (!$$1.d()) {
            this.a($$1);
            cdx.this.a(bro.a, csz.i);
         } else if (!$$0.isEmpty()) {
            cdx.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(csz $$0) {
         if (!$$0.d()) {
            double $$1 = cdx.this.dw() - 0.3F;
            chr $$2 = new chr(cdx.this.dN(), cdx.this.ds(), $$1, cdx.this.dy(), $$0);
            $$2.b(40);
            $$2.b(cdx.this);
            float $$3 = 0.3F;
            float $$4 = cdx.this.ah.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cdx.this.ah.i();
            $$2.o(
               (double)(0.3F * -axz.a(cdx.this.dD() * (float) (Math.PI / 180.0)) * axz.b(cdx.this.dF() * (float) (Math.PI / 180.0)) + axz.b($$4) * $$5),
               (double)(0.3F * axz.a(cdx.this.dF() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * axz.b(cdx.this.dD() * (float) (Math.PI / 180.0)) * axz.b(cdx.this.dF() * (float) (Math.PI / 180.0)) + axz.a($$4) * $$5)
            );
            cdx.this.dN().b($$2);
         }
      }
   }
}
