public class ewn extends evp<ccd> {
   private static final acq w = new acq("textures/gui/container/horse.png");
   private final btk x;
   private float y;
   private float z;

   public ewn(ccd $$0, byn $$1, btk $$2) {
      super($$0, $$1, $$2.H_());
      this.x = $$2;
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(w, $$4, $$5, 0, 0, this.c, this.k);
      if (this.x instanceof btj $$6 && $$6.r()) {
         $$0.a(w, $$4 + 79, $$5 + 17, 0, this.k, $$6.gg() * 18, 54);
      }

      if (this.x.g()) {
         $$0.a(w, $$4 + 7, $$5 + 35 - 18, 18, this.k + 54, 18, 18);
      }

      if (this.x.gH()) {
         if (this.x instanceof btn) {
            $$0.a(w, $$4 + 7, $$5 + 35, 36, this.k + 54, 18, 18);
         } else {
            $$0.a(w, $$4 + 7, $$5 + 35, 0, this.k + 54, 18, 18);
         }
      }

      ewo.a($$0, $$4 + 51, $$5 + 60, 17, (float)($$4 + 51) - this.y, (float)($$5 + 75 - 50) - this.z, this.x);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      this.y = (float)$$1;
      this.z = (float)$$2;
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }
}
