import java.util.UUID;

public class ckd extends cnt implements cjr {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bue e = new bue(b, "Drinking speed penalty", -0.25, bue.a.a);
   private static final ajp<Boolean> ca = ajt.a(ckd.class, ajr.k);
   private int cb;
   private cbr<cnt> cc;
   private cbq<cmh> cd;

   public ckd(bsj<? extends ckd> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.cc = new cbr<>(this, cnt.class, true, $$0 -> $$0 != null && this.gE() && $$0.ak() != bsj.bo);
      this.cd = new cbq<>(this, cmh.class, 10, true, false, null);
      this.bU.a(1, new bzq(this));
      this.bU.a(2, new cav(this, 1.0, 60, 10.0F));
      this.bU.a(2, new cbj(this, 1.0));
      this.bU.a(3, new cae(this, cmh.class, 8.0F));
      this.bU.a(3, new car(this));
      this.bV.a(1, new cbo(this, cnt.class));
      this.bV.a(2, this.cc);
      this.bV.a(3, this.cd);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   protected ave v() {
      return avf.Cr;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.Cv;
   }

   @Override
   protected ave o_() {
      return avf.Ct;
   }

   public void y(boolean $$0) {
      this.ap().a(ca, $$0);
   }

   public boolean s() {
      return this.ap().a(ca);
   }

   public static buf.a u() {
      return cjn.gt().a(bug.s, 26.0).a(bug.v, 0.25);
   }

   @Override
   public void n_() {
      if (!this.dP().B && this.bD()) {
         this.cc.k();
         if (this.cc.i() <= 0) {
            this.cd.a(true);
         } else {
            this.cd.a(false);
         }

         if (this.s()) {
            if (this.cb-- <= 0) {
               this.y(false);
               cua $$0 = this.eT();
               this.a(bsk.a, cua.l);
               cwb $$1 = $$0.a(kn.G);
               if ($$0.a(cud.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dxa.l);
               this.f(bug.v).b(e.b());
            }
         } else {
            jj<cvz> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(awa.a) && !this.b(brn.m)) {
               $$2 = cwc.w;
            } else if (this.ah.i() < 0.15F && (this.bQ() || this.ey() != null && this.ey().a(avw.j)) && !this.b(brn.l)) {
               $$2 = cwc.l;
            } else if (this.ah.i() < 0.05F && this.ew() < this.eN()) {
               $$2 = cwc.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(brn.a) && this.p().g(this) > 121.0) {
               $$2 = cwc.n;
            }

            if ($$2 != null) {
               this.a(bsk.a, cwb.a(cud.sk, $$2));
               this.cb = this.eT().a((bsy)this);
               this.y(true);
               if (!this.aW()) {
                  this.dP().a(null, this.du(), this.dw(), this.dA(), avf.Cu, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               buc $$3 = this.f(bug.v);
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
   public ave ae_() {
      return avf.Cs;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dP().a(lj.an, this.du() + this.ah.k() * 0.13F, this.cK().e + 0.5 + this.ah.k() * 0.13F, this.dA() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bqw $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(avw.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bsy $$0, float $$1) {
      if (!this.s()) {
         evz $$2 = $$0.ds();
         double $$3 = $$0.du() + $$2.c - this.du();
         double $$4 = $$0.dy() - 1.1F - this.dw();
         double $$5 = $$0.dA() + $$2.e - this.dA();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         jj<cvz> $$7 = cwc.A;
         if ($$0 instanceof cnt) {
            if ($$0.ew() <= 4.0F) {
               $$7 = cwc.y;
            } else {
               $$7 = cwc.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(brn.b)) {
            $$7 = cwc.q;
         } else if ($$0.ew() >= 8.0F && !$$0.b(brn.s)) {
            $$7 = cwc.C;
         } else if ($$6 <= 3.0 && !$$0.b(brn.r) && this.ah.i() < 0.25F) {
            $$7 = cwc.L;
         }

         cnl $$8 = new cnl(this.dP(), this);
         $$8.a(cwb.a(cud.vo, $$7));
         $$8.t($$8.dH() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aW()) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), avf.Cw, this.de(), 1.0F, 0.8F + this.ah.i() * 0.4F);
         }

         this.dP().b($$8);
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
