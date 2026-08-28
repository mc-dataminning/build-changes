public class cmp extends cqm implements cmd {
   private static final akv a = akv.b("drinking");
   private static final bwo b = new bwo(a, -0.25, bwo.a.a);
   private static final ajy<Boolean> bY = akc.a(cmp.class, aka.k);
   private int bZ;
   private ceb<cqm> ca;
   private cea<coy> cb;

   public cmp(but<? extends cmp> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      super.E();
      this.ca = new ceb<>(this, cqm.class, true, ($$0, $$1) -> this.gI() && $$0.aq() != but.bH);
      this.cb = new cea<>(this, coy.class, 10, true, false, null);
      this.bS.a(1, new cca(this));
      this.bS.a(2, new cdf(this, 1.0, 60, 10.0F));
      this.bS.a(2, new cdt(this, 1.0));
      this.bS.a(3, new cco(this, coy.class, 8.0F));
      this.bS.a(3, new cdb(this));
      this.bT.a(1, new cdy(this, cqm.class));
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
   protected avz e(btc $$0) {
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

   public static bwp.a p() {
      return clz.gx().a(bwq.s, 26.0).a(bwq.v, 0.25);
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
               cwq $$0 = this.eZ();
               this.a(buu.a, cwq.j);
               cyp $$1 = $$0.a(kv.Q);
               if ($$0.a(cwu.ti) && $$1 != null) {
                  $$1.a(this::a);
               }

               this.a(ebu.l);
               this.g(bwq.v).c(b.b());
            }
         } else {
            jr<cyn> $$2 = null;
            if (this.ae.i() < 0.15F && this.a(awv.a) && !this.b(btt.m)) {
               $$2 = cyq.w;
            } else if (this.ae.i() < 0.15F && (this.bY() || this.eF() != null && this.eF().a(awr.i)) && !this.b(btt.l)) {
               $$2 = cyq.l;
            } else if (this.ae.i() < 0.05F && this.eD() < this.eS()) {
               $$2 = cyq.y;
            } else if (this.ae.i() < 0.5F && this.O_() != null && !this.b(btt.a) && this.O_().g(this) > 121.0) {
               $$2 = cyq.n;
            }

            if ($$2 != null) {
               this.a(buu.a, cyp.a(cwu.ti, $$2));
               this.bZ = this.eZ().a((bvi)this);
               this.z(true);
               if (!this.bb()) {
                  this.dV().a(null, this.dA(), this.dC(), this.dG(), awa.Dj, this.dm(), 1.0F, 0.8F + this.ae.i() * 0.4F);
               }

               bwm $$3 = this.g(bwq.v);
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
   protected float f(btc $$0, float $$1) {
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
   public void a(bvi $$0, float $$1) {
      if (!this.m()) {
         fbb $$2 = $$0.dy();
         double $$3 = $$0.dA() + $$2.d - this.dA();
         double $$4 = $$0.dE() - 1.1F - this.dC();
         double $$5 = $$0.dG() + $$2.f - this.dG();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jr<cyn> $$7 = cyq.A;
         if ($$0 instanceof cqm) {
            if ($$0.eD() <= 4.0F) {
               $$7 = cyq.y;
            } else {
               $$7 = cyq.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(btt.b)) {
            $$7 = cyq.q;
         } else if ($$0.eD() >= 8.0F && !$$0.b(btt.s)) {
            $$7 = cyq.C;
         } else if ($$6 <= 3.0 && !$$0.b(btt.r) && this.ae.i() < 0.25F) {
            $$7 = cyq.L;
         }

         if (this.dV() instanceof ard $$8) {
            cwq $$9 = cyp.a(cwu.wo, $$7);
            cpr.a(cqd::new, $$8, $$9, this, $$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
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
