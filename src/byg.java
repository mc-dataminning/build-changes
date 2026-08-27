import javax.annotation.Nullable;

public class byg extends bxg implements bmm, ccd {
   private static final afz<Byte> b = agc.a(byg.class, agb.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public byg(blj<? extends byg> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new btq(this, 1.25, 20, 10.0F));
      this.bO.a(2, new bue(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bsz(this, cer.class, 6.0F));
      this.bO.a(4, new btm(this));
      this.bP.a(1, new buk<>(this, blx.class, 10, true, false, $$0 -> $$0 instanceof cbr));
   }

   public static bna.a u() {
      return blx.C().a(bnb.l, 4.0).a(bnb.m, 0.2F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.w());
   }

   @Override
   public void a(sj $$0) {
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
         if (this.dM().s(this.dm()).a(arq.ae)) {
            this.a(this.dN().c(), 1.0F);
         }

         if (!this.dM().Y().b(csu.c)) {
            return;
         }

         dip $$0 = cwb.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = aty.a(this.dr() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = aty.a(this.dt());
            int $$4 = aty.a(this.dx() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            hv $$5 = new hv($$2, $$3, $$4);
            if (this.dM().a_($$5).i() && $$0.a((ctb)this.dM(), $$5)) {
               this.dM().b($$5, $$0);
               this.dM().a(dmz.i, $$5, dmz.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(blv $$0, float $$1) {
      cfn $$2 = new cfn(this.dM(), this);
      double $$3 = $$0.dv() - 1.1F;
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$3 - $$2.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(arc.xJ, 1.0F, 0.4F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 1.7F;
   }

   @Override
   protected bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if ($$2.a(cmk.rS) && this.a()) {
         this.a(ard.h);
         this.a(dmz.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bjl.a(this.dM().B);
      } else {
         return bjl.d;
      }
   }

   @Override
   public void a(ard $$0) {
      this.dM().a(null, this, arc.xK, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         this.w(false);
         this.a(new cmh(cmk.fk), 1.7F);
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
   protected arb y() {
      return arc.xG;
   }

   @Nullable
   @Override
   protected arb d(bkd $$0) {
      return arc.xI;
   }

   @Nullable
   @Override
   protected arb n_() {
      return arc.xH;
   }

   @Override
   public elb cJ() {
      return new elb(0.0, (double)(0.75F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
