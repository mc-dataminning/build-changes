import javax.annotation.Nullable;

public class bza extends bya implements bnf, cda {
   private static final agn<Byte> b = agq.a(bza.class, agp.a);
   private static final byte c = 16;

   public bza(bmc<? extends bza> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(1, new buj(this, 1.25, 20, 10.0F));
      this.bP.a(2, new bux(this, 1.0, 1.0000001E-5F));
      this.bP.a(3, new bts(this, cfq.class, 6.0F));
      this.bP.a(4, new buf(this));
      this.bQ.a(1, new bvd<>(this, bmq.class, 10, true, false, $$0 -> $$0 instanceof cco));
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 4.0).a(bnu.o, 0.2F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.w());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dL().B) {
         if (this.dL().t(this.dl()).a(ash.ae)) {
            this.a(this.dM().c(), 1.0F);
         }

         if (!this.dL().Z().b(ctt.c)) {
            return;
         }

         djp $$0 = cxa.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = aup.a(this.dq() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = aup.a(this.ds());
            int $$4 = aup.a(this.dw() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            hx $$5 = new hx($$2, $$3, $$4);
            if (this.dL().a_($$5).i() && $$0.a((cua)this.dL(), $$5)) {
               this.dL().b($$5, $$0);
               this.dL().a(dnz.i, $$5, dnz.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bmo $$0, float $$1) {
      cgm $$2 = new cgm(this.dL(), this);
      double $$3 = $$0.du() - 1.1F;
      double $$4 = $$0.dq() - this.dq();
      double $$5 = $$3 - $$2.ds();
      double $$6 = $$0.dw() - this.dw();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(art.xY, 1.0F, 0.4F / (this.eg().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   @Override
   protected bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$2.a(cnj.rU) && this.a()) {
         this.a(aru.h);
         this.a(dnz.M, $$0);
         if (!this.dL().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bkc.a(this.dL().B);
      } else {
         return bkc.d;
      }
   }

   @Override
   public void a(aru $$0) {
      this.dL().a(null, this, art.xZ, $$0, 1.0F, 1.0F);
      if (!this.dL().y_()) {
         this.w(false);
         this.a(new cng(cnj.fk), this.cI());
      }
   }

   @Override
   public boolean a() {
      return this.bx() && this.w();
   }

   public boolean w() {
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
   protected ars y() {
      return art.xV;
   }

   @Nullable
   @Override
   protected ars d(bkv $$0) {
      return art.xX;
   }

   @Nullable
   @Override
   protected ars n_() {
      return art.xW;
   }

   @Override
   public emc cJ() {
      return new emc(0.0, (double)(0.75F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
