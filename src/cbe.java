import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cbe extends bos {
   protected static final int bZ = 6000;
   private int bX;
   @Nullable
   private UUID bY;

   protected cbe(bpd<? extends cbe> $$0, cxb $$1) {
      super($$0, $$1);
      this.a(ejg.n, 16.0F);
      this.a(ejg.o, -1.0F);
   }

   @Override
   protected void Y() {
      if (this.g() != 0) {
         this.bX = 0;
      }

      super.Y();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.g() != 0) {
         this.bX = 0;
      }

      if (this.bX > 0) {
         this.bX--;
         if (this.bX % 10 == 0) {
            double $$0 = this.ag.k() * 0.02;
            double $$1 = this.ag.k() * 0.02;
            double $$2 = this.ag.k() * 0.02;
            this.dM().a(kc.P, this.d(1.0), this.du() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         this.bX = 0;
         return super.a($$0, $$1);
      }
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      return $$1.a_($$0.d()).a(dae.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("InLove", this.bX);
      if (this.bY != null) {
         $$0.a("LoveCause", this.bY);
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.bX = $$0.h("InLove");
      this.bY = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bpd<? extends cbe> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      boolean $$5 = bpt.b($$2) || a($$1, $$3);
      return $$1.a_($$3.d()).a(aun.bQ) && $$5;
   }

   protected static boolean a(cwe $$0, ib $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int O() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   public int eg() {
      return 1 + this.dM().z.a(3);
   }

   public boolean o(cqm $$0) {
      return $$0.a(cqp.pv);
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if (this.o($$2)) {
         int $$3 = this.g();
         if (!this.dM().B && $$3 == 0 && this.go()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            return bnd.a;
         }

         if (this.o_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            return bnd.a(this.dM().B);
         }

         if (this.dM().B) {
            return bnd.b;
         }
      }

      return super.b($$0, $$1);
   }

   protected void a(ciu $$0, bnc $$1, cqm $$2) {
      $$2.a(1, $$0);
   }

   public boolean go() {
      return this.bX <= 0;
   }

   public void g(@Nullable ciu $$0) {
      this.bX = 600;
      if ($$0 != null) {
         this.bY = $$0.cw();
      }

      this.dM().a(this, (byte)18);
   }

   public void t(int $$0) {
      this.bX = $$0;
   }

   public int gp() {
      return this.bX;
   }

   @Nullable
   public apg gq() {
      if (this.bY == null) {
         return null;
      } else {
         ciu $$0 = this.dM().b(this.bY);
         return $$0 instanceof apg ? (apg)$$0 : null;
      }
   }

   public boolean gr() {
      return this.bX > 0;
   }

   public void gs() {
      this.bX = 0;
   }

   public boolean a(cbe $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gr() && $$0.gr();
      }
   }

   public void a(apf $$0, cbe $$1) {
      bos $$2 = this.a($$0, (bos)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dr(), this.dt(), this.dx(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(apf $$0, cbe $$1, @Nullable bos $$2) {
      Optional.ofNullable(this.gq()).or(() -> Optional.ofNullable($$1.gq())).ifPresent($$2x -> {
         $$2x.a(aui.P);
         am.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gs();
      $$1.gs();
      $$0.a(this, (byte)18);
      if ($$0.Z().b(cwx.f)) {
         $$0.b(new bpf($$0, this.dr(), this.dt(), this.dx(), this.ei().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ag.k() * 0.02;
            double $$3 = this.ag.k() * 0.02;
            double $$4 = this.ag.k() * 0.02;
            this.dM().a(kc.P, this.d(1.0), this.du() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
