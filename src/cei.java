public class cei extends cer {
   private static final int b = 2400;
   private int c;

   public cei(bnw<? extends cei> $$0, cvr $$1) {
      super($$0, $$1);
      this.bJ = 3;
   }

   @Override
   protected void B() {
      this.bO.a(1, new buz(this));
      this.bO.a(1, new buu(this, this.dM()));
      this.bO.a(2, new bvp(this, 1.0, false));
      this.bO.a(3, new bws(this, 1.0));
      this.bO.a(7, new bvn(this, chl.class, 8.0F));
      this.bO.a(8, new bwa(this));
      this.bP.a(1, new bwx(this).a());
      this.bP.a(2, new bwy<>(this, chl.class, true));
   }

   public static bpo.a u() {
      return cer.gm().a(bpp.n, 8.0).a(bpp.o, 0.25).a(bpp.c, 2.0);
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.c;
   }

   @Override
   protected atk y() {
      return atl.ib;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.id;
   }

   @Override
   protected atk n_() {
      return atl.ic;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.ie, 0.15F, 1.0F);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.c = $$0.h("Lifetime");
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Lifetime", this.c);
   }

   @Override
   public void l() {
      this.aU = this.dC();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public void d_() {
      super.d_();
      if (this.dM().B) {
         for (int $$0 = 0; $$0 < 2; $$0++) {
            this.dM().a(jz.Z, this.d(0.5), this.du(), this.g(0.5), (this.af.j() - 0.5) * 2.0, -this.af.j(), (this.af.j() - 0.5) * 2.0);
         }
      } else {
         if (!this.fN()) {
            this.c++;
         }

         if (this.c >= 2400) {
            this.am();
         }
      }
   }

   public static boolean b(bnw<cei> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         chl $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }
}
