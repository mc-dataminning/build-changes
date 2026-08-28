import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bvj extends cgd implements buu {
   public static final int bY = 144;
   private static final int cc = 2;
   private static final int cd = 3;
   private static final int ce = 1;
   protected static final akh<Byte> bZ = akl.a(bvj.class, akj.a);
   protected static final akh<Optional<UUID>> ca = akl.a(bvj.class, akj.r);
   private boolean cf;

   protected bvj(bty<? extends bvj> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
      $$0.a(ca, Optional.empty());
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      if (this.aa_() != null) {
         $$0.a("Owner", this.aa_());
      }

      $$0.a("Sitting", this.cf);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = avi.a(this.cS(), $$2);
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
   public boolean a(btr $$0, float $$1) {
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
      lm $$1 = lo.Q;
      if (!$$0) {
         $$1 = lo.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.af.k() * 0.02;
         double $$4 = this.af.k() * 0.02;
         double $$5 = this.af.k() * 0.02;
         this.dS().a($$1, this.d(1.0), this.dA() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   public UUID aa_() {
      return this.am.a(ca).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.am.a(ca, Optional.ofNullable($$0));
   }

   public void a(cnx $$0) {
      this.b(true, true);
      this.b($$0.cD());
      if ($$0 instanceof ark $$1) {
         an.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bun $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bun $$0) {
      return $$0 == this.S_();
   }

   public boolean a(bun $$0, bun $$1) {
      return true;
   }

   @Override
   public ezw co() {
      if (this.q()) {
         bun $$0 = this.S_();
         if ($$0 != null) {
            return $$0.co();
         }
      }

      return super.co();
   }

   @Override
   protected boolean t(btr $$0) {
      if (this.q()) {
         bun $$1 = this.S_();
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
   public void a(bsj $$0) {
      if (!this.dS().B && this.dS().ac().b(def.n) && this.S_() instanceof ark) {
         this.S_().a(this.eO().a());
      }

      super.a($$0);
   }

   public boolean go() {
      return this.cf;
   }

   public void z(boolean $$0) {
      this.cf = $$0;
   }

   public void gp() {
      bun $$0 = this.S_();
      if ($$0 != null) {
         this.h($$0.ds());
      }
   }

   public boolean gq() {
      bun $$0 = this.S_();
      return $$0 != null && this.g((btr)this.S_()) >= 144.0;
   }

   private void h(jf $$0) {
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
      if (!this.i(new jf($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dI(), this.dK());
         this.bR.o();
         return true;
      }
   }

   private boolean i(jf $$0) {
      erk $$1 = erp.b(this, $$0);
      if ($$1 != erk.c) {
         return false;
      } else {
         dus $$2 = this.dS().a_($$0.e());
         if (!this.gs() && $$2.b() instanceof dlw) {
            return false;
         } else {
            jf $$3 = $$0.b(this.ds());
            return this.dS().a(this, this.cO().a($$3));
         }
      }
   }

   public final boolean gr() {
      return this.go() || this.bW() || this.M_() || this.S_() != null && this.S_().Q_();
   }

   protected boolean gs() {
      return false;
   }

   public class a extends ccd {
      public a(final double param3, final axl<bsl> bvj.this) {
         super(bvj.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bvj.this, $$1);
      }

      @Override
      public void a() {
         if (!bvj.this.gr() && bvj.this.gq()) {
            bvj.this.gp();
         }

         super.a();
      }
   }
}
