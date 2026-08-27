public class enp {
   private final epc a;
   private boolean b;
   private String c;

   public enp(epc $$0) {
      this.a = $$0;
      epc.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(emm $$0) {
      epc.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private epc.a b(emm $$0) {
      epc.a $$1 = new epc.a();
      $$1.a = $$0.a;
      epc.a $$2 = this.a.a();
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
