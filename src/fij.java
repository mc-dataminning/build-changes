public class fij {
   private final fjw a;
   private boolean b;
   private String c;

   public fij(fjw $$0) {
      this.a = $$0;
      fjw.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(fhi $$0) {
      fjw.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private fjw.a b(fhi $$0) {
      fjw.a $$1 = this.a.a();
      if ($$0.a != null && !$$0.a.equals($$1.a)) {
         fjw.a $$2 = new fjw.a();
         $$2.a = $$0.a;
         $$2.b = true;
         this.a.a($$2);
         return $$2;
      } else {
         return $$1;
      }
   }
}
