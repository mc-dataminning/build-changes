public class flj extends flo {
   private int a;
   private final int b = 8;

   flj(fis $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
   }

   @Override
   public void a() {
      for (int $$0 = 0; $$0 < 6; $$0++) {
         double $$1 = this.g + (this.r.j() - this.r.j()) * 4.0;
         double $$2 = this.h + (this.r.j() - this.r.j()) * 4.0;
         double $$3 = this.i + (this.r.j() - this.r.j()) * 4.0;
         this.c.a(iv.x, $$1, $$2, $$3, (double)((float)this.a / (float)this.b), 0.0, 0.0);
      }

      this.a++;
      if (this.a == this.b) {
         this.k();
      }
   }

   public static class a implements flt<iy> {
      public flq a(iy $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new flj($$1, $$2, $$3, $$4);
      }
   }
}
