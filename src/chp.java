import java.util.UUID;

public class chp extends clf implements chd {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final brt e = new brt(b, "Drinking speed penalty", -0.25, brt.a.a);
   private static final aiy<Boolean> bX = ajc.a(chp.class, aja.k);
   private int bY;
   private bzg<clf> bZ;
   private bzf<cjt> ca;

   public chp(bqb<? extends chp> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bZ = new bzg<>(this, clf.class, true, $$0 -> $$0 != null && this.gC() && $$0.ai() != bqb.bn);
      this.ca = new bzf<>(this, cjt.class, 10, true, false, null);
      this.bR.a(1, new bxf(this));
      this.bR.a(2, new byk(this, 1.0, 60, 10.0F));
      this.bR.a(2, new byy(this, 1.0));
      this.bR.a(3, new bxt(this, cjt.class, 8.0F));
      this.bR.a(3, new byg(this));
      this.bS.a(1, new bzd(this, clf.class));
      this.bS.a(2, this.bZ);
      this.bS.a(3, this.ca);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(bX, false);
   }

   @Override
   protected aul v() {
      return aum.BV;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.BZ;
   }

   @Override
   protected aul o_() {
      return aum.BX;
   }

   public void y(boolean $$0) {
      this.an().a(bX, $$0);
   }

   public boolean r() {
      return this.an().a(bX);
   }

   public static bru.a u() {
      return cgz.gt().a(brv.q, 26.0).a(brv.r, 0.25);
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
               crj $$0 = this.eU();
               this.a(bqc.a, crj.i);
               cth $$1 = $$0.a(jp.x);
               if ($$0.a(crm.sj) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dts.l);
               this.f(brv.r).b(e.a());
            }
         } else {
            il<ctf> $$2 = null;
            if (this.ag.i() < 0.15F && this.a(avh.a) && !this.b(bpj.m)) {
               $$2 = cti.w;
            } else if (this.ag.i() < 0.15F && (this.bN() || this.ez() != null && this.ez().a(ave.j)) && !this.b(bpj.l)) {
               $$2 = cti.l;
            } else if (this.ag.i() < 0.05F && this.ex() < this.eO()) {
               $$2 = cti.y;
            } else if (this.ag.i() < 0.5F && this.p() != null && !this.b(bpj.a) && this.p().g(this) > 121.0) {
               $$2 = cti.n;
            }

            if ($$2 != null) {
               this.a(bqc.a, cth.a(crm.sj, $$2));
               this.bY = this.eU().t();
               this.y(true);
               if (!this.aU()) {
                  this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.BY, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
               }

               brr $$3 = this.f(brv.r);
               $$3.b(e.a());
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
   public aul ae_() {
      return aum.BW;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ag.a(35) + 10; $$1++) {
            this.dM().a(kl.al, this.dr() + this.ag.k() * 0.13F, this.cH().e + 0.5 + this.ag.k() * 0.13F, this.dx() + this.ag.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bot $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(ave.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bqo $$0, float $$1) {
      if (!this.r()) {
         esa $$2 = $$0.dp();
         double $$3 = $$0.dr() + $$2.c - this.dr();
         double $$4 = $$0.dv() - 1.1F - this.dt();
         double $$5 = $$0.dx() + $$2.e - this.dx();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         il<ctf> $$7 = cti.A;
         if ($$0 instanceof clf) {
            if ($$0.ex() <= 4.0F) {
               $$7 = cti.y;
            } else {
               $$7 = cti.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bpj.b)) {
            $$7 = cti.q;
         } else if ($$0.ex() >= 8.0F && !$$0.b(bpj.s)) {
            $$7 = cti.C;
         } else if ($$6 <= 3.0 && !$$0.b(bpj.r) && this.ag.i() < 0.25F) {
            $$7 = cti.L;
         }

         ckx $$8 = new ckx(this.dM(), this);
         $$8.a(cth.a(crm.vm, $$7));
         $$8.s($$8.dE() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.Ca, this.db(), 1.0F, 0.8F + this.ag.i() * 0.4F);
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
