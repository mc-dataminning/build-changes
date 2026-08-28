import java.util.UUID;

public class ckr extends coh implements ckf {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final but e = new but(b, "Drinking speed penalty", -0.25, but.a.a);
   private static final akj<Boolean> bY = akn.a(ckr.class, akl.k);
   private int bZ;
   private ccg<coh> ca;
   private ccf<cmv> cb;

   public ckr(bsy<? extends ckr> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.ca = new ccg<>(this, coh.class, true, $$0 -> $$0 != null && this.gH() && $$0.ak() != bsy.bo);
      this.cb = new ccf<>(this, cmv.class, 10, true, false, null);
      this.bS.a(1, new caf(this));
      this.bS.a(2, new cbk(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cby(this, 1.0));
      this.bS.a(3, new cat(this, cmv.class, 8.0F));
      this.bS.a(3, new cbg(this));
      this.bT.a(1, new ccd(this, coh.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected avy v() {
      return avz.Co;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.Cs;
   }

   @Override
   protected avy o_() {
      return avz.Cq;
   }

   public void y(boolean $$0) {
      this.ap().a(bY, $$0);
   }

   public boolean s() {
      return this.ap().a(bY);
   }

   public static buu.a u() {
      return ckb.gw().a(buv.q, 26.0).a(buv.r, 0.25);
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD()) {
         this.ca.k();
         if (this.ca.i() <= 0) {
            this.cb.a(true);
         } else {
            this.cb.a(false);
         }

         if (this.s()) {
            if (this.bZ-- <= 0) {
               this.y(false);
               cun $$0 = this.eX();
               this.a(bsz.a, cun.l);
               cwo $$1 = $$0.a(km.F);
               if ($$0.a(cuq.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dwt.l);
               this.f(buv.r).b(e.b());
            }
         } else {
            ji<cwm> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awu.a) && !this.b(bsc.m)) {
               $$2 = cwp.w;
            } else if (this.ah.i() < 0.15F && (this.bQ() || this.eC() != null && this.eC().a(awq.j)) && !this.b(bsc.l)) {
               $$2 = cwp.l;
            } else if (this.ah.i() < 0.05F && this.eA() < this.eR()) {
               $$2 = cwp.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(bsc.a) && this.p().g(this) > 121.0) {
               $$2 = cwp.n;
            }

            if ($$2 != null) {
               this.a(bsz.a, cwo.a(cuq.sk, $$2));
               this.bZ = this.eX().u();
               this.y(true);
               if (!this.aW()) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), avz.Cr, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               bur $$3 = this.f(buv.r);
               $$3.b(e.b());
               $$3.c(e);
            }
         }

         if (this.ah.i() < 7.5E-4F) {
            this.dP().a(this, (byte)15);
         }
      }

      super.n_();
   }

   @Override
   public avy ae_() {
      return avz.Cp;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dP().a(li.an, this.du() + this.ah.k() * 0.13F, this.cK().e + 0.5 + this.ah.k() * 0.13F, this.dA() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(brl $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awq.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(btn $$0, float $$1) {
      if (!this.s()) {
         evp $$2 = $$0.ds();
         double $$3 = $$0.du() + $$2.c - this.du();
         double $$4 = $$0.dy() - 1.1F - this.dw();
         double $$5 = $$0.dA() + $$2.e - this.dA();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         ji<cwm> $$7 = cwp.A;
         if ($$0 instanceof coh) {
            if ($$0.eA() <= 4.0F) {
               $$7 = cwp.y;
            } else {
               $$7 = cwp.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bsc.b)) {
            $$7 = cwp.q;
         } else if ($$0.eA() >= 8.0F && !$$0.b(bsc.s)) {
            $$7 = cwp.C;
         } else if ($$6 <= 3.0 && !$$0.b(bsc.r) && this.ah.i() < 0.25F) {
            $$7 = cwp.L;
         }

         cnz $$8 = new cnz(this.dP(), this);
         $$8.a(cwo.a(cuq.vo, $$7));
         $$8.s($$8.dH() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avz.Ct, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
         }

         this.dP().b($$8);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gr() {
      return false;
   }
}
