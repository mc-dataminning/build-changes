import javax.annotation.Nullable;

public class cfm extends cem implements btp, cjr {
   private static final ajp<Byte> b = ajt.a(cfm.class, ajr.a);
   private static final byte c = 16;

   public cfm(bsj<? extends cfm> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cav(this, 1.25, 20, 10.0F));
      this.bU.a(2, new cbj(this, 1.0, 1.0000001E-5F));
      this.bU.a(3, new cae(this, cmh.class, 6.0F));
      this.bU.a(4, new car(this));
      this.bV.a(1, new cbp<>(this, bta.class, 10, true, false, $$0 -> $$0 instanceof cjf));
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 4.0).a(bug.v, 0.2F);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.u());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fl() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         if (this.dP().t(this.dp()).a(avt.ae)) {
            this.a(this.dQ().d(), 1.0F);
         }

         if (!this.dP().ab().b(dbz.c)) {
            return;
         }

         dsh $$0 = dfh.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = aye.a(this.du() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = aye.a(this.dw());
            int $$4 = aye.a(this.dA() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            ja $$5 = new ja($$2, $$3, $$4);
            if (this.dP().a_($$5).i() && $$0.a((dcg)this.dP(), $$5)) {
               this.dP().b($$5, $$0);
               this.dP().a(dxa.i, $$5, dxa.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bsy $$0, float $$1) {
      cne $$2 = new cne(this.dP(), this);
      double $$3 = $$0.dy() - 1.1F;
      double $$4 = $$0.du() - this.du();
      double $$5 = $$3 - $$2.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avf.yG, 1.0F, 0.4F / (this.dS().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   @Override
   protected bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.a(cud.rV) && this.a()) {
         this.a(avg.h);
         this.a(dxa.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqd.a(this.dP().B);
      } else {
         return bqd.e;
      }
   }

   @Override
   public void a(avg $$0) {
      this.dP().a(null, this, avf.yH, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         this.w(false);
         this.a(new cua(cud.fl), this.cL());
      }
   }

   @Override
   public boolean a() {
      return this.bD() && this.u();
   }

   public boolean u() {
      return (this.ao.a(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(b);
      if ($$0) {
         this.ao.a(b, (byte)($$1 | 16));
      } else {
         this.ao.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected ave v() {
      return avf.yD;
   }

   @Nullable
   @Override
   protected ave d(bqw $$0) {
      return avf.yF;
   }

   @Nullable
   @Override
   protected ave o_() {
      return avf.yE;
   }

   @Override
   public evz cM() {
      return new evz(0.0, (double)(0.75F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
