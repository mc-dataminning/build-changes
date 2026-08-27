import javax.annotation.Nullable;

public class bvh extends buh implements bjp, bze {
   private static final adz<Byte> b = aec.a(bvh.class, aeb.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public bvh(bim<? extends bvh> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqs(this, 1.25, 20, 10.0F));
      this.bO.a(2, new brg(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bqb(this, cbm.class, 6.0F));
      this.bO.a(4, new bqo(this));
      this.bP.a(1, new brm<>(this, bja.class, 10, true, false, $$0 -> $$0 instanceof bys));
   }

   public static bkd.a p() {
      return bja.x().a(bke.a, 4.0).a(bke.d, 0.2F);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.q());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fe() {
      return true;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         if (this.dK().s(this.dk()).a(apk.ad)) {
            this.a(this.dL().c(), 1.0F);
         }

         if (!this.dK().X().b(cph.c)) {
            return;
         }

         dez $$0 = csm.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = arp.a(this.dp() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = arp.a(this.dr());
            int $$4 = arp.a(this.dv() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            gu $$5 = new gu($$2, $$3, $$4);
            if (this.dK().a_($$5).i() && $$0.a((cpo)this.dK(), $$5)) {
               this.dK().b($$5, $$0);
               this.dK().a(djj.i, $$5, djj.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(biy $$0, float $$1) {
      cci $$2 = new cci(this.dK(), this);
      double $$3 = $$0.dt() - 1.1F;
      double $$4 = $$0.dp() - this.dp();
      double $$5 = $$3 - $$2.dr();
      double $$6 = $$0.dv() - this.dv();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(aow.wT, 1.0F, 0.4F / (this.ee().i() * 0.4F + 0.8F));
      this.dK().b($$2);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 1.7F;
   }

   @Override
   protected bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if ($$2.a(cja.rg) && this.a()) {
         this.a(aox.h);
         this.a(djj.M, $$0);
         if (!this.dK().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bgq.a(this.dK().B);
      } else {
         return bgq.d;
      }
   }

   @Override
   public void a(aox $$0) {
      this.dK().a(null, this, aow.wU, $$0, 1.0F, 1.0F);
      if (!this.dK().r_()) {
         this.w(false);
         this.a(new cix(cja.eP), 1.7F);
      }
   }

   @Override
   public boolean a() {
      return this.bv() && this.q();
   }

   public boolean q() {
      return (this.an.b(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.b(b);
      if ($$0) {
         this.an.b(b, (byte)($$1 | 16));
      } else {
         this.an.b(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected aov r() {
      return aow.wQ;
   }

   @Nullable
   @Override
   protected aov d(bhg $$0) {
      return aow.wS;
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.wR;
   }

   @Override
   public ehd cI() {
      return new ehd(0.0, (double)(0.75F * this.cH()), (double)(this.df() * 0.4F));
   }
}
