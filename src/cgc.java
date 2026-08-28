import javax.annotation.Nullable;

public class cgc extends cfc implements buf, ckg {
   private static final akj<Byte> b = akn.a(cgc.class, akl.a);
   private static final byte c = 16;

   public cgc(bsz<? extends cgc> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cbl(this, 1.25, 20, 10.0F));
      this.bS.a(2, new cbz(this, 1.0, 1.0000001E-5F));
      this.bS.a(3, new cau(this, cmw.class, 6.0F));
      this.bS.a(4, new cbh(this));
      this.bT.a(1, new ccf<>(this, btq.class, 10, true, false, $$0 -> $$0 instanceof cju));
   }

   public static buv.a s() {
      return btq.A().a(buw.q, 4.0).a(buw.r, 0.2F);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.u());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dP().B) {
         if (this.dP().t(this.dp()).a(awn.ae)) {
            this.a(this.dQ().c(), 1.0F);
         }

         if (!this.dP().ab().b(dbt.c)) {
            return;
         }

         dsb $$0 = dfa.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = ayy.a(this.du() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = ayy.a(this.dw());
            int $$4 = ayy.a(this.dA() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            iz $$5 = new iz($$2, $$3, $$4);
            if (this.dP().a_($$5).i() && $$0.a((dca)this.dP(), $$5)) {
               this.dP().b($$5, $$0);
               this.dP().a(dwu.i, $$5, dwu.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bto $$0, float $$1) {
      cnt $$2 = new cnt(this.dP(), this);
      double $$3 = $$0.dy() - 1.1F;
      double $$4 = $$0.du() - this.du();
      double $$5 = $$3 - $$2.dw();
      double $$6 = $$0.dA() - this.dA();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(avz.yD, 1.0F, 0.4F / (this.el().i() * 0.4F + 0.8F));
      this.dP().b($$2);
   }

   @Override
   protected bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.rV) && this.a()) {
         this.a(awa.h);
         this.a(dwu.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqt.a(this.dP().B);
      } else {
         return bqt.e;
      }
   }

   @Override
   public void a(awa $$0) {
      this.dP().a(null, this, avz.yE, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         this.w(false);
         this.a(new cuo(cur.fl), this.cL());
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
   protected avy v() {
      return avz.yA;
   }

   @Nullable
   @Override
   protected avy d(brm $$0) {
      return avz.yC;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.yB;
   }

   @Override
   public evq cM() {
      return new evq(0.0, (double)(0.75F * this.cL()), (double)(this.dj() * 0.4F));
   }
}
