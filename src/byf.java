import java.util.Optional;
import javax.annotation.Nullable;

public abstract class byf extends ciz implements bxq {
   public static final int bG = 144;
   private static final int bK = 2;
   private static final int bL = 3;
   private static final int bM = 1;
   protected static final akj<Byte> bH = akn.a(byf.class, akl.a);
   protected static final akj<Optional<bwo<bxj>>> bI = akn.a(byf.class, akl.r);
   private boolean bN;

   protected byf(bwr<? extends byf> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bH, (byte)0);
      $$0.a(bI, Optional.empty());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      bwo<bxj> $$1 = this.d();
      if ($$1 != null) {
         $$1.a($$0, "Owner");
      }

      $$0.a("Sitting", this.bN);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      bwo<bxj> $$1 = bwo.a($$0, "Owner", this.dU());
      if ($$1 != null) {
         try {
            this.al.a(bI, Optional.of($$1));
            this.a(true, false);
         } catch (Throwable var4) {
            this.a(false, true);
         }
      } else {
         this.al.a(bI, Optional.empty());
         this.a(false, true);
      }

      this.bN = $$0.o("Sitting");
      this.x(this.bN);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public boolean a(bwi $$0, float $$1) {
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
      lw $$1 = ly.S;
      if (!$$0) {
         $$1 = ly.ah;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dU().a($$1, this.d(1.0), this.dC() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
      return (this.al.a(bH) & 4) != 0;
   }

   public void a(boolean $$0, boolean $$1) {
      byte $$2 = this.al.a(bH);
      if ($$0) {
         this.al.a(bH, (byte)($$2 | 4));
      } else {
         this.al.a(bH, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean x() {
      return (this.al.a(bH) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(bH);
      if ($$0) {
         this.al.a(bH, (byte)($$1 | 1));
      } else {
         this.al.a(bH, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public bwo<bxj> d() {
      return this.al.a(bI).orElse(null);
   }

   public void i(@Nullable bxj $$0) {
      this.al.a(bI, Optional.ofNullable($$0).map(bwo::new));
   }

   public void a(@Nullable bwo<bxj> $$0) {
      this.al.a(bI, Optional.ofNullable($$0));
   }

   public void a(crj $$0) {
      this.a(true, true);
      this.i($$0);
      if ($$0 instanceof arr $$1) {
         aq.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bxj $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bxj $$0) {
      return $$0 == this.e();
   }

   public boolean a(bxj $$0, bxj $$1) {
      return true;
   }

   @Nullable
   @Override
   public ffx cp() {
      ffx $$0 = super.cp();
      if ($$0 != null) {
         return $$0;
      } else {
         if (this.q()) {
            bxj $$1 = this.P_();
            if ($$1 != null) {
               return $$1.cp();
            }
         }

         return null;
      }
   }

   @Override
   protected boolean t(bwi $$0) {
      if (this.q()) {
         bxj $$1 = this.P_();
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
   public void a(bux $$0) {
      if (this.dU() instanceof arq $$1 && $$1.O().c(djd.o) && this.e() instanceof arr $$2) {
         $$2.a(this.eR().a());
      }

      super.a($$0);
   }

   public boolean gt() {
      return this.bN;
   }

   public void y(boolean $$0) {
      this.bN = $$0;
   }

   public void gu() {
      bxj $$0 = this.e();
      if ($$0 != null) {
         this.h($$0.du());
      }
   }

   public boolean gv() {
      bxj $$0 = this.e();
      return $$0 != null && this.g((bwi)this.e()) >= 144.0;
   }

   private void h(iv $$0) {
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
      if (!this.i(new iv($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dK(), this.dM());
         this.bC.m();
         return true;
      }
   }

   private boolean i(iv $$0) {
      exm $$1 = exr.b(this, $$0);
      if ($$1 != exm.c) {
         return false;
      } else {
         eao $$2 = this.dU().a_($$0.e());
         if (!this.gx() && $$2.b() instanceof drc) {
            return false;
         } else {
            iv $$3 = $$0.b(this.du());
            return this.dU().a(this, this.cQ().a($$3));
         }
      }
   }

   public final boolean gw() {
      return this.gt() || this.bX() || this.M_() || this.e() != null && this.e().V_();
   }

   protected boolean gx() {
      return false;
   }

   public class a extends cey {
      public a(final double param3, final axr<buz> byf.this) {
         super(byf.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(byf.this, $$1);
      }

      @Override
      public void a() {
         if (!byf.this.gw() && byf.this.gv()) {
            byf.this.gu();
         }

         super.a();
      }
   }
}
