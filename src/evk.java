public class evk {
   private final ewy a;
   private boolean b;
   private String c;

   public evk(ewy $$0) {
      this.a = $$0;
      ewy.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(eui $$0) {
      ewy.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private ewy.a b(eui $$0) {
      ewy.a $$1 = new ewy.a();
      $$1.a = $$0.a;
      ewy.a $$2 = this.a.a();
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
