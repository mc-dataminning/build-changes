import java.util.UUID;

public class chw extends clm implements chk {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bry e = new bry(b, "Drinking speed penalty", -0.25, bry.a.a);
   private static final aja<Boolean> bX = aje.a(chw.class, ajc.k);
   private int bY;
   private bzl<clm> bZ;
   private bzk<cka> ca;

   public chw(bqg<? extends chw> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bZ = new bzl<>(this, clm.class, true, $$0 -> $$0 != null && this.gC() && $$0.ai() != bqg.bn);
      this.ca = new bzk<>(this, cka.class, 10, true, false, null);
      this.bR.a(1, new bxk(this));
      this.bR.a(2, new byp(this, 1.0, 60, 10.0F));
      this.bR.a(2, new bzd(this, 1.0));
      this.bR.a(3, new bxy(this, cka.class, 8.0F));
      this.bR.a(3, new byl(this));
      this.bS.a(1, new bzi(this, clm.class));
      this.bS.a(2, this.bZ);
      this.bS.a(3, this.ca);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(bX, false);
   }

   @Override
   protected aun v() {
      return auo.BV;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.BZ;
   }

   @Override
   protected aun o_() {
      return auo.BX;
   }

   public void y(boolean $$0) {
      this.an().a(bX, $$0);
   }

   public boolean r() {
      return this.an().a(bX);
   }

   public static brz.a u() {
      return chg.gt().a(bsa.q, 26.0).a(bsa.r, 0.25);
   }

   @Override
   public void n_() {
      if (!this.dM().B && this.bA()) {
         this.bZ.k();
         if (this.bZ.i() <= 0) {
            this.ca.a(true);
         } else {
            this.ca.a(false);
         }

         if (this.r()) {
            if (this.bY-- <= 0) {
               this.y(false);
               crs $$0 = this.eU();
               this.a(bqh.a, crs.i);
               ctq $$1 = $$0.a(jr.x);
               if ($$0.a(crv.sj) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dub.l);
               this.f(bsa.r).b(e.b());
            }
         } else {
            in<cto> $$2 = null;
            if (this.ag.i() < 0.15F && this.a(avj.a) && !this.b(bpo.m)) {
               $$2 = ctr.w;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ez() != null && this.ez().a(avg.j)) && !this.b(bpo.l)) {
               $$2 = ctr.l;
            } else if (this.ag.i() < 0.05F && this.ex() < this.eO()) {
               $$2 = ctr.y;
            } else if (this.ag.i() < 0.5F && this.p() != null && !this.b(bpo.a) && this.p().g(this) > 121.0) {
               $$2 = ctr.n;
            }

            if ($$2 != null) {
               this.a(bqh.a, ctq.a(crv.sj, $$2));
               this.bY = this.eU().t();
               this.y(true);
               if (!this.aU()) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.BY, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               brw $$3 = this.f(bsa.r);
               $$3.b(e.b());
               $$3.c(e);
            }
         }

         if (this.ag.i() < 7.5E-4F) {
            this.dM().a(this, (byte)15);
         }
      }

      super.n_();
   }

   @Override
   public aun ae_() {
      return auo.BW;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dM().a(kn.al, this.dr() + this.ag.k() * 0.13F, this.cH().e + 0.5 + this.ag.k() * 0.13F, this.dx() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(boy $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(avg.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bqt $$0, float $$1) {
      if (!this.r()) {
         esj $$2 = $$0.dp();
         double $$3 = $$0.dr() + $$2.c - this.dr();
         double $$4 = $$0.dv() - 1.1F - this.dt();
         double $$5 = $$0.dx() + $$2.e - this.dx();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         in<cto> $$7 = ctr.A;
         if ($$0 instanceof clm) {
            if ($$0.ex() <= 4.0F) {
               $$7 = ctr.y;
            } else {
               $$7 = ctr.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bpo.b)) {
            $$7 = ctr.q;
         } else if ($$0.ex() >= 8.0F && !$$0.b(bpo.s)) {
            $$7 = ctr.C;
         } else if ($$6 <= 3.0 && !$$0.b(bpo.r) && this.ag.i() < 0.25F) {
            $$7 = ctr.L;
         }

         cle $$8 = new cle(this.dM(), this);
         $$8.a(ctq.a(crv.vm, $$7));
         $$8.s($$8.dE() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.Ca, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
         }

         this.dM().b($$8);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean go() {
      return false;
   }
}
