public class epr {
   private final erf a;
   private boolean b;
   private String c;

   public epr(erf $$0) {
      this.a = $$0;
      erf.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(eop $$0) {
      erf.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private erf.a b(eop $$0) {
      erf.a $$1 = new erf.a();
      $$1.a = $$0.a;
      erf.a $$2 = this.a.a();
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
