public class fji {
   private final fkv a;
   private boolean b;
   private String c;

   public fji(fkv $$0) {
      this.a = $$0;
      fkv.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(fih $$0) {
      fkv.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private fkv.a b(fih $$0) {
      fkv.a $$1 = this.a.a();
      if ($$0.a != null && !$$0.a.equals($$1.a)) {
         fkv.a $$2 = new fkv.a();
         $$2.a = $$0.a;
         $$2.b = true;
         this.a.a($$2);
         return $$2;
      } else {
         return $$1;
      }
   }
}
