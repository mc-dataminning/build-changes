public class cmn extends cqk implements cmb {
   private static final akv a = akv.b("drinking");
   private static final bwm b = new bwm(a, -0.25, bwm.a.a);
   private static final ajy<Boolean> bY = akc.a(cmn.class, aka.k);
   private int bZ;
   private cdz<cqk> ca;
   private cdy<cow> cb;

   public cmn(bur<? extends cmn> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.ca = new cdz<>(this, cqk.class, true, ($$0, $$1) -> this.gI() && $$0.aq() != bur.bH);
      this.cb = new cdy<>(this, cow.class, 10, true, false, null);
      this.bS.a(1, new cby(this));
      this.bS.a(2, new cdd(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cdr(this, 1.0));
      this.bS.a(3, new ccm(this, cow.class, 8.0F));
      this.bS.a(3, new ccz(this));
      this.bT.a(1, new cdw(this, cqk.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected avz u() {
      return awa.Dg;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.Dk;
   }

   @Override
   protected avz o_() {
      return awa.Di;
   }

   public void z(boolean $$0) {
      this.au().a(bY, $$0);
   }

   public boolean m() {
      return this.au().a(bY);
   }

   public static bwn.a p() {
      return clx.gx().a(bwo.s, 26.0).a(bwo.v, 0.25);
   }

   @Override
   public void d_() {
      if (!this.dV().C && this.bL()) {
         this.ca.k();
         if (this.ca.i() <= 0) {
            this.cb.a(true);
         } else {
            this.cb.a(false);
         }

         if (this.m()) {
            if (this.bZ-- <= 0) {
               this.z(false);
               cwo $$0 = this.eZ();
               this.a(bus.a, cwo.j);
               cyn $$1 = $$0.a(kv.Q);
               if ($$0.a(cws.ti) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(ebs.l);
               this.g(bwo.v).c(b.b());
            }
         } else {
            jr<cyl> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(awv.a) && !this.b(btr.m)) {
               $$2 = cyo.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eF() != null && this.eF().a(awr.i)) && !this.b(btr.l)) {
               $$2 = cyo.l;
            } else if (this.ae.i() < 0.05F && this.eD() < this.eS()) {
               $$2 = cyo.y;
            } else if (this.ae.i() < 0.5F && this.O_() != null && !this.b(btr.a) && this.O_().g(this) > 121.0) {
               $$2 = cyo.n;
            }

            if ($$2 != null) {
               this.a(bus.a, cyn.a(cws.ti, $$2));
               this.bZ = this.eZ().a((bvg)this);
               this.z(true);
               if (!this.bb()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.Dj, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bwk $$3 = this.g(bwo.v);
               $$3.c(a);
               $$3.b(b);
            }
         }

         if (this.ae.i() < 7.5E-4F) {
            this.dV().a(this, (byte)15);
         }
      }

      super.d_();
   }

   @Override
   public avz aj_() {
      return awa.Dh;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ae.a(35) + 10; $$1++) {
            this.dV().a(lt.ap, this.dA() + this.ae.k() * 0.13F, this.cR().e + 0.5 + this.ae.k() * 0.13F, this.dG() + this.ae.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float f(bta $$0, float $$1) {
      $$1 = super.f($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(awr.k)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bvg $$0, float $$1) {
      if (!this.m()) {
         faz $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jr<cyl> $$7 = cyo.A;
         if ($$0 instanceof cqk) {
            if ($$0.eD() <= 4.0F) {
               $$7 = cyo.y;
            } else {
               $$7 = cyo.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(btr.b)) {
            $$7 = cyo.q;
         } else if ($$0.eD() >= 8.0F && !$$0.b(btr.s)) {
            $$7 = cyo.C;
         } else if ($$6 <= 3.0 && !$$0.b(btr.r) && this.ae.i() < 0.25F) {
            $$7 = cyo.L;
         }

         if (this.dV() instanceof ard $$8) {
            cwo $$9 = cyn.a(cws.wo, $$7);
            cpp.a(cqb::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         }

         if (!this.bb()) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.Dl, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
         }
      }
   }

   @Override
   public void a(ard $$0, int $$1, boolean $$2) {
   }

   @Override
   public boolean gs() {
      return false;
   }
}
