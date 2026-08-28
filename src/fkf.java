public class fkf extends fki {
   private static final wp b = wp.c("mco.connect.connecting");
   private final hld c;
   private final fhm d;
   private final fhn e;

   public fkf(fum $$0, fhm $$1, fhn $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hld($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, ghs.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      flk.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public wp a() {
      return b;
   }
}
