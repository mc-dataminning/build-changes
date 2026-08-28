import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bxc extends chw implements bwm {
   public static final int bZ = 144;
   private static final int cd = 2;
   private static final int ce = 3;
   private static final int cf = 1;
   protected static final alc<Byte> ca = alg.a(bxc.class, ale.a);
   protected static final alc<Optional<UUID>> cb = alg.a(bxc.class, ale.r);
   private boolean cg;

   protected bxc(bvq<? extends bxc> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ca, (byte)0);
      $$0.a(cb, Optional.empty());
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      if (this.ab_() != null) {
         $$0.a("Owner", this.ab_());
      }

      $$0.a("Sitting", this.cg);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = awh.a(this.cV(), $$2);
      }

      if ($$1 != null) {
         try {
            this.b($$1);
            this.b(true, false);
         } catch (Throwable var4) {
            this.b(false, true);
         }
      }

      this.cg = $$0.q("Sitting");
      this.y(this.cg);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   public boolean a(bvj $$0, float $$1) {
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
      lq $$1 = ls.Q;
      if (!$$0) {
         $$1 = ls.af;
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
      return (this.al.a(ca) & 4) != 0;
   }

   public void b(boolean $$0, boolean $$1) {
      byte $$2 = this.al.a(ca);
      if ($$0) {
         this.al.a(ca, (byte)($$2 | 4));
      } else {
         this.al.a(ca, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean x() {
      return (this.al.a(ca) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.al.a(ca);
      if ($$0) {
         this.al.a(ca, (byte)($$1 | 1));
      } else {
         this.al.a(ca, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID ab_() {
      return this.al.a(cb).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.al.a(cb, Optional.ofNullable($$0));
   }

   public void a(cpw $$0) {
      this.b(true, true);
      this.b($$0.cG());
      if ($$0 instanceof asi $$1) {
         ao.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bwf $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bwf $$0) {
      return $$0 == this.ah_();
   }

   public boolean a(bwf $$0, bwf $$1) {
      return true;
   }

   @Override
   public fcx cr() {
      if (this.p()) {
         bwf $$0 = this.ah_();
         if ($$0 != null) {
            return $$0.cr();
         }
      }

      return super.cr();
   }

   @Override
   protected boolean t(bvj $$0) {
      if (this.p()) {
         bwf $$1 = this.ah_();
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
   public void a(btz $$0) {
      if (this.dW() instanceof ash $$1 && $$1.N().b(dhd.n) && this.ah_() instanceof asi $$2) {
         $$2.a(this.eQ().a());
      }

      super.a($$0);
   }

   public boolean go() {
      return this.cg;
   }

   public void z(boolean $$0) {
      this.cg = $$0;
   }

   public void gp() {
      bwf $$0 = this.ah_();
      if ($$0 != null) {
         this.h($$0.dw());
      }
   }

   public boolean gq() {
      bwf $$0 = this.ah_();
      return $$0 != null && this.g((bvj)this.ah_()) >= 144.0;
   }

   private void h(jh $$0) {
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
      if (!this.i(new jh($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dM(), this.dO());
         this.bS.o();
         return true;
      }
   }

   private boolean i(jh $$0) {
      eun $$1 = eus.b(this, $$0);
      if ($$1 != eun.c) {
         return false;
      } else {
         dxu $$2 = this.dW().a_($$0.e());
         if (!this.gs() && $$2.b() instanceof dox) {
            return false;
         } else {
            jh $$3 = $$0.b(this.dw());
            return this.dW().a(this, this.cR().a($$3));
         }
      }
   }

   public final boolean gr() {
      return this.go() || this.bZ() || this.q() || this.ah_() != null && this.ah_().aa_();
   }

   protected boolean gs() {
      return false;
   }

   public class a extends cdw {
      public a(final double param3, final ayk<bub> bxc.this) {
         super(bxc.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bxc.this, $$1);
      }

      @Override
      public void a() {
         if (!bxc.this.gr() && bxc.this.gq()) {
            bxc.this.gp();
         }

         super.a();
      }
   }
}
