import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bwc extends cgw implements bvm {
   public static final int bY = 144;
   private static final int cc = 2;
   private static final int cd = 3;
   private static final int ce = 1;
   protected static final ajx<Byte> bZ = akb.a(bwc.class, ajz.a);
   protected static final ajx<Optional<UUID>> ca = akb.a(bwc.class, ajz.r);
   private boolean cf;

   protected bwc(buq<? extends bwc> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
      $$0.a(ca, Optional.empty());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      if (this.aa_() != null) {
         $$0.a("Owner", this.aa_());
      }

      $$0.a("Sitting", this.cf);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = avb.a(this.cV(), $$2);
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
   public boolean y() {
      return true;
   }

   @Override
   public boolean a(buj $$0, float $$1) {
      if (this.x()) {
         if ($$1 > 10.0F) {
            this.a(true, true);
         }

         return false;
      } else {
         return super.a($$0, $$1);
      }
   }

   protected void x(boolean $$0) {
      lr $$1 = lt.R;
      if (!$$0) {
         $$1 = lt.ag;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dW().a($$1, this.d(1.0), this.dE() + 0.5, this.g(1.0), $$3, $$4, $$5);
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

   public boolean p() {
      return (this.al.a(bZ) & 4) != 0;
   }

   public void b(boolean $$0, boolean $$1) {
      byte $$2 = this.al.a(bZ);
      if ($$0) {
         this.al.a(bZ, (byte)($$2 | 4));
      } else {
         this.al.a(bZ, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean x() {
      return (this.al.a(bZ) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.al.a(bZ);
      if ($$0) {
         this.al.a(bZ, (byte)($$1 | 1));
      } else {
         this.al.a(bZ, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID aa_() {
      return this.al.a(ca).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.al.a(ca, Optional.ofNullable($$0));
   }

   public void a(cov $$0) {
      this.b(true, true);
      this.b($$0.cG());
      if ($$0 instanceof ard $$1) {
         ap.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bvf $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bvf $$0) {
      return $$0 == this.ag_();
   }

   public boolean a(bvf $$0, bvf $$1) {
      return true;
   }

   @Override
   public fby cr() {
      if (this.p()) {
         bvf $$0 = this.ag_();
         if ($$0 != null) {
            return $$0.cr();
         }
      }

      return super.cr();
   }

   @Override
   protected boolean t(buj $$0) {
      if (this.p()) {
         bvf $$1 = this.ag_();
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
   public void a(bsz $$0) {
      if (this.dW() instanceof arc $$1 && $$1.O().b(dgc.n) && this.ag_() instanceof ard $$2) {
         $$2.a(this.eQ().a());
      }

      super.a($$0);
   }

   public boolean gp() {
      return this.cf;
   }

   public void z(boolean $$0) {
      this.cf = $$0;
   }

   public void gq() {
      bvf $$0 = this.ag_();
      if ($$0 != null) {
         this.h($$0.dw());
      }
   }

   public boolean gr() {
      bvf $$0 = this.ag_();
      return $$0 != null && this.g((buj)this.ag_()) >= 144.0;
   }

   private void h(ji $$0) {
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
      if (!this.i(new ji($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dM(), this.dO());
         this.bR.m();
         return true;
      }
   }

   private boolean i(ji $$0) {
      eto $$1 = ett.b(this, $$0);
      if ($$1 != eto.c) {
         return false;
      } else {
         dwv $$2 = this.dW().a_($$0.e());
         if (!this.gt() && $$2.b() instanceof dnw) {
            return false;
         } else {
            ji $$3 = $$0.b(this.dw());
            return this.dW().a(this, this.cR().a($$3));
         }
      }
   }

   public final boolean gs() {
      return this.gp() || this.bZ() || this.q() || this.ag_() != null && this.ag_().Z_();
   }

   protected boolean gt() {
      return false;
   }

   public class a extends ccw {
      public a(final double param3, final axe<btb> bwc.this) {
         super(bwc.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bwc.this, $$1);
      }

      @Override
      public void a() {
         if (!bwc.this.gs() && bwc.this.gr()) {
            bwc.this.gq();
         }

         super.a();
      }
   }
}
