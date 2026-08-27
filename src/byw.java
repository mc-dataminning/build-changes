import javax.annotation.Nullable;

public class byw extends bxw implements bnc, cct {
   private static final agm<Byte> b = agp.a(byw.class, ago.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public byw(blz<? extends byw> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bug(this, 1.25, 20, 10.0F));
      this.bO.a(2, new buu(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new btp(this, cfi.class, 6.0F));
      this.bO.a(4, new buc(this));
      this.bP.a(1, new bva<>(this, bmn.class, 10, true, false, $$0 -> $$0 instanceof cch));
   }

   public static bnq.a u() {
      return bmn.C().a(bnr.l, 4.0).a(bnr.m, 0.2F);
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
         if (this.dM().t(this.dm()).a(asg.ae)) {
            this.a(this.dN().c(), 1.0F);
         }

         if (!this.dM().Z().b(ctl.c)) {
            return;
         }

         djh $$0 = cws.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = auo.a(this.dr() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = auo.a(this.dt());
            int $$4 = auo.a(this.dx() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            hx $$5 = new hx($$2, $$3, $$4);
            if (this.dM().a_($$5).i() && $$0.a((cts)this.dM(), $$5)) {
               this.dM().b($$5, $$0);
               this.dM().a(dnr.i, $$5, dnr.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bml $$0, float $$1) {
      cge $$2 = new cge(this.dM(), this);
      double $$3 = $$0.dv() - 1.1F;
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$3 - $$2.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(ars.xJ, 1.0F, 0.4F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return 1.7F;
   }

   @Override
   protected bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if ($$2.a(cnb.rS) && this.a()) {
         this.a(art.h);
         this.a(dnr.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bkb.a(this.dM().B);
      } else {
         return bkb.d;
      }
   }

   @Override
   public void a(art $$0) {
      this.dM().a(null, this, ars.xK, $$0, 1.0F, 1.0F);
      if (!this.dM().y_()) {
         this.w(false);
         this.a(new cmy(cnb.fk), 1.7F);
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
   protected arr y() {
      return ars.xG;
   }

   @Nullable
   @Override
   protected arr d(bkt $$0) {
      return ars.xI;
   }

   @Nullable
   @Override
   protected arr n_() {
      return ars.xH;
   }

   @Override
   public elt cJ() {
      return new elt(0.0, (double)(0.75F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
