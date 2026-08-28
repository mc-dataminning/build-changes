import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bxv extends cio implements bxg {
   public static final int bF = 144;
   private static final int bJ = 2;
   private static final int bK = 3;
   private static final int bL = 1;
   protected static final akh<Byte> bG = akl.a(bxv.class, akj.a);
   protected static final akh<Optional<bwg<bwz>>> bH = akl.a(bxv.class, akj.r);
   private boolean bM;

   protected bxv(bwj<? extends bxv> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bG, (byte)0);
      $$0.a(bH, Optional.empty());
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      bwg<bwz> $$1 = this.d();
      if ($$1 != null) {
         $$1.a($$0, "Owner");
      }

      $$0.a("Sitting", this.bM);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      bwg<bwz> $$1 = bwg.a($$0, "Owner", this.dV());
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
   public boolean a(bwa $$0, float $$1) {
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
   public bwg<bwz> d() {
      return this.al.a(bH).orElse(null);
   }

   public void i(@Nullable bwz $$0) {
      this.al.a(bH, Optional.ofNullable($$0).map(bwg::new));
   }

   public void a(@Nullable bwg<bwz> $$0) {
      this.al.a(bH, Optional.ofNullable($$0));
   }

   public void a(cqs $$0) {
      this.a(true, true);
      this.i($$0);
      if ($$0 instanceof arp $$1) {
         ap.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bwz $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bwz $$0) {
      return $$0 == this.e();
   }

   public boolean a(bwz $$0, bwz $$1) {
      return true;
   }

   @Override
   public few cr() {
      if (this.q()) {
         bwz $$0 = this.e();
         if ($$0 != null) {
            return $$0.cr();
         }
      }

      return super.cr();
   }

   @Override
   protected boolean t(bwa $$0) {
      if (this.q()) {
         bwz $$1 = this.e();
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
   public void a(bup $$0) {
      if (this.dV() instanceof aro $$1 && $$1.O().c(dil.n) && this.e() instanceof arp $$2) {
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
      bwz $$0 = this.e();
      if ($$0 != null) {
         this.h($$0.dv());
      }
   }

   public boolean gs() {
      bwz $$0 = this.e();
      return $$0 != null && this.g((bwa)this.e()) >= 144.0;
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
      ewm $$1 = ewr.b(this, $$0);
      if ($$1 != ewm.c) {
         return false;
      } else {
         dzo $$2 = this.dV().a_($$0.e());
         if (!this.gu() && $$2.b() instanceof dqi) {
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

   public class a extends ceo {
      public a(final double param3, final axp<bur> bxv.this) {
         super(bxv.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bxv.this, $$1);
      }

      @Override
      public void a() {
         if (!bxv.this.gt() && bxv.this.gs()) {
            bxv.this.gr();
         }

         super.a();
      }
   }
}
