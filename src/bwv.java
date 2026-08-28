import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bwv extends chp implements bwf {
   public static final int bF = 144;
   private static final int bJ = 2;
   private static final int bK = 3;
   private static final int bL = 1;
   protected static final ajx<Byte> bG = akb.a(bwv.class, ajz.a);
   protected static final ajx<Optional<bvf<bvy>>> bH = akb.a(bwv.class, ajz.r);
   private boolean bM;

   protected bwv(bvi<? extends bwv> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bG, (byte)0);
      $$0.a(bH, Optional.empty());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      bvf<bvy> $$1 = this.W_();
      if ($$1 != null) {
         $$1.a($$0, "Owner");
      }

      $$0.a("Sitting", this.bM);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      bvf<bvy> $$1 = bvf.a($$0, "Owner", this.dU());
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
   public boolean a(bva $$0, float $$1) {
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
      lr $$1 = lt.S;
      if (!$$0) {
         $$1 = lt.ah;
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
   public bvf<bvy> W_() {
      return this.al.a(bH).orElse(null);
   }

   public void j(@Nullable bvy $$0) {
      this.al.a(bH, Optional.ofNullable($$0).map(bvf::new));
   }

   public void a(@Nullable bvf<bvy> $$0) {
      this.al.a(bH, Optional.ofNullable($$0));
   }

   public void a(cpr $$0) {
      this.a(true, true);
      this.j($$0);
      if ($$0 instanceof are $$1) {
         ap.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bvy $$0) {
      return this.k($$0) ? false : super.c($$0);
   }

   public boolean k(bvy $$0) {
      return $$0 == this.ae_();
   }

   public boolean a(bvy $$0, bvy $$1) {
      return true;
   }

   @Override
   public fcx cq() {
      if (this.q()) {
         bvy $$0 = this.ae_();
         if ($$0 != null) {
            return $$0.cq();
         }
      }

      return super.cq();
   }

   @Override
   protected boolean t(bva $$0) {
      if (this.q()) {
         bvy $$1 = this.ae_();
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
   public void a(btp $$0) {
      if (this.dU() instanceof ard $$1 && $$1.O().b(dgv.n) && this.ae_() instanceof are $$2) {
         $$2.a(this.eQ().a());
      }

      super.a($$0);
   }

   public boolean gs() {
      return this.bM;
   }

   public void y(boolean $$0) {
      this.bM = $$0;
   }

   public void gt() {
      bvy $$0 = this.ae_();
      if ($$0 != null) {
         this.i($$0.du());
      }
   }

   public boolean gu() {
      bvy $$0 = this.ae_();
      return $$0 != null && this.g((bva)this.ae_()) >= 144.0;
   }

   private void i(ji $$0) {
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
      if (!this.j(new ji($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dK(), this.dM());
         this.bB.m();
         return true;
      }
   }

   private boolean j(ji $$0) {
      eun $$1 = eus.b(this, $$0);
      if ($$1 != eun.c) {
         return false;
      } else {
         dxq $$2 = this.dU().a_($$0.e());
         if (!this.gw() && $$2.b() instanceof dos) {
            return false;
         } else {
            ji $$3 = $$0.b(this.du());
            return this.dU().a(this, this.cQ().a($$3));
         }
      }
   }

   public final boolean gv() {
      return this.gs() || this.bY() || this.M_() || this.ae_() != null && this.ae_().U_();
   }

   protected boolean gw() {
      return false;
   }

   public class a extends cdp {
      public a(final double param3, final axf<btr> bwv.this) {
         super(bwv.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bwv.this, $$1);
      }

      @Override
      public void a() {
         if (!bwv.this.gv() && bwv.this.gu()) {
            bwv.this.gt();
         }

         super.a();
      }
   }
}
