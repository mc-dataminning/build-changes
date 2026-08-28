import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class chs extends buw {
   protected static final int cc = 6000;
   private int bZ;
   @Nullable
   private UUID ca;

   protected chs(bvm<? extends chs> $$0, dha $$1) {
      super($$0, $$1);
      this.a(eug.n, 16.0F);
      this.a(eug.o, -1.0F);
   }

   public static bxi.a gr() {
      return bwd.C().a(bxj.E, 10.0);
   }

   @Override
   protected void a(ash $$0) {
      if (this.Z_() != 0) {
         this.bZ = 0;
      }

      super.a($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.Z_() != 0) {
         this.bZ = 0;
      }

      if (this.bZ > 0) {
         this.bZ--;
         if (this.bZ % 10 == 0) {
            double $$0 = this.ae.k() * 0.02;
            double $$1 = this.ae.k() * 0.02;
            double $$2 = this.ae.k() * 0.02;
            this.dV().a(ls.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void b(ash $$0, btv $$1, float $$2) {
      this.gx();
      super.b($$0, $$1, $$2);
   }

   @Override
   public float a(jh $$0, dhd $$1) {
      return $$1.a_($$0.e()).a(dkg.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("InLove", this.bZ);
      if (this.ca != null) {
         $$0.a("LoveCause", this.ca);
      }
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.bZ = $$0.h("InLove");
      this.ca = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bvm<? extends chs> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      boolean $$5 = bvl.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(axu.bY) && $$5;
   }

   protected static boolean a(dgc $$0, jh $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int Q() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int e(ash $$0) {
      return 1 + this.ae.a(3);
   }

   public abstract boolean j(cxk var1);

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if (this.j($$2)) {
         int $$3 = this.Z_();
         if (!this.dV().C && $$3 == 0 && this.gt()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gs();
            return bte.b;
         }

         if (this.e_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gs();
            return bte.a;
         }

         if (this.dV().C) {
            return bte.c;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gs() {
   }

   protected void a(cps $$0, btd $$1, cxk $$2) {
      int $$3 = $$2.L();
      daq $$4 = $$2.a(ku.y);
      $$2.a(1, $$0);
      if ($$4 != null) {
         cxk $$5 = $$4.a($$2, $$3, $$0.fT(), $$0::b);
         $$0.a($$1, $$5);
      }
   }

   public boolean gt() {
      return this.bZ <= 0;
   }

   public void f(@Nullable cps $$0) {
      this.bZ = 600;
      if ($$0 != null) {
         this.ca = $$0.cG();
      }

      this.dV().a(this, (byte)18);
   }

   public void r(int $$0) {
      this.bZ = $$0;
   }

   public int gu() {
      return this.bZ;
   }

   @Nullable
   public asi gv() {
      if (this.ca == null) {
         return null;
      } else {
         cps $$0 = this.dV().b(this.ca);
         return $$0 instanceof asi ? (asi)$$0 : null;
      }
   }

   public boolean gw() {
      return this.bZ > 0;
   }

   public void gx() {
      this.bZ = 0;
   }

   public boolean a(chs $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gw() && $$0.gw();
      }
   }

   public void a(ash $$0, chs $$1) {
      buw $$2 = this.a($$0, (buw)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dA(), this.dC(), this.dG(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(ash $$0, chs $$1, @Nullable buw $$2) {
      Optional.ofNullable(this.gv()).or(() -> Optional.ofNullable($$1.gv())).ifPresent($$2x -> {
         $$2x.a(axp.P);
         ao.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gx();
      $$1.gx();
      $$0.a(this, (byte)18);
      if ($$0.N().b(dgw.f)) {
         $$0.b(new bvr($$0, this.dA(), this.dC(), this.dG(), this.dY().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.ae.k() * 0.02;
            double $$3 = this.ae.k() * 0.02;
            double $$4 = this.ae.k() * 0.02;
            this.dV().a(ls.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
