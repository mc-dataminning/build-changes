public class fsq extends fsy {
   fsq(fpx $$0, double $$1, double $$2, double $$3) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.t = 7;
   }

   @Override
   public void a() {
      for (int $$0 = 0; $$0 < 3; $$0++) {
         double $$1 = this.g + (this.r.j() - this.r.j()) * 4.0;
         double $$2 = this.h + (this.r.j() - this.r.j()) * 4.0;
         double $$3 = this.i + (this.r.j() - this.r.j()) * 4.0;
         this.c.a(jz.y, $$1, $$2, $$3, (double)((float)this.s / (float)this.t), 0.0, 0.0);
      }

      if (this.s++ == this.t) {
         this.k();
      }
   }

   public static class a implements ftd<kc> {
      public fta a(kc $$0, fpx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fsq($$1, $$2, $$3, $$4);
      }
   }
}
