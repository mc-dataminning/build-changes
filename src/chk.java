import javax.annotation.Nullable;

public class chk extends cgj implements bvm, clq {
   private static final akk<Byte> b = ako.a(chk.class, akm.a);
   private static final byte c = 16;

   public chk(bug<? extends chk> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccs(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cdg(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new ccb(this, coh.class, 6.0F));
      this.bS.a(4, new cco(this));
      this.bT.a(1, new cdm<>(this, bux.class, 10, true, false, $$0 -> $$0 instanceof cle));
   }

   public static bwc.a q() {
      return bux.E().a(bwd.s, 4.0).a(bwd.v, 0.2F);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.t());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.x($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean ft() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dX().C) {
         if (this.dX().t(this.dx()).a(awy.ae)) {
            this.a(this.dY().d(), 1.0F);
         }

         if (!this.dX().ac().b(der.c)) {
            return;
         }

         dvd $$0 = dia.dN.m();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = azj.a(this.dC() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = azj.a(this.dE());
            int $$4 = azj.a(this.dI() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            jg $$5 = new jg($$2, $$3, $$4);
            if (this.dX().a_($$5).l() && $$0.a((dey)this.dX(), $$5)) {
               this.dX().b($$5, $$0);
               this.dX().a(eaa.i, $$5, eaa.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(buv $$0, float $$1) {
      double $$2 = $$0.dC() - this.dC();
      double $$3 = $$0.dG() - 1.1F;
      double $$4 = $$0.dI() - this.dI();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dX() instanceof arm $$6) {
         cvx $$7 = new cvx(cwb.qD);
         cpb.a(new cpg($$6, this, $$7), $$6, $$7, $$4x -> $$4x.c($$2, $$3 + $$5 - $$4x.dE(), $$4, 1.6F, 12.0F));
      }

      this.a(awk.yK, 1.0F, 0.4F / (this.ea().i() * 0.4F + 0.8F));
   }

   @Override
   protected bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(cwb.rW) && this.a()) {
         this.a(awl.h);
         this.a(eaa.M, $$0);
         if (!this.dX().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bry.a;
      } else {
         return bry.e;
      }
   }

   @Override
   public void a(awl $$0) {
      this.dX().a(null, this, awk.yL, $$0, 1.0F, 1.0F);
      if (!this.dX().y_()) {
         this.x(false);
         this.a(ets.aQ, $$0x -> this.a($$0x, this.cT()));
      }
   }

   @Override
   public boolean a() {
      return this.bM() && this.t();
   }

   public boolean t() {
      return (this.am.a(b) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(b);
      if ($$0) {
         this.am.a(b, (byte)($$1 | 16));
      } else {
         this.am.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected awj w() {
      return awk.yH;
   }

   @Nullable
   @Override
   protected awj d(bsp $$0) {
      return awk.yJ;
   }

   @Nullable
   @Override
   protected awj o_() {
      return awk.yI;
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)(0.75F * this.cT()), (double)(this.ds() * 0.4F));
   }
}
