public class fod {
   private final fpr a;
   private boolean b;
   private String c;

   public fod(fpr $$0) {
      this.a = $$0;
      fpr.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(fnc $$0) {
      fpr.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private fpr.a b(fnc $$0) {
      fpr.a $$1 = this.a.a();
      if ($$0.a != null && !$$0.a.equals($$1.a)) {
         fpr.a $$2 = new fpr.a();
         $$2.a = $$0.a;
         $$2.b = true;
         this.a.a($$2);
         return $$2;
      } else {
         return $$1;
      }
   }
}
