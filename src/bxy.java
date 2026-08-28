import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bxy extends cis implements bxj {
   public static final int bF = 144;
   private static final int bJ = 2;
   private static final int bK = 3;
   private static final int bL = 1;
   protected static final akj<Byte> bG = akn.a(bxy.class, akl.a);
   protected static final akj<Optional<bwj<bxc>>> bH = akn.a(bxy.class, akl.r);
   private boolean bM;

   protected bxy(bwm<? extends bxy> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, (byte)0);
      $$0.a(bH, Optional.empty());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      bwj<bxc> $$1 = this.d();
      if ($$1 != null) {
         $$1.a($$0, "Owner");
      }

      $$0.a("Sitting", this.bM);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      bwj<bxc> $$1 = bwj.a($$0, "Owner", this.dV());
      if ($$1 != null) {
         try {
            this.al.a(bH, Optional.of($$1));
            this.a(true, false);
         } catch (Throwable var4) {
            this.a(false, true);
         }
      } else {
         this.al.a(bH, Optional.empty());
         this.a(false, true);
      }

      this.bM = $$0.q("Sitting");
      this.x(this.bM);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public boolean a(bwd $$0, float $$1) {
      if (this.x()) {
         if ($$1 > 10.0F) {
            this.y();
         }

         return false;
      } else {
         return super.a($$0, $$1);
      }
   }

   protected void w(boolean $$0) {
      lv $$1 = lx.S;
      if (!$$0) {
         $$1 = lx.ah;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.w(true);
      } else if ($$0 == 6) {
         this.w(false);
      } else {
         super.b($$0);
      }
   }

   public boolean q() {
      return (this.al.a(bG) & 4) != 0;
   }

   public void a(boolean $$0, boolean $$1) {
      byte $$2 = this.al.a(bG);
      if ($$0) {
         this.al.a(bG, (byte)($$2 | 4));
      } else {
         this.al.a(bG, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean x() {
      return (this.al.a(bG) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(bG);
      if ($$0) {
         this.al.a(bG, (byte)($$1 | 1));
      } else {
         this.al.a(bG, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public bwj<bxc> d() {
      return this.al.a(bH).orElse(null);
   }

   public void i(@Nullable bxc $$0) {
      this.al.a(bH, Optional.ofNullable($$0).map(bwj::new));
   }

   public void a(@Nullable bwj<bxc> $$0) {
      this.al.a(bH, Optional.ofNullable($$0));
   }

   public void a(cqy $$0) {
      this.a(true, true);
      this.i($$0);
      if ($$0 instanceof arr $$1) {
         ap.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bxc $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bxc $$0) {
      return $$0 == this.e();
   }

   public boolean a(bxc $$0, bxc $$1) {
      return true;
   }

   @Override
   public ffi cr() {
      if (this.q()) {
         bxc $$0 = this.e();
         if ($$0 != null) {
            return $$0.cr();
         }
      }

      return super.cr();
   }

   @Override
   protected boolean t(bwd $$0) {
      if (this.q()) {
         bxc $$1 = this.e();
         if ($$0 == $$1) {
            return true;
         }

         if ($$1 != null) {
            return $$1.t($$0);
         }
      }

      return super.t($$0);
   }

   @Override
   public void a(bus $$0) {
      if (this.dV() instanceof arq $$1 && $$1.O().c(dir.n) && this.e() instanceof arr $$2) {
         $$2.a(this.eR().a());
      }

      super.a($$0);
   }

   public boolean gq() {
      return this.bM;
   }

   public void y(boolean $$0) {
      this.bM = $$0;
   }

   public void gr() {
      bxc $$0 = this.e();
      if ($$0 != null) {
         this.h($$0.dv());
      }
   }

   public boolean gs() {
      bxc $$0 = this.e();
      return $$0 != null && this.g((bwd)this.e()) >= 144.0;
   }

   private void h(iu $$0) {
      for (int $$1 = 0; $$1 < 10; $$1++) {
         int $$2 = this.ae.a(-3, 3);
         int $$3 = this.ae.a(-3, 3);
         if (Math.abs($$2) >= 2 || Math.abs($$3) >= 2) {
            int $$4 = this.ae.a(-1, 1);
            if (this.a($$0.u() + $$2, $$0.v() + $$4, $$0.w() + $$3)) {
               return;
            }
         }
      }
   }

   private boolean a(int $$0, int $$1, int $$2) {
      if (!this.i(new iu($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dL(), this.dN());
         this.bB.m();
         return true;
      }
   }

   private boolean i(iu $$0) {
      ewx $$1 = exc.b(this, $$0);
      if ($$1 != ewx.c) {
         return false;
      } else {
         dzz $$2 = this.dV().a_($$0.e());
         if (!this.gu() && $$2.b() instanceof dqp) {
            return false;
         } else {
            iu $$3 = $$0.b(this.dv());
            return this.dV().a(this, this.cR().a($$3));
         }
      }
   }

   public final boolean gt() {
      return this.gq() || this.bZ() || this.M_() || this.e() != null && this.e().U_();
   }

   protected boolean gu() {
      return false;
   }

   public class a extends cer {
      public a(final double param3, final axr<buu> bxy.this) {
         super(bxy.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bxy.this, $$1);
      }

      @Override
      public void a() {
         if (!bxy.this.gt() && bxy.this.gs()) {
            bxy.this.gr();
         }

         super.a();
      }
   }
}
