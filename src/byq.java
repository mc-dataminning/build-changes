import java.util.Optional;
import javax.annotation.Nullable;

public abstract class byq extends cjk implements byb {
   public static final int bI = 144;
   private static final int bM = 2;
   private static final int bN = 3;
   private static final int bO = 1;
   private static final boolean bP = false;
   protected static final akl<Byte> bJ = akp.a(byq.class, akn.a);
   protected static final akl<Optional<bwz<bxu>>> bK = akp.a(byq.class, akn.r);
   private boolean bQ = false;

   protected byq(bxc<? extends byq> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bJ, (byte)0);
      $$0.a(bK, Optional.empty());
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      bwz<bxu> $$1 = this.d();
      if ($$1 != null) {
         $$1.a($$0, "Owner");
      }

      $$0.a("Sitting", this.bQ);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      bwz<bxu> $$1 = bwz.a($$0, "Owner", this.dV());
      if ($$1 != null) {
         try {
            this.al.a(bK, Optional.of($$1));
            this.a(true, false);
         } catch (Throwable var4) {
            this.a(false, true);
         }
      } else {
         this.al.a(bK, Optional.empty());
         this.a(false, true);
      }

      this.bQ = $$0.b("Sitting", false);
      this.x(this.bQ);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public boolean a(bwt $$0, float $$1) {
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
      return (this.al.a(bJ) & 4) != 0;
   }

   public void a(boolean $$0, boolean $$1) {
      byte $$2 = this.al.a(bJ);
      if ($$0) {
         this.al.a(bJ, (byte)($$2 | 4));
      } else {
         this.al.a(bJ, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean x() {
      return (this.al.a(bJ) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(bJ);
      if ($$0) {
         this.al.a(bJ, (byte)($$1 | 1));
      } else {
         this.al.a(bJ, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public bwz<bxu> d() {
      return this.al.a(bK).orElse(null);
   }

   public void i(@Nullable bxu $$0) {
      this.al.a(bK, Optional.ofNullable($$0).map(bwz::new));
   }

   public void a(@Nullable bwz<bxu> $$0) {
      this.al.a(bK, Optional.ofNullable($$0));
   }

   public void a(crx $$0) {
      this.a(true, true);
      this.i($$0);
      if ($$0 instanceof art $$1) {
         aq.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bxu $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bxu $$0) {
      return $$0 == this.e();
   }

   public boolean a(bxu $$0, bxu $$1) {
      return true;
   }

   @Nullable
   @Override
   public fgq cq() {
      fgq $$0 = super.cq();
      if ($$0 != null) {
         return $$0;
      } else {
         if (this.q()) {
            bxu $$1 = this.T_();
            if ($$1 != null) {
               return $$1.cq();
            }
         }

         return null;
      }
   }

   @Override
   protected boolean t(bwt $$0) {
      if (this.q()) {
         bxu $$1 = this.T_();
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
   public void a(bvi $$0) {
      if (this.dV() instanceof ars $$1 && $$1.O().c(djt.o) && this.e() instanceof art $$2) {
         $$2.a(this.eS().a());
      }

      super.a($$0);
   }

   public boolean gu() {
      return this.bQ;
   }

   public void y(boolean $$0) {
      this.bQ = $$0;
   }

   public void gv() {
      bxu $$0 = this.e();
      if ($$0 != null) {
         this.h($$0.dv());
      }
   }

   public boolean gw() {
      bxu $$0 = this.e();
      return $$0 != null && this.g((bwt)this.e()) >= 144.0;
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
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dL(), this.dN());
         this.bE.m();
         return true;
      }
   }

   private boolean i(iv $$0) {
      eyf $$1 = eyk.b(this, $$0);
      if ($$1 != eyf.c) {
         return false;
      } else {
         ebe $$2 = this.dV().a_($$0.e());
         if (!this.gy() && $$2.b() instanceof drs) {
            return false;
         } else {
            iv $$3 = $$0.b(this.dv());
            return this.dV().a(this, this.cR().a($$3));
         }
      }
   }

   public final boolean gx() {
      return this.gu() || this.bY() || this.Q_() || this.e() != null && this.e().Z_();
   }

   protected boolean gy() {
      return false;
   }

   public class a extends cfj {
      public a(final double param3, final axt<bvk> byq.this) {
         super(byq.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(byq.this, $$1);
      }

      @Override
      public void a() {
         if (!byq.this.gx() && byq.this.gw()) {
            byq.this.gv();
         }

         super.a();
      }
   }
}
