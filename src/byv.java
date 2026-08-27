import javax.annotation.Nullable;

public class byv extends bxv implements bnb, ccs {
   private static final agm<Byte> b = agp.a(byv.class, ago.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public byv(bly<? extends byv> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new buf(this, 1.25, 20, 10.0F));
      this.bO.a(2, new but(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bto(this, cfh.class, 6.0F));
      this.bO.a(4, new bub(this));
      this.bP.a(1, new buz<>(this, bmm.class, 10, true, false, $$0 -> $$0 instanceof ccg));
   }

   public static bnp.a u() {
      return bmm.C().a(bnq.l, 4.0).a(bnq.m, 0.2F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.w());
   }

   @Override
   public void a(sn $$0) {
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
      if (!this.dM().B) {
         if (this.dM().t(this.dm()).a(asf.ae)) {
            this.a(this.dN().c(), 1.0F);
         }

         if (!this.dM().Z().b(ctk.c)) {
            return;
         }

         djg $$0 = cwr.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = aun.a(this.dr() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = aun.a(this.dt());
            int $$4 = aun.a(this.dx() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            hx $$5 = new hx($$2, $$3, $$4);
            if (this.dM().a_($$5).i() && $$0.a((ctr)this.dM(), $$5)) {
               this.dM().b($$5, $$0);
               this.dM().a(dnq.i, $$5, dnq.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bmk $$0, float $$1) {
      cgd $$2 = new cgd(this.dM(), this);
      double $$3 = $$0.dv() - 1.1F;
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$3 - $$2.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(arr.xJ, 1.0F, 0.4F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 1.7F;
   }

   @Override
   protected bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if ($$2.a(cna.rS) && this.a()) {
         this.a(ars.h);
         this.a(dnq.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bka.a(this.dM().B);
      } else {
         return bka.d;
      }
   }

   @Override
   public void a(ars $$0) {
      this.dM().a(null, this, arr.xK, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         this.w(false);
         this.a(new cmx(cna.fk), 1.7F);
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
   protected arq y() {
      return arr.xG;
   }

   @Nullable
   @Override
   protected arq d(bks $$0) {
      return arr.xI;
   }

   @Nullable
   @Override
   protected arq n_() {
      return arr.xH;
   }

   @Override
   public els cJ() {
      return new els(0.0, (double)(0.75F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
