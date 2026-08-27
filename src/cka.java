public class cka extends cjb {
   private static final aim<Boolean> e = aiq.a(cka.class, aio.k);

   public cka(bpd<? extends cka> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cka(cxb $$0, bpp $$1, double $$2, double $$3, double $$4) {
      super(bpd.br, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   protected float w() {
      return this.y() ? 0.73F : super.w();
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   public float a(cwt $$0, cwh $$1, ib $$2, dnb $$3, eip $$4, float $$5) {
      return this.y() && ces.d($$3) ? Math.min(0.8F, $$5) : $$5;
   }

   @Override
   protected void a(epq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         box $$1 = $$0.a();
         boolean $$4;
         if (this.af_() instanceof bpp $$3) {
            $$4 = $$1.a(this.dN().a(this, $$3), 8.0F);
            if ($$4) {
               if ($$1.bA()) {
                  this.a($$3, $$1);
               } else {
                  $$3.c(5.0F);
               }
            }
         } else {
            $$4 = $$1.a(this.dN().o(), 5.0F);
         }

         if ($$4 && $$1 instanceof bpp $$6) {
            int $$7 = 0;
            if (this.dM().aj() == bna.c) {
               $$7 = 10;
            } else if (this.dM().aj() == bna.d) {
               $$7 = 40;
            }

            if ($$7 > 0) {
               $$6.b(new bok(bom.t, 20 * $$7, 1), this.H());
            }
         }
      }
   }

   @Override
   protected void a(epr $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.dM().a(this, this.dr(), this.dt(), this.dx(), 1.0F, false, cxb.a.c);
         this.am();
      }
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      return false;
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(e, false);
   }

   public boolean y() {
      return this.an.a(e);
   }

   public void a(boolean $$0) {
      this.an.a(e, $$0);
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("dangerous", this.y());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a($$0.q("dangerous"));
   }
}
