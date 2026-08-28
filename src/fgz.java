public class fgz {
   private final fim a;
   private boolean b;
   private String c;

   public fgz(fim $$0) {
      this.a = $$0;
      fim.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(ffz $$0) {
      fim.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private fim.a b(ffz $$0) {
      fim.a $$1 = new fim.a();
      $$1.a = $$0.a;
      fim.a $$2 = this.a.a();
      boolean $$3 = $$1.a == null || $$1.a.equals($$2.a);
      if ($$3) {
         return $$2;
      } else {
         $$1.b = true;
         this.a.a($$1);
         return $$1;
      }
   }
}
