public class fmr extends fow {
   fmr(fkw $$0, double $$1, double $$2, double $$3, dgw $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(esr.N().am().a().a($$4));
      this.u = 0.0F;
      this.t = 80;
      this.n = false;
   }

   @Override
   public fnz b() {
      return fnz.a;
   }

   @Override
   public float b(float $$0) {
      return 0.5F;
   }

   public static class a implements fny<jk> {
      public fnv a(jk $$0, fkw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fmr($$1, $$2, $$3, $$4, $$0.c());
      }
   }
}
