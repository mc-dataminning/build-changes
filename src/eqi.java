public class eqi {
   private final erw a;
   private boolean b;
   private String c;

   public eqi(erw $$0) {
      this.a = $$0;
      erw.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(epg $$0) {
      erw.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private erw.a b(epg $$0) {
      erw.a $$1 = new erw.a();
      $$1.a = $$0.a;
      erw.a $$2 = this.a.a();
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
