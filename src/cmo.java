public class cmo extends cql implements cmc {
   private static final akv a = akv.b("drinking");
   private static final bwn b = new bwn(a, -0.25, bwn.a.a);
   private static final ajy<Boolean> bY = akc.a(cmo.class, aka.k);
   private int bZ;
   private cea<cql> ca;
   private cdz<cox> cb;

   public cmo(bus<? extends cmo> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.ca = new cea<>(this, cql.class, true, ($$0, $$1) -> this.gI() && $$0.aq() != bus.bH);
      this.cb = new cdz<>(this, cox.class, 10, true, false, null);
      this.bS.a(1, new cbz(this));
      this.bS.a(2, new cde(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cds(this, 1.0));
      this.bS.a(3, new ccn(this, cox.class, 8.0F));
      this.bS.a(3, new cda(this));
      this.bT.a(1, new cdx(this, cql.class));
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
   protected avz e(btb $$0) {
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

   public static bwo.a p() {
      return cly.gx().a(bwp.s, 26.0).a(bwp.v, 0.25);
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
               cwp $$0 = this.eZ();
               this.a(but.a, cwp.j);
               cyo $$1 = $$0.a(kv.Q);
               if ($$0.a(cwt.ti) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(ebt.l);
               this.g(bwp.v).c(b.b());
            }
         } else {
            jr<cym> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(awv.a) && !this.b(bts.m)) {
               $$2 = cyp.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eF() != null && this.eF().a(awr.i)) && !this.b(bts.l)) {
               $$2 = cyp.l;
            } else if (this.ae.i() < 0.05F && this.eD() < this.eS()) {
               $$2 = cyp.y;
            } else if (this.ae.i() < 0.5F && this.O_() != null && !this.b(bts.a) && this.O_().g(this) > 121.0) {
               $$2 = cyp.n;
            }

            if ($$2 != null) {
               this.a(but.a, cyo.a(cwt.ti, $$2));
               this.bZ = this.eZ().a((bvh)this);
               this.z(true);
               if (!this.bb()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.Dj, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bwl $$3 = this.g(bwp.v);
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
   protected float f(btb $$0, float $$1) {
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
   public void a(bvh $$0, float $$1) {
      if (!this.m()) {
         fba $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jr<cym> $$7 = cyp.A;
         if ($$0 instanceof cql) {
            if ($$0.eD() <= 4.0F) {
               $$7 = cyp.y;
            } else {
               $$7 = cyp.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bts.b)) {
            $$7 = cyp.q;
         } else if ($$0.eD() >= 8.0F && !$$0.b(bts.s)) {
            $$7 = cyp.C;
         } else if ($$6 <= 3.0 && !$$0.b(bts.r) && this.ae.i() < 0.25F) {
            $$7 = cyp.L;
         }

         if (this.dV() instanceof ard $$8) {
            cwp $$9 = cyo.a(cwt.wo, $$7);
            cpq.a(cqc::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
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
