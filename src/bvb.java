import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bvb extends cfv implements bum {
   public static final int bZ = 144;
   private static final int cd = 2;
   private static final int ce = 3;
   private static final int cf = 1;
   protected static final akg<Byte> ca = akk.a(bvb.class, aki.a);
   protected static final akg<Optional<UUID>> cb = akk.a(bvb.class, aki.r);
   private boolean cg;

   protected bvb(btq<? extends bvb> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ca, (byte)0);
      $$0.a(cb, Optional.empty());
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      if (this.Z_() != null) {
         $$0.a("Owner", this.Z_());
      }

      $$0.a("Sitting", this.cg);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = avf.a(this.cS(), $$2);
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
   public boolean A() {
      return true;
   }

   @Override
   public boolean a(btj $$0, float $$1) {
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
      ll $$1 = ln.Q;
      if (!$$0) {
         $$1 = ln.ae;
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
      return (this.am.a(ca) & 4) != 0;
   }

   public void b(boolean $$0, boolean $$1) {
      byte $$2 = this.am.a(ca);
      if ($$0) {
         this.am.a(ca, (byte)($$2 | 4));
      } else {
         this.am.a(ca, (byte)($$2 & -5));
      }

      if ($$1) {
         this.t();
      }
   }

   protected void t() {
   }

   public boolean y() {
      return (this.am.a(ca) & 1) != 0;
   }

   public void y(boolean $$0) {
      byte $$1 = this.am.a(ca);
      if ($$0) {
         this.am.a(ca, (byte)($$1 | 1));
      } else {
         this.am.a(ca, (byte)($$1 & -2));
      }
   }

   @Nullable
   @Override
   public UUID Z_() {
      return this.am.a(cb).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.am.a(cb, Optional.ofNullable($$0));
   }

   public void a(cnp $$0) {
      this.b(true, true);
      this.b($$0.cD());
      if ($$0 instanceof arh $$1) {
         an.y.a($$1, this);
      }
   }

   @Override
   public boolean c(buf $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(buf $$0) {
      return $$0 == this.R_();
   }

   public boolean a(buf $$0, buf $$1) {
      return true;
   }

   @Override
   public ezd co() {
      if (this.q()) {
         buf $$0 = this.R_();
         if ($$0 != null) {
            return $$0.co();
         }
      }

      return super.co();
   }

   @Override
   protected boolean t(btj $$0) {
      if (this.q()) {
         buf $$1 = this.R_();
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
   public void a(bsb $$0) {
      if (!this.dS().B && this.dS().ac().b(ddo.n) && this.R_() instanceof arh) {
         this.R_().a(this.eO().a());
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
      buf $$0 = this.R_();
      if ($$0 != null) {
         this.h($$0.ds());
      }
   }

   public boolean gq() {
      buf $$0 = this.R_();
      return $$0 != null && this.g((btj)this.R_()) >= 144.0;
   }

   private void h(je $$0) {
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
      if (!this.i(new je($$0, $$1, $$2))) {
         return false;
      } else {
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dI(), this.dK());
         this.bS.o();
         return true;
      }
   }

   private boolean i(je $$0) {
      eqs $$1 = eqx.b(this, $$0);
      if ($$1 != eqs.c) {
         return false;
      } else {
         dua $$2 = this.dS().a_($$0.e());
         if (!this.gs() && $$2.b() instanceof dlf) {
            return false;
         } else {
            je $$3 = $$0.b(this.ds());
            return this.dS().a(this, this.cO().a($$3));
         }
      }
   }

   public final boolean gr() {
      return this.go() || this.bW() || this.L_() || this.R_() != null && this.R_().P_();
   }

   protected boolean gs() {
      return false;
   }

   public class a extends cbv {
      public a(final double param3, final axi<bsd> bvb.this) {
         super(bvb.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bvb.this, $$1);
      }

      @Override
      public void a() {
         if (!bvb.this.gr() && bvb.this.gq()) {
            bvb.this.gp();
         }

         super.a();
      }
   }
}
