public class fls {
   private final fnf a;
   private boolean b;
   private String c;

   public fls(fnf $$0) {
      this.a = $$0;
      fnf.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(fkr $$0) {
      fnf.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private fnf.a b(fkr $$0) {
      fnf.a $$1 = this.a.a();
      if ($$0.a != null && !$$0.a.equals($$1.a)) {
         fnf.a $$2 = new fnf.a();
         $$2.a = $$0.a;
         $$2.b = true;
         this.a.a($$2);
         return $$2;
      } else {
         return $$1;
      }
   }
}
