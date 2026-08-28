import java.util.Optional;
import javax.annotation.Nullable;

public abstract class bya extends ciu implements bxl {
   public static final int bG = 144;
   private static final int bK = 2;
   private static final int bL = 3;
   private static final int bM = 1;
   protected static final akj<Byte> bH = akn.a(bya.class, akl.a);
   protected static final akj<Optional<bwl<bxe>>> bI = akn.a(bya.class, akl.r);
   private boolean bN;

   protected bya(bwo<? extends bya> $$0, dja $$1) {
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
      bwl<bxe> $$1 = this.d();
      if ($$1 != null) {
         $$1.a($$0, "Owner");
      }

      $$0.a("Sitting", this.bN);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      bwl<bxe> $$1 = bwl.a($$0, "Owner", this.dV());
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

      this.bN = $$0.q("Sitting");
      this.x(this.bN);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public boolean a(bwf $$0, float $$1) {
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
   public bwl<bxe> d() {
      return this.al.a(bI).orElse(null);
   }

   public void i(@Nullable bxe $$0) {
      this.al.a(bI, Optional.ofNullable($$0).map(bwl::new));
   }

   public void a(@Nullable bwl<bxe> $$0) {
      this.al.a(bI, Optional.ofNullable($$0));
   }

   public void a(crc $$0) {
      this.a(true, true);
      this.i($$0);
      if ($$0 instanceof arr $$1) {
         ap.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bxe $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bxe $$0) {
      return $$0 == this.e();
   }

   public boolean a(bxe $$0, bxe $$1) {
      return true;
   }

   @Nullable
   @Override
   public ffq cr() {
      ffq $$0 = super.cr();
      if ($$0 != null) {
         return $$0;
      } else {
         if (this.q()) {
            bxe $$1 = this.P_();
            if ($$1 != null) {
               return $$1.cr();
            }
         }

         return null;
      }
   }

   @Override
   protected boolean t(bwf $$0) {
      if (this.q()) {
         bxe $$1 = this.P_();
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
   public void a(buu $$0) {
      if (this.dV() instanceof arq $$1 && $$1.O().c(diw.o) && this.e() instanceof arr $$2) {
         $$2.a(this.eS().a());
      }

      super.a($$0);
   }

   public boolean gr() {
      return this.bN;
   }

   public void y(boolean $$0) {
      this.bN = $$0;
   }

   public void gs() {
      bxe $$0 = this.e();
      if ($$0 != null) {
         this.h($$0.dv());
      }
   }

   public boolean gt() {
      bxe $$0 = this.e();
      return $$0 != null && this.g((bwf)this.e()) >= 144.0;
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
         this.bC.m();
         return true;
      }
   }

   private boolean i(iu $$0) {
      exf $$1 = exk.b(this, $$0);
      if ($$1 != exf.c) {
         return false;
      } else {
         eah $$2 = this.dV().a_($$0.e());
         if (!this.gv() && $$2.b() instanceof dqv) {
            return false;
         } else {
            iu $$3 = $$0.b(this.dv());
            return this.dV().a(this, this.cR().a($$3));
         }
      }
   }

   public final boolean gu() {
      return this.gr() || this.bZ() || this.M_() || this.e() != null && this.e().V_();
   }

   protected boolean gv() {
      return false;
   }

   public class a extends cet {
      public a(final double param3, final axr<buw> bya.this) {
         super(bya.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bya.this, $$1);
      }

      @Override
      public void a() {
         if (!bya.this.gu() && bya.this.gt()) {
            bya.this.gs();
         }

         super.a();
      }
   }
}
