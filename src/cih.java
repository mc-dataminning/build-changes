import java.util.UUID;

public class cih extends clx implements chv {
   private static final UUID b = UUID.fromString("5CD17E52-A79A-43D3-A529-90FDE04B181E");
   private static final bsj e = new bsj(b, "Drinking speed penalty", -0.25, bsj.a.a);
   private static final ajk<Boolean> bY = ajo.a(cih.class, ajm.k);
   private int bZ;
   private bzw<clx> ca;
   private bzv<ckl> cb;

   public cih(bqr<? extends cih> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.ca = new bzw<>(this, clx.class, true, $$0 -> $$0 != null && this.gE() && $$0.ai() != bqr.bn);
      this.cb = new bzv<>(this, ckl.class, 10, true, false, null);
      this.bS.a(1, new bxv(this));
      this.bS.a(2, new bza(this, 1.0, 60, 10.0F));
      this.bS.a(2, new bzo(this, 1.0));
      this.bS.a(3, new byj(this, ckl.class, 8.0F));
      this.bS.a(3, new byw(this));
      this.bT.a(1, new bzt(this, clx.class));
      this.bT.a(2, this.ca);
      this.bT.a(3, this.cb);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   protected auy v() {
      return auz.Cc;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.Cg;
   }

   @Override
   protected auy o_() {
      return auz.Ce;
   }

   public void y(boolean $$0) {
      this.an().a(bY, $$0);
   }

   public boolean r() {
      return this.an().a(bY);
   }

   public static bsk.a u() {
      return chr.gv().a(bsl.q, 26.0).a(bsl.r, 0.25);
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
               csd $$0 = this.eV();
               this.a(bqs.a, csd.i);
               cuc $$1 = $$0.a(jz.x);
               if ($$0.a(csg.sk) && $$1 != null) {
                  $$1.a(this::b);
               }

               this.a(dur.l);
               this.f(bsl.r).b(e.b());
            }
         } else {
            iv<cua> $$2 = null;
            if (this.ah.i() < 0.15F && this.a(avt.a) && !this.b(bpz.m)) {
               $$2 = cud.w;
            } else if (this.ah.i() < 0.15F && (this.bO() || this.eA() != null && this.eA().a(avq.j)) && !this.b(bpz.l)) {
               $$2 = cud.l;
            } else if (this.ah.i() < 0.05F && this.ey() < this.eP()) {
               $$2 = cud.y;
            } else if (this.ah.i() < 0.5F && this.p() != null && !this.b(bpz.a) && this.p().g(this) > 121.0) {
               $$2 = cud.n;
            }

            if ($$2 != null) {
               this.a(bqs.a, cuc.a(csg.sk, $$2));
               this.bZ = this.eV().t();
               this.y(true);
               if (!this.aU()) {
                  this.dN().a(null, this.ds(), this.du(), this.dy(), auz.Cf, this.dc(), 1.0F, 0.8F + this.ah.i() * 0.4F);
               }

               bsh $$3 = this.f(bsl.r);
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
   public auy ae_() {
      return auz.Cd;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 15) {
         for (int $$1 = 0; $$1 < this.ah.a(35) + 10; $$1++) {
            this.dN().a(kw.ak, this.ds() + this.ah.k() * 0.13F, this.cI().e + 0.5 + this.ah.k() * 0.13F, this.dy() + this.ah.k() * 0.13F, 0.0, 0.0, 0.0);
         }
      } else {
         super.b($$0);
      }
   }

   @Override
   protected float e(bpj $$0, float $$1) {
      $$1 = super.e($$0, $$1);
      if ($$0.d() == this) {
         $$1 = 0.0F;
      }

      if ($$0.a(avq.l)) {
         $$1 *= 0.15F;
      }

      return $$1;
   }

   @Override
   public void a(bre $$0, float $$1) {
      if (!this.r()) {
         etf $$2 = $$0.dq();
         double $$3 = $$0.ds() + $$2.c - this.ds();
         double $$4 = $$0.dw() - 1.1F - this.du();
         double $$5 = $$0.dy() + $$2.e - this.dy();
         double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
         iv<cua> $$7 = cud.A;
         if ($$0 instanceof clx) {
            if ($$0.ey() <= 4.0F) {
               $$7 = cud.y;
            } else {
               $$7 = cud.F;
            }

            this.h(null);
         } else if ($$6 >= 8.0 && !$$0.b(bpz.b)) {
            $$7 = cud.q;
         } else if ($$0.ey() >= 8.0F && !$$0.b(bpz.s)) {
            $$7 = cud.C;
         } else if ($$6 <= 3.0 && !$$0.b(bpz.r) && this.ah.i() < 0.25F) {
            $$7 = cud.L;
         }

         clp $$8 = new clp(this.dN(), this);
         $$8.a(cuc.a(csg.vo, $$7));
         $$8.s($$8.dF() - -20.0F);
         $$8.c($$3, $$4 + $$6 * 0.2, $$5, 0.75F, 8.0F);
         if (!this.aU()) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), auz.Ch, this.dc(), 1.0F, 0.8F + this.ah.i() * 0.4F);
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
