import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bxn extends cig implements bwy {
   public static final int bE = 144;
   private static final int bI = 2;
   private static final int bJ = 3;
   private static final int bK = 1;
   protected static final akg<Byte> bF = akk.a(bxn.class, aki.a);
   protected static final akg<Optional<bvy<bwr>>> bG = akk.a(bxn.class, aki.r);
   private boolean bL;

   protected bxn(bwb<? extends bxn> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bF, (byte)0);
      $$0.a(bG, Optional.empty());
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      bvy<bwr> $$1 = this.d();
      if ($$1 != null) {
         $$1.a($$0, "Owner");
      }

      $$0.a("Sitting", this.bL);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      bvy<bwr> $$1 = bvy.a($$0, "Owner", this.dV());
      if ($$1 != null) {
         try {
            this.al.a(bG, Optional.of($$1));
            this.a(true, false);
         } catch (Throwable var4) {
            this.a(false, true);
         }
      } else {
         this.al.a(bG, Optional.empty());
         this.a(false, true);
      }

      this.bL = $$0.q("Sitting");
      this.x(this.bL);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public boolean a(bvs $$0, float $$1) {
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
      lt $$1 = lv.S;
      if (!$$0) {
         $$1 = lv.ah;
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
      return (this.al.a(bF) & 4) != 0;
   }

   public void a(boolean $$0, boolean $$1) {
      byte $$2 = this.al.a(bF);
      if ($$0) {
         this.al.a(bF, (byte)($$2 | 4));
      } else {
         this.al.a(bF, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean x() {
      return (this.al.a(bF) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(bF);
      if ($$0) {
         this.al.a(bF, (byte)($$1 | 1));
      } else {
         this.al.a(bF, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public bvy<bwr> d() {
      return this.al.a(bG).orElse(null);
   }

   public void j(@Nullable bwr $$0) {
      this.al.a(bG, Optional.ofNullable($$0).map(bvy::new));
   }

   public void a(@Nullable bvy<bwr> $$0) {
      this.al.a(bG, Optional.ofNullable($$0));
   }

   public void a(cqi $$0) {
      this.a(true, true);
      this.j($$0);
      if ($$0 instanceof aro $$1) {
         ap.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bwr $$0) {
      return this.k($$0) ? false : super.c($$0);
   }

   public boolean k(bwr $$0) {
      return $$0 == this.e();
   }

   public boolean a(bwr $$0, bwr $$1) {
      return true;
   }

   @Override
   public fdu cr() {
      if (this.q()) {
         bwr $$0 = this.e();
         if ($$0 != null) {
            return $$0.cr();
         }
      }

      return super.cr();
   }

   @Override
   protected boolean t(bvs $$0) {
      if (this.q()) {
         bwr $$1 = this.e();
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
   public void a(buh $$0) {
      if (this.dV() instanceof arn $$1 && $$1.O().c(dhl.n) && this.e() instanceof aro $$2) {
         $$2.a(this.eR().a());
      }

      super.a($$0);
   }

   public boolean gq() {
      return this.bL;
   }

   public void y(boolean $$0) {
      this.bL = $$0;
   }

   public void gr() {
      bwr $$0 = this.e();
      if ($$0 != null) {
         this.i($$0.dv());
      }
   }

   public boolean gs() {
      bwr $$0 = this.e();
      return $$0 != null && this.g((bvs)this.e()) >= 144.0;
   }

   private void i(jj $$0) {
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
      if (!this.j(new jj($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dL(), this.dN());
         this.bA.m();
         return true;
      }
   }

   private boolean j(jj $$0) {
      evk $$1 = evp.b(this, $$0);
      if ($$1 != evk.c) {
         return false;
      } else {
         dym $$2 = this.dV().a_($$0.e());
         if (!this.gu() && $$2.b() instanceof dpi) {
            return false;
         } else {
            jj $$3 = $$0.b(this.dv());
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

   public class a extends ceg {
      public a(final double param3, final axp<buj> bxn.this) {
         super(bxn.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bxn.this, $$1);
      }

      @Override
      public void a() {
         if (!bxn.this.gt() && bxn.this.gs()) {
            bxn.this.gr();
         }

         super.a();
      }
   }
}
