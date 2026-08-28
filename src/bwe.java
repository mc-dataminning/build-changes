import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class bwe extends cgy implements bvo {
   public static final int bY = 144;
   private static final int cc = 2;
   private static final int cd = 3;
   private static final int ce = 1;
   protected static final akm<Byte> bZ = akq.a(bwe.class, ako.a);
   protected static final akm<Optional<UUID>> ca = akq.a(bwe.class, ako.r);
   private boolean cf;

   protected bwe(bus<? extends bwe> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
      $$0.a(ca, Optional.empty());
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (this.Z_() != null) {
         $$0.a("Owner", this.Z_());
      }

      $$0.a("Sitting", this.cf);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      UUID $$1;
      if ($$0.b("Owner")) {
         $$1 = $$0.a("Owner");
      } else {
         String $$2 = $$0.l("Owner");
         $$1 = avp.a(this.cV(), $$2);
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
   public boolean a(bul $$0, float $$1) {
      if (this.v()) {
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
         double $$3 = this.ae.k() * 0.02;
         double $$4 = this.ae.k() * 0.02;
         double $$5 = this.ae.k() * 0.02;
         this.dV().a($$1, this.d(1.0), this.dD() + 0.5, this.g(1.0), $$3, $$4, $$5);
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
   public boolean n() {
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
         this.q();
      }
   }

   protected void q() {
   }

   public boolean v() {
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
   public UUID Z_() {
      return this.al.a(ca).orElse(null);
   }

   public void b(@Nullable UUID $$0) {
      this.al.a(ca, Optional.ofNullable($$0));
   }

   public void a(cou $$0) {
      this.b(true, true);
      this.b($$0.cG());
      if ($$0 instanceof arq $$1) {
         ao.y.a($$1, this);
      }
   }

   @Override
   public boolean c(bvh $$0) {
      return this.j($$0) ? false : super.c($$0);
   }

   public boolean j(bvh $$0) {
      return $$0 == this.ag_();
   }

   public boolean a(bvh $$0, bvh $$1) {
      return true;
   }

   @Override
   public fay cr() {
      if (this.n()) {
         bvh $$0 = this.ag_();
         if ($$0 != null) {
            return $$0.cr();
         }
      }

      return super.cr();
   }

   @Override
   protected boolean t(bul $$0) {
      if (this.n()) {
         bvh $$1 = this.ag_();
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
   public void a(btb $$0) {
      if (this.dV() instanceof arp $$1 && $$1.N().b(dfi.n) && this.ag_() instanceof arq $$2) {
         $$2.a(this.eP().a());
      }

      super.a($$0);
   }

   public boolean gm() {
      return this.cf;
   }

   public void z(boolean $$0) {
      this.cf = $$0;
   }

   public void gn() {
      bvh $$0 = this.ag_();
      if ($$0 != null) {
         this.h($$0.dv());
      }
   }

   public boolean go() {
      bvh $$0 = this.ag_();
      return $$0 != null && this.g((bul)this.ag_()) >= 144.0;
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
         this.b((double)$$0 + 0.5, (double)$$1, (double)$$2 + 0.5, this.dL(), this.dN());
         this.bR.o();
         return true;
      }
   }

   private boolean i(jh $$0) {
      esm $$1 = esr.b(this, $$0);
      if ($$1 != esm.c) {
         return false;
      } else {
         dvv $$2 = this.dV().a_($$0.e());
         if (!this.gq() && $$2.b() instanceof dmz) {
            return false;
         } else {
            jh $$3 = $$0.b(this.dv());
            return this.dV().a(this, this.cR().a($$3));
         }
      }
   }

   public final boolean gp() {
      return this.gm() || this.bZ() || this.O_() || this.ag_() != null && this.ag_().Y_();
   }

   protected boolean gq() {
      return false;
   }

   public class a extends ccy {
      public a(final double param3, final axs<btd> bwe.this) {
         super(bwe.this, $$1, $$2);
      }

      public a(final double $$1) {
         super(bwe.this, $$1);
      }

      @Override
      public void a() {
         if (!bwe.this.gp() && bwe.this.go()) {
            bwe.this.gn();
         }

         super.a();
      }
   }
}
