import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bvs extends cgm implements bvc {
   public static final int bY = 144;
   private static final int cc = 2;
   private static final int cd = 3;
   private static final int ce = 1;
   protected static final akk<Byte> bZ = ako.a(bvs.class, akm.a);
   protected static final akk<Optional<UUID>> ca = ako.a(bvs.class, akm.r);
   private boolean cf;

   protected bvs(bug<? extends bvs> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
      $$0.a(ca, Optional.empty());
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      if (this.ab_() != null) {
         $$0.a("Owner", this.ab_());
      }

      $$0.a("Sitting", this.cf);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = avm.a(this.cW(), $$2);
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
   public boolean a(btz $$0, float $$1) {
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
      lo $$1 = lq.Q;
      if (!$$0) {
         $$1 = lq.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dX().a($$1, this.d(1.0), this.dF() + 0.5, this.g(1.0), $$3, $$4, $$5);
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

   public void a(coh $$0) {
      this.b(true, true);
      this.b($$0.cH());
      if ($$0 instanceof arn $$1) {
         an.y.a($$1, this);
      }
   }

   @Override
   public boolean c(buv $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(buv $$0) {
      return $$0 == this.T_();
   }

   public boolean a(buv $$0, buv $$1) {
      return true;
   }

   @Override
   public fah cs() {
      if (this.q()) {
         buv $$0 = this.T_();
         if ($$0 != null) {
            return $$0.cs();
         }
      }

      return super.cs();
   }

   @Override
   protected boolean t(btz $$0) {
      if (this.q()) {
         buv $$1 = this.T_();
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
   public void a(bsp $$0) {
      if (!this.dX().C && this.dX().ac().b(der.n) && this.T_() instanceof arn) {
         this.T_().a(this.eT().a());
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
      buv $$0 = this.T_();
      if ($$0 != null) {
         this.h($$0.dx());
      }
   }

   public boolean gx() {
      buv $$0 = this.T_();
      return $$0 != null && this.g((btz)this.T_()) >= 144.0;
   }

   private void h(jg $$0) {
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
      if (!this.i(new jg($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dN(), this.dP());
         this.bR.o();
         return true;
      }
   }

   private boolean i(jg $$0) {
      erv $$1 = esa.b(this, $$0);
      if ($$1 != erv.c) {
         return false;
      } else {
         dvd $$2 = this.dX().a_($$0.e());
         if (!this.gz() && $$2.b() instanceof dmh) {
            return false;
         } else {
            jg $$3 = $$0.b(this.dx());
            return this.dX().a(this, this.cS().a($$3));
         }
      }
   }

   public final boolean gy() {
      return this.gv() || this.ca() || this.N_() || this.T_() != null && this.T_().R_();
   }

   protected boolean gz() {
      return false;
   }

   public class a extends ccm {
      public a(final double param3, final axp<bsr> bvs.this) {
         super(bvs.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bvs.this, $$1);
      }

      @Override
      public void a() {
         if (!bvs.this.gy() && bvs.this.gx()) {
            bvs.this.gw();
         }

         super.a();
      }
   }
}
