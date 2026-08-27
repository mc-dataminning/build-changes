public class fpn extends fru {
   fpn(fnr $$0, double $$1, double $$2, double $$3, djg $$4) {
      super($$0, $$1, $$2, $$3);
      this.a(evh.O().an().a().a($$4));
      this.u = 0.0F;
      this.t = 80;
      this.n = false;
   }

   @Override
   public fqy b() {
      return fqy.a;
   }

   @Override
   public float b(float $$0) {
      return 0.5F;
   }

   public static class a implements fqx<jp> {
      public fqu a(jp $$0, fnr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fpn($$1, $$2, $$3, $$4, $$0.c());
      }
   }
}
