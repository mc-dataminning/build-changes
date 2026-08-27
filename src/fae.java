public class fae {
   private final fbs a;
   private boolean b;
   private String c;

   public fae(fbs $$0) {
      this.a = $$0;
      fbs.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(ezc $$0) {
      fbs.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private fbs.a b(ezc $$0) {
      fbs.a $$1 = new fbs.a();
      $$1.a = $$0.a;
      fbs.a $$2 = this.a.a();
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
