public class fny extends fpa {
   fny(flo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fpj $$7) {
      super($$0, $$1, $$2, $$3, $$7, 0.0125F);
      this.j = $$4;
      this.k = $$5;
      this.l = $$6;
      this.D *= 0.75F;
      this.t = 60 + this.r.a(12);
      this.c(15916745);
      this.b($$7);
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.a(this.n().d($$0, $$1, $$2));
      this.l();
   }

   public static class a implements foq<jz> {
      private final fpj a;

      public a(fpj $$0) {
         this.a = $$0;
      }

      public fon a(jz $$0, flo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         return new fny($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
      }
   }
}
