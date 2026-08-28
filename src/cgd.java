import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cgd extends btk {
   protected static final int cb = 6000;
   private int bY;
   @Nullable
   private UUID bZ;

   protected cgd(bty<? extends cgd> $$0, dej $$1) {
      super($$0, $$1);
      this.a(erk.n, 16.0F);
      this.a(erk.o, -1.0F);
   }

   public static bvt.a gt() {
      return bup.E().a(bvu.E, 10.0);
   }

   @Override
   protected void ac() {
      if (this.g() != 0) {
         this.bY = 0;
      }

      super.ac();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.g() != 0) {
         this.bY = 0;
      }

      if (this.bY > 0) {
         this.bY--;
         if (this.bY % 10 == 0) {
            double $$0 = this.af.k() * 0.02;
            double $$1 = this.af.k() * 0.02;
            double $$2 = this.af.k() * 0.02;
            this.dS().a(lo.Q, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void f(bsj $$0, float $$1) {
      this.gz();
      super.f($$0, $$1);
   }

   @Override
   public float a(jf $$0, dem $$1) {
      return $$1.a_($$0.e()).a(dho.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("InLove", this.bY);
      if (this.bZ != null) {
         $$0.a("LoveCause", this.bZ);
      }
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.bY = $$0.h("InLove");
      this.bZ = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bty<? extends cgd> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      boolean $$5 = btx.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(awv.bX) && $$5;
   }

   protected static boolean a(ddl $$0, jf $$1) {
      return $$0.b($$1, 0) > 8;
   }

   @Override
   public int T() {
      return 120;
   }

   @Override
   public boolean h(double $$0) {
      return false;
   }

   @Override
   protected int el() {
      return 1 + this.dS().z.a(3);
   }

   public abstract boolean n(cvs var1);

   @Override
   public brs b(cnx $$0, brr $$1) {
      cvs $$2 = $$0.b($$1);
      if (this.n($$2)) {
         int $$3 = this.g();
         if (!this.dS().B && $$3 == 0 && this.gv()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gu();
            return brs.b;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gu();
            return brs.a;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gu() {
   }

   protected void a(cnx $$0, brr $$1, cvs $$2) {
      $$2.a(1, $$0);
   }

   public boolean gv() {
      return this.bY <= 0;
   }

   public void f(@Nullable cnx $$0) {
      this.bY = 600;
      if ($$0 != null) {
         this.bZ = $$0.cD();
      }

      this.dS().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bY = $$0;
   }

   public int gw() {
      return this.bY;
   }

   @Nullable
   public ark gx() {
      if (this.bZ == null) {
         return null;
      } else {
         cnx $$0 = this.dS().b(this.bZ);
         return $$0 instanceof ark ? (ark)$$0 : null;
      }
   }

   public boolean gy() {
      return this.bY > 0;
   }

   public void gz() {
      this.bY = 0;
   }

   public boolean a(cgd $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gy() && $$0.gy();
      }
   }

   public void a(arj $$0, cgd $$1) {
      btk $$2 = this.a($$0, (btk)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dx(), this.dz(), this.dD(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arj $$0, cgd $$1, @Nullable btk $$2) {
      Optional.ofNullable(this.gx()).or(() -> Optional.ofNullable($$1.gx())).ifPresent($$2x -> {
         $$2x.a(awq.P);
         an.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gz();
      $$1.gz();
      $$0.a(this, (byte)18);
      if ($$0.ac().b(def.f)) {
         $$0.b(new bud($$0, this.dx(), this.dz(), this.dD(), this.dV().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = this.af.k() * 0.02;
            this.dS().a(lo.Q, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
