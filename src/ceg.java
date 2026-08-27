import java.util.List;

public class ceg extends cen {
   public static final float b = bnw.C.k() / bnw.X.k();
   private static final int e = 1200;
   private static final int bT = 50;
   private static final int bU = 6000;
   private static final int bV = 2;
   private static final int bW = 1200;

   public ceg(bnw<? extends ceg> $$0, cvr $$1) {
      super($$0, $$1);
      this.fL();
      if (this.d != null) {
         this.d.c(400);
      }
   }

   public static bpo.a u() {
      return cen.gg().a(bpp.o, 0.3F).a(bpp.c, 8.0).a(bpp.n, 80.0);
   }

   @Override
   public int w() {
      return 60;
   }

   @Override
   protected atk y() {
      return this.bc() ? atl.hA : atl.hB;
   }

   @Override
   protected atk d(bmp $$0) {
      return this.bc() ? atl.hG : atl.hH;
   }

   @Override
   protected atk n_() {
      return this.bc() ? atl.hD : atl.hE;
   }

   @Override
   protected atk A() {
      return atl.hF;
   }

   @Override
   protected void aa() {
      super.aa();
      if ((this.ag + this.aj()) % 1200 == 0) {
         bnd $$0 = new bnd(bnf.d, 6000, 2);
         List<aox> $$1 = bne.a((aow)this.dM(), this, this.dk(), 50.0, $$0, 1200);
         $$1.forEach($$0x -> $$0x.d.b(new abm(abm.l, this.aU() ? 0.0F : 1.0F)));
      }

      if (!this.fS()) {
         this.a(this.dm(), 16);
      }
   }
}
