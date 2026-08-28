import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bwb extends cgv implements bvl {
   public static final int bY = 144;
   private static final int cc = 2;
   private static final int cd = 3;
   private static final int ce = 1;
   protected static final ako<Byte> bZ = aks.a(bwb.class, akq.a);
   protected static final ako<Optional<UUID>> ca = aks.a(bwb.class, akq.r);
   private boolean cf;

   protected bwb(bup<? extends bwb> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
      $$0.a(ca, Optional.empty());
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      if (this.ab_() != null) {
         $$0.a("Owner", this.ab_());
      }

      $$0.a("Sitting", this.cf);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = avq.a(this.cX(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.b(true, false);
         } catch (Throwable var4) {
            this.b(false, true);
         }
      }

      this.cf = $$0.q("Sitting");
      this.y(this.cf);
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   public boolean a(bui $$0, float $$1) {
      if (this.y()) {
         if ($$1 > 10.0F) {
            this.a(true, true);
         }

         return false;
      } else {
         return super.a($$0, $$1);
      }
   }

   protected void x(boolean $$0) {
      lq $$1 = ls.Q;
      if (!$$0) {
         $$1 = ls.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dY().a($$1, this.d(1.0), this.dG() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 7) {
         this.x(true);
      } else if ($$0 == 6) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   @Override
   public boolean q() {
      return (this.am.a(bZ) & 4) != 0;
   }

   public void b(boolean $$0, boolean $$1) {
      byte $$2 = this.am.a(bZ);
      if ($$0) {
         this.am.a(bZ, (byte)($$2 | 4));
      } else {
         this.am.a(bZ, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean y() {
      return (this.am.a(bZ) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.am.a(bZ);
      if ($$0) {
         this.am.a(bZ, (byte)($$1 | 1));
      } else {
         this.am.a(bZ, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID ab_() {
      return this.am.a(ca).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.am.a(ca, Optional.ofNullable($$0));
   }

   public void a(cor $$0) {
      this.b(true, true);
      this.b($$0.cI());
      if ($$0 instanceof arr $$1) {
         ao.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bve $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bve $$0) {
      return $$0 == this.T_();
   }

   public boolean a(bve $$0, bve $$1) {
      return true;
   }

   @Override
   public far ct() {
      if (this.q()) {
         bve $$0 = this.T_();
         if ($$0 != null) {
            return $$0.ct();
         }
      }

      return super.ct();
   }

   @Override
   protected boolean t(bui $$0) {
      if (this.q()) {
         bve $$1 = this.T_();
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
   public void a(bsy $$0) {
      if (!this.dY().C && this.dY().ac().b(dfb.n) && this.T_() instanceof arr) {
         this.T_().a(this.eU().a());
      }

      super.a($$0);
   }

   public boolean gv() {
      return this.cf;
   }

   public void z(boolean $$0) {
      this.cf = $$0;
   }

   public void gw() {
      bve $$0 = this.T_();
      if ($$0 != null) {
         this.h($$0.dy());
      }
   }

   public boolean gx() {
      bve $$0 = this.T_();
      return $$0 != null && this.g((bui)this.T_()) >= 144.0;
   }

   private void h(jh $$0) {
      for (int $$1 = 0; $$1 < 10; $$1++) {
         int $$2 = this.af.a(-3, 3);
         int $$3 = this.af.a(-3, 3);
         if (Math.abs($$2) >= 2 || Math.abs($$3) >= 2) {
            int $$4 = this.af.a(-1, 1);
            if (this.a($$0.u() + $$2, $$0.v() + $$4, $$0.w() + $$3)) {
               return;
            }
         }
      }
   }

   private boolean a(int $$0, int $$1, int $$2) {
      if (!this.i(new jh($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dO(), this.dQ());
         this.bR.o();
         return true;
      }
   }

   private boolean i(jh $$0) {
      esf $$1 = esk.b(this, $$0);
      if ($$1 != esf.c) {
         return false;
      } else {
         dvo $$2 = this.dY().a_($$0.e());
         if (!this.gz() && $$2.b() instanceof dms) {
            return false;
         } else {
            jh $$3 = $$0.b(this.dy());
            return this.dY().a(this, this.cT().a($$3));
         }
      }
   }

   public final boolean gy() {
      return this.gv() || this.cb() || this.N_() || this.T_() != null && this.T_().R_();
   }

   protected boolean gz() {
      return false;
   }

   public class a extends ccv {
      public a(final double param3, final axt<bta> bwb.this) {
         super(bwb.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bwb.this, $$1);
      }

      @Override
      public void a() {
         if (!bwb.this.gy() && bwb.this.gx()) {
            bwb.this.gw();
         }

         super.a();
      }
   }
}
