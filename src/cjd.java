import java.util.UUID;

public class cjd extends cmt implements cir {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final btf e = new btf(b, "Drinking speed penalty", -0.25, btf.a.a);
   private static final ajm<Boolean> bY = ajq.a(cjd.class, ajo.k);
   private int bZ;
   private cas<cmt> ca;
   private car<clh> cb;

   public cjd(brn<? extends cjd> $$0, dad $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.ca = new cas<>(this, cmt.class, true, $$0 -> $$0 != null && this.gE() && $$0.ai() != brn.bn);
      this.cb = new car<>(this, clh.class, 10, true, false, null);
      this.bS.a(1, new byr(this));
      this.bS.a(2, new bzw(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cak(this, 1.0));
      this.bS.a(3, new bzf(this, clh.class, 8.0F));
      this.bS.a(3, new bzs(this));
      this.bT.a(1, new cap(this, cmt.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected avb v() {
      return avc.Cd;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.Ch;
   }

   @Override
   protected avb o_() {
      return avc.Cf;
   }

   public void y(boolean $$0) {
      this.an().a(bY, $$0);
   }

   public boolean r() {
      return this.an().a(bY);
   }

   public static btg.a u() {
      return cin.gv().a(bth.q, 26.0).a(bth.r, 0.25);
   }

   @Override
   public void n_() {
      if (!this.dN().B && this.bB()) {
         this.ca.k();
         if (this.ca.i() <= 0) {
            this.cb.a(true);
         } else {
            this.cb.a(false);
         }

         if (this.r()) {
            if (this.bZ-- <= 0) {
               this.y(false);
               csz $$0 = this.eV();
               this.a(bro.a, csz.i);
               cuy $$1 = $$0.a(ka.E);
               if ($$0.a(ctc.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dva.l);
               this.f(bth.r).b(e.b());
            }
         } else {
            iw<cuw> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(avw.a) && !this.b(bqv.m)) {
               $$2 = cuz.w;
            } else if (this.ah.i() < 0.15F && (this.bO() || this.eA() != null && this.eA().a(avt.j)) && !this.b(bqv.l)) {
               $$2 = cuz.l;
            } else if (this.ah.i() < 0.05F && this.ey() < this.eP()) {
               $$2 = cuz.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(bqv.a) && this.p().g(this) > 121.0) {
               $$2 = cuz.n;
            }

            if ($$2 != null) {
               this.a(bro.a, cuy.a(ctc.sk, $$2));
               this.bZ = this.eV().t();
               this.y(true);
               if (!this.aU()) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), avc.Cg, this.dc(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               btd $$3 = this.f(bth.r);
               $$3.b(e.b());
               $$3.c(e);
            }
         }

         if (this.ah.i() < 7.5E-4F) {
            this.dN().a(this, (byte)15);
         }
      }

      super.n_();
   }

   @Override
   public avb ae_() {
      return avc.Ce;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dN().a(kx.ak, this.ds() + this.ah.k() * 0.13F, this.cI().e + 0.5 + this.ah.k() * 0.13F, this.dy() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bqf $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(avt.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bsa $$0, float $$1) {
      if (!this.r()) {
         etp $$2 = $$0.dq();
         double $$3 = $$0.ds() + $$2.c - this.ds();
         double $$4 = $$0.dw() - 1.1F - this.du();
         double $$5 = $$0.dy() + $$2.e - this.dy();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         iw<cuw> $$7 = cuz.A;
         if ($$0 instanceof cmt) {
            if ($$0.ey() <= 4.0F) {
               $$7 = cuz.y;
            } else {
               $$7 = cuz.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bqv.b)) {
            $$7 = cuz.q;
         } else if ($$0.ey() >= 8.0F && !$$0.b(bqv.s)) {
            $$7 = cuz.C;
         } else if ($$6 <= 3.0 && !$$0.b(bqv.r) && this.ah.i() < 0.25F) {
            $$7 = cuz.L;
         }

         cml $$8 = new cml(this.dN(), this);
         $$8.a(cuy.a(ctc.vo, $$7));
         $$8.s($$8.dF() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), avc.Ci, this.dc(), 1.0F, 0.8F + this.ah.i() * 0.4F);
         }

         this.dN().b($$8);
      }
   }

   @Override
   public void a(int $$0, boolean $$1) {
   }

   @Override
   public boolean gq() {
      return false;
   }
}
