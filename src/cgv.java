import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class cgv extends btz {
   protected static final int cb = 6000;
   private int bY;
   @Nullable
   private UUID bZ;

   protected cgv(bup<? extends cgv> $$0, dff $$1) {
      super($$0, $$1);
      this.a(esf.n, 16.0F);
      this.a(esf.o, -1.0F);
   }

   public static bwl.a gA() {
      return bvg.E().a(bwm.E, 10.0);
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
            this.dY().a(ls.Q, this.d(1.0), this.dG() + 0.5, this.g(1.0), $$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void f(bsy $$0, float $$1) {
      this.gG();
      super.f($$0, $$1);
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      return $$1.a_($$0.e()).a(dil.i) ? 10.0F : $$1.w($$0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("InLove", this.bY);
      if (this.bZ != null) {
         $$0.a("LoveCause", this.bZ);
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.bY = $$0.h("InLove");
      this.bZ = $$0.b("LoveCause") ? $$0.a("LoveCause") : null;
   }

   public static boolean b(bup<? extends cgv> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      boolean $$5 = buo.b($$2) || a($$1, $$3);
      return $$1.a_($$3.e()).a(axd.bX) && $$5;
   }

   protected static boolean a(deh $$0, jh $$1) {
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
   protected int er() {
      return 1 + this.dY().A.a(3);
   }

   public abstract boolean l(cwf var1);

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if (this.l($$2)) {
         int $$3 = this.g();
         if (!this.dY().C && $$3 == 0 && this.gC()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gB();
            return bsh.b;
         }

         if (this.p_()) {
            this.a($$0, $$1, $$2);
            this.a(d_(-$$3), true);
            this.gB();
            return bsh.a;
         }
      }

      return super.b($$0, $$1);
   }

   protected void gB() {
   }

   protected void a(cor $$0, bsg $$1, cwf $$2) {
      $$2.a(1, $$0);
   }

   public boolean gC() {
      return this.bY <= 0;
   }

   public void f(@Nullable cor $$0) {
      this.bY = 600;
      if ($$0 != null) {
         this.bZ = $$0.cI();
      }

      this.dY().a(this, (byte)18);
   }

   public void s(int $$0) {
      this.bY = $$0;
   }

   public int gD() {
      return this.bY;
   }

   @Nullable
   public arr gE() {
      if (this.bZ == null) {
         return null;
      } else {
         cor $$0 = this.dY().b(this.bZ);
         return $$0 instanceof arr ? (arr)$$0 : null;
      }
   }

   public boolean gF() {
      return this.bY > 0;
   }

   public void gG() {
      this.bY = 0;
   }

   public boolean a(cgv $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return $$0.getClass() != this.getClass() ? false : this.gF() && $$0.gF();
      }
   }

   public void a(arq $$0, cgv $$1) {
      btz $$2 = this.a($$0, (btz)$$1);
      if ($$2 != null) {
         $$2.a(true);
         $$2.b(this.dD(), this.dF(), this.dJ(), 0.0F, 0.0F);
         this.a($$0, $$1, $$2);
         $$0.a_($$2);
      }
   }

   public void a(arq $$0, cgv $$1, @Nullable btz $$2) {
      Optional.ofNullable(this.gE()).or(() -> Optional.ofNullable($$1.gE())).ifPresent($$2x -> {
         $$2x.a(awy.P);
         ao.p.a($$2x, this, $$1, $$2);
      });
      this.c_(6000);
      $$1.c_(6000);
      this.gG();
      $$1.gG();
      $$0.a(this, (byte)18);
      if ($$0.ac().b(dfb.f)) {
         $$0.b(new buu($$0, this.dD(), this.dF(), this.dJ(), this.eb().a(7) + 1));
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 18) {
         for (int $$1 = 0; $$1 < 7; $$1++) {
            double $$2 = this.af.k() * 0.02;
            double $$3 = this.af.k() * 0.02;
            double $$4 = this.af.k() * 0.02;
            this.dY().a(ls.Q, this.d(1.0), this.dG() + 0.5, this.g(1.0), $$2, $$3, $$4);
         }
      } else {
         super.b($$0);
      }
   }
}
