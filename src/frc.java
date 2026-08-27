public class frc extends frt {
   private final fro a;

   frc(fnq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6, fro $$7) {
      super($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      this.B = 0.96F;
      this.a = $$7;
      this.d(1.5F);
      this.n = false;
      this.b($$7);
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public fqx b() {
      return fqx.c;
   }

   @Override
   public void a() {
      super.a();
      this.b(this.a);
   }

   public static record a(fro a) implements fqw<jy> {
      public fqt a(jy $$0, fnq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         frc $$8 = new frc($$1, $$2, $$3, $$4, $$5, $$6, $$7, this.a);
         $$8.e(1.0F);
         $$8.b($$5, $$6, $$7);
         $$8.A = $$0.c();
         $$8.z = $$0.c();
         $$8.a($$1.z.a(12) + 8);
         return $$8;
      }
   }
}
