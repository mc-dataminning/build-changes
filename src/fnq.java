public class fnq {
   private final fpe a;
   private boolean b;
   private String c;

   public fnq(fpe $$0) {
      this.a = $$0;
      fpe.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(fmp $$0) {
      fpe.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private fpe.a b(fmp $$0) {
      fpe.a $$1 = this.a.a();
      if ($$0.a != null && !$$0.a.equals($$1.a)) {
         fpe.a $$2 = new fpe.a();
         $$2.a = $$0.a;
         $$2.b = true;
         this.a.a($$2);
         return $$2;
      } else {
         return $$1;
      }
   }
}
