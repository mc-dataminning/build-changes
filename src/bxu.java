import javax.annotation.Nullable;

public class bxu extends bwu implements bmc, cbr {
   private static final afs<Byte> b = afv.a(bxu.class, afu.a);
   private static final byte c = 16;
   private static final float d = 1.7F;

   public bxu(bkz<? extends bxu> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new btf(this, 1.25, 20, 10.0F));
      this.bO.a(2, new btt(this, 1.0, 1.0000001E-5F));
      this.bO.a(3, new bso(this, cdz.class, 6.0F));
      this.bO.a(4, new btb(this));
      this.bP.a(1, new btz<>(this, bln.class, 10, true, false, $$0 -> $$0 instanceof cbf));
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 4.0).a(bmr.m, 0.2F);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, (byte)16);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.w());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fi() {
      return true;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dN().B) {
         if (this.dN().s(this.dn()).a(arj.ad)) {
            this.a(this.dO().c(), 1.0F);
         }

         if (!this.dN().Y().b(csb.c)) {
            return;
         }

         dhn $$0 = cvh.dN.o();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = atq.a(this.ds() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = atq.a(this.du());
            int $$4 = atq.a(this.dy() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            hx $$5 = new hx($$2, $$3, $$4);
            if (this.dN().a_($$5).i() && $$0.a((csi)this.dN(), $$5)) {
               this.dN().b($$5, $$0);
               this.dN().a(dlx.i, $$5, dlx.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bll $$0, float $$1) {
      cev $$2 = new cev(this.dN(), this);
      double $$3 = $$0.dw() - 1.1F;
      double $$4 = $$0.ds() - this.ds();
      double $$5 = $$3 - $$2.du();
      double $$6 = $$0.dy() - this.dy();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(aqv.xo, 1.0F, 0.4F / (this.eh().i() * 0.4F + 0.8F));
      this.dN().b($$2);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 1.7F;
   }

   @Override
   protected bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if ($$2.a(clr.rS) && this.a()) {
         this.a(aqw.h);
         this.a(dlx.M, $$0);
         if (!this.dN().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bjb.a(this.dN().B);
      } else {
         return bjb.d;
      }
   }

   @Override
   public void a(aqw $$0) {
      this.dN().a(null, this, aqv.xp, $$0, 1.0F, 1.0F);
      if (!this.dN().y_()) {
         this.w(false);
         this.a(new clo(clr.fk), 1.7F);
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
   protected aqu y() {
      return aqv.xl;
   }

   @Nullable
   @Override
   protected aqu d(bjt $$0) {
      return aqv.xn;
   }

   @Nullable
   @Override
   protected aqu n_() {
      return aqv.xm;
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, (double)(0.75F * this.cI()), (double)(this.dh() * 0.4F));
   }
}
