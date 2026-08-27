public class fmg extends fli {
   protected fmg(fis $$0, double $$1, double $$2, double $$3, double $$4, fml $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.t = 16;
      this.D = 1.5F;
      this.b($$5);
   }

   public static class a implements flt<iy> {
      private final fml a;

      public a(fml $$0) {
         this.a = $$0;
      }

      public flq a(iy $$0, fis $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmg($$1, $$2, $$3, $$4, $$5, this.a);
      }
   }
}
