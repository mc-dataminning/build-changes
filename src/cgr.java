import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cgr extends btv {
   protected static final int cb = 6000;
   private int bY;
   @Nullable
   private UUID bZ;

   protected cgr(bul<? extends cgr> $$0, dfb $$1) {
      super($$0, $$1);
      this.a(esb.n, 16.0F);
      this.a(esb.o, -1.0F);
   }

   public static bwh.a gz() {
      return bvc.E().a(bwi.E, 10.0);
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
            this.dX().a(lr.Q, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void f(bsu $$0, float $$1) {
      this.gF();
      super.f($$0, $$1);
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      return $$1.a_($$0.e()).a(dig.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("InLove", this.bY);
      if (this.bZ != null) {
         $$0.a("LoveCause", this.bZ);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.bY = $$0.h("InLove");
      this.bZ = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bul<? extends cgr> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      boolean $$5 = buk.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(axa.bX) && $$5;
   }

   protected static boolean a(ded $$0, jh $$1) {
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
   protected int eq() {
      return 1 + this.dX().A.a(3);
   }

   public abstract boolean l(cwb var1);

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if (this.l($$2)) {
         int $$3 = this.g();
         if (!this.dX().C && $$3 == 0 && this.gB()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gA();
            return bsd.b;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gA();
            return bsd.a;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gA() {
   }

   protected void a(com $$0, bsc $$1, cwb $$2) {
      $$2.a(1, $$0);
   }

   public boolean gB() {
      return this.bY <= 0;
   }

   public void f(@Nullable com $$0) {
      this.bY = 600;
      if ($$0 != null) {
         this.bZ = $$0.cH();
      }

      this.dX().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bY = $$0;
   }

   public int gC() {
      return this.bY;
   }

   @Nullable
   public aro gD() {
      if (this.bZ == null) {
         return null;
      } else {
         com $$0 = this.dX().b(this.bZ);
         return $$0 instanceof aro ? (aro)$$0 : null;
      }
   }

   public boolean gE() {
      return this.bY > 0;
   }

   public void gF() {
      this.bY = 0;
   }

   public boolean a(cgr $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gE() && $$0.gE();
      }
   }

   public void a(arn $$0, cgr $$1) {
      btv $$2 = this.a($$0, (btv)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dC(), this.dE(), this.dI(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arn $$0, cgr $$1, @Nullable btv $$2) {
      Optional.ofNullable(this.gD()).or(() -> Optional.ofNullable($$1.gD())).ifPresent($$2x -> {
         $$2x.a(awv.P);
         ao.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gF();
      $$1.gF();
      $$0.a(this, (byte)18);
      if ($$0.ac().b(dex.f)) {
         $$0.b(new buq($$0, this.dC(), this.dE(), this.dI(), this.ea().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = this.af.k() * 0.02;
            this.dX().a(lr.Q, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
