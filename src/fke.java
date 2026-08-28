public class fke {
   private final flr a;
   private boolean b;
   private String c;

   public fke(flr $$0) {
      this.a = $$0;
      flr.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(fjd $$0) {
      flr.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private flr.a b(fjd $$0) {
      flr.a $$1 = this.a.a();
      if ($$0.a != null && !$$0.a.equals($$1.a)) {
         flr.a $$2 = new flr.a();
         $$2.a = $$0.a;
         $$2.b = true;
         this.a.a($$2);
         return $$2;
      } else {
         return $$1;
      }
   }
}
