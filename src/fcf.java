public class fcf {
   private final fdt a;
   private boolean b;
   private String c;

   public fcf(fdt $$0) {
      this.a = $$0;
      fdt.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(fbd $$0) {
      fdt.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private fdt.a b(fbd $$0) {
      fdt.a $$1 = new fdt.a();
      $$1.a = $$0.a;
      fdt.a $$2 = this.a.a();
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
