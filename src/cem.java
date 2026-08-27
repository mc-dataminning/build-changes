import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cem extends cfg {
   private static final ajy<ir> d = akc.a(cem.class, aka.o);
   private static final ajy<Boolean> e = akc.a(cem.class, aka.k);
   private static final ajy<Integer> ch = akc.a(cem.class, aka.b);
   static final cde ci = cde.b().a(10.0).d();
   public static final int b = 4800;
   private static final int cj = 2400;
   public static final Predicate<cig> c = $$0 -> !$$0.y() && $$0.bI() && $$0.bi();

   public cem(bsb<? extends cem> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new byq(this, 85, 10, 0.02F, 0.1F, true);
      this.bX = new byp(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.k(this.cp());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void e(ir $$0) {
      this.as.a(d, $$0);
   }

   public ir r() {
      return this.as.a(d);
   }

   public boolean t() {
      return this.as.a(e);
   }

   public void w(boolean $$0) {
      this.as.a(e, $$0);
   }

   public int x() {
      return this.as.a(ch);
   }

   public void c(int $$0) {
      this.as.a(ch, $$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(d, ir.c);
      $$0.a(e, false);
      $$0.a(ch, 2400);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.r().u());
      $$0.a("TreasurePosY", this.r().v());
      $$0.a("TreasurePosZ", this.r().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(uk $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.e(new ir($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void y() {
      this.cb.a(0, new byw(this));
      this.cb.a(0, new cav(this));
      this.cb.a(1, new cem.a(this));
      this.cb.a(2, new cem.b(this, 4.0));
      this.cb.a(4, new caj(this, 1.0, 10));
      this.cb.a(4, new cag(this));
      this.cb.a(5, new bzt(this, cly.class, 6.0F));
      this.cb.a(5, new bzb(this, 10));
      this.cb.a(6, new bzv(this, 1.2F, true));
      this.cb.a(8, new cem.c());
      this.cb.a(8, new bzg(this));
      this.cb.a(9, new bys<>(this, ciy.class, 8.0F, 1.0, 1.0));
      this.cc.a(1, new cbd(this, ciy.class).a());
   }

   public static btu.a gy() {
      return bsq.A().a(btv.q, 10.0).a(btv.r, 1.2F).a(btv.c, 3.0);
   }

   @Override
   protected cbz b(dca $$0) {
      return new ccb(this, $$0);
   }

   @Override
   public boolean C(brv $$0) {
      boolean $$1 = $$0.a(this.dX().b((bso)this), (float)((int)this.g(btv.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(avo.gX, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int cp() {
      return 4800;
   }

   @Override
   protected int o(int $$0) {
      return this.cp();
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
   protected boolean o(brv $$0) {
      return true;
   }

   @Override
   public boolean f(cuh $$0) {
      bsc $$1 = bsq.h($$0);
      return !this.d($$1).d() ? false : $$1 == bsc.a && super.f($$0);
   }

   @Override
   protected void b(cig $$0) {
      if (this.d(bsc.a).d()) {
         cuh $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bsc.a, $$1);
            this.f(bsc.a);
            this.a($$0, $$1.G());
            $$0.ao();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.go()) {
         this.k(this.cp());
      } else {
         if (this.bk()) {
            this.c(2400);
         } else {
            this.c(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dX().t(), 1.0F);
            }

            if (this.aE()) {
               this.g(this.dx().b((double)((this.al.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.al.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.al.i() * 360.0F);
               this.d(false);
               this.az = true;
            }
         }

         if (this.dU().C && this.bi() && this.dx().g() > 0.03) {
            ewu $$0 = this.f(0.0F);
            float $$1 = aym.b(this.dK() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = aym.a(this.dK() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.al.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dU()
                  .a(lb.aq, this.dz() - $$0.c * (double)$$3 + (double)$$1, this.dB() - $$0.d, this.dF() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dU()
                  .a(lb.aq, this.dz() - $$0.c * (double)$$3 - (double)$$1, this.dB() - $$0.d, this.dF() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lb.M);
      } else {
         super.b($$0);
      }
   }

   private void a(kz $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.al.k() * 0.01;
         double $$3 = this.al.k() * 0.01;
         double $$4 = this.al.k() * 0.01;
         this.dU().a($$0, this.d(1.0), this.dC() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if (!$$2.d() && $$2.a(awm.aQ)) {
         if (!this.dU().C) {
            this.a(avo.gZ, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bqa.a(this.dU().C);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.ha;
   }

   @Nullable
   @Override
   protected avn n_() {
      return avo.gY;
   }

   @Nullable
   @Override
   protected avn u() {
      return this.bi() ? avo.gW : avo.gV;
   }

   @Override
   protected avn aU() {
      return avo.hd;
   }

   @Override
   protected avn aT() {
      return avo.he;
   }

   protected boolean gz() {
      ir $$0 = this.J().h();
      return $$0 != null ? $$0.a(this.ds(), 12.0) : false;
   }

   @Override
   public void a(ewu $$0) {
      if (this.dg() && this.bi()) {
         this.a(this.fw(), $$0);
         this.a(bst.a, this.dx());
         this.g(this.dx().a(0.9));
         if (this.p() == null) {
            this.g(this.dx().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cly $$0) {
      return true;
   }

   static class a extends bzl {
      private final cem a;
      private boolean b;

      a(cem $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      }

      @Override
      public boolean R_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.t() && this.a.cq() >= 100;
      }

      @Override
      public boolean b() {
         ir $$0 = this.a.r();
         return !ir.a((double)$$0.u(), this.a.dB(), (double)$$0.w()).a(this.a.ds(), 4.0) && !this.b && this.a.cq() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dU() instanceof aqt) {
            aqt $$0 = (aqt)this.a.dU();
            this.b = false;
            this.a.J().n();
            ir $$1 = this.a.du();
            ir $$2 = $$0.a(awp.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.e($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void d() {
         ir $$0 = this.a.r();
         if (ir.a((double)$$0.u(), this.a.dB(), (double)$$0.w()).a(this.a.ds(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         dca $$0 = this.a.dU();
         if (this.a.gz() || this.a.J().l()) {
            ewu $$1 = ewu.b(this.a.r());
            ewu $$2 = cdi.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cdi.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ir $$3 = ir.a($$2);
               if (!$$0.b_($$3).a(awj.a) || !$$0.a_($$3).a(ept.b)) {
                  $$2 = cdi.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.F().a($$2.c, $$2.d, $$2.e, (float)(this.a.aa() + 20), (float)this.a.Z());
            this.a.J().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bzl {
      private final cem a;
      private final double b;
      @Nullable
      private cly c;

      b(cem $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dU().a(cem.ci, this.a);
         return this.c == null ? false : this.c.ch() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.ch() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new brh(brj.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.J().n();
      }

      @Override
      public void e() {
         this.a.F().a(this.c, (float)(this.a.aa() + 20), (float)this.a.Z());
         if (this.a.g(this.c) < 6.25) {
            this.a.J().n();
         } else {
            this.a.J().a(this.c, this.b);
         }

         if (this.c.ch() && this.c.dU().A.a(6) == 0) {
            this.c.b(new brh(brj.D, 100), this.a);
         }
      }
   }

   class c extends bzl {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cem.this.am) {
            return false;
         } else {
            List<cig> $$0 = cem.this.dU().a(cig.class, cem.this.cP().c(8.0, 8.0, 8.0), cem.c);
            return !$$0.isEmpty() || !cem.this.d(bsc.a).d();
         }
      }

      @Override
      public void c() {
         List<cig> $$0 = cem.this.dU().a(cig.class, cem.this.cP().c(8.0, 8.0, 8.0), cem.c);
         if (!$$0.isEmpty()) {
            cem.this.J().a($$0.get(0), 1.2F);
            cem.this.a(avo.hc, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cuh $$0 = cem.this.d(bsc.a);
         if (!$$0.d()) {
            this.a($$0);
            cem.this.a(bsc.a, cuh.i);
            this.b = cem.this.am + cem.this.al.a(100);
         }
      }

      @Override
      public void e() {
         List<cig> $$0 = cem.this.dU().a(cig.class, cem.this.cP().c(8.0, 8.0, 8.0), cem.c);
         cuh $$1 = cem.this.d(bsc.a);
         if (!$$1.d()) {
            this.a($$1);
            cem.this.a(bsc.a, cuh.i);
         } else if (!$$0.isEmpty()) {
            cem.this.J().a($$0.get(0), 1.2F);
         }
      }

      private void a(cuh $$0) {
         if (!$$0.d()) {
            double $$1 = cem.this.dD() - 0.3F;
            cig $$2 = new cig(cem.this.dU(), cem.this.dz(), $$1, cem.this.dF(), $$0);
            $$2.b(40);
            $$2.b(cem.this);
            float $$3 = 0.3F;
            float $$4 = cem.this.al.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cem.this.al.i();
            $$2.o(
               (double)(0.3F * -aym.a(cem.this.dK() * (float) (Math.PI / 180.0)) * aym.b(cem.this.dM() * (float) (Math.PI / 180.0)) + aym.b($$4) * $$5),
               (double)(0.3F * aym.a(cem.this.dM() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * aym.b(cem.this.dK() * (float) (Math.PI / 180.0)) * aym.b(cem.this.dM() * (float) (Math.PI / 180.0)) + aym.a($$4) * $$5)
            );
            cem.this.dU().b($$2);
         }
      }
   }
}
