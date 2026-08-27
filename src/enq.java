public class enq {
   private final epe a;
   private boolean b;
   private String c;

   public enq(epe $$0) {
      this.a = $$0;
      epe.a $$1 = $$0.a();
      this.b = $$1.b;
      this.c = $$1.a;
   }

   public boolean a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   public void a(emo $$0) {
      epe.a $$1 = this.b($$0);
      this.b = $$1.b;
      this.c = $$1.a;
   }

   private epe.a b(emo $$0) {
      epe.a $$1 = new epe.a();
      $$1.a = $$0.a;
      epe.a $$2 = this.a.a();
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
