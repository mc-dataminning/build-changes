public class fke extends fkh {
   private static final wp b = wp.c("mco.connect.connecting");
   private final hlc c;
   private final fhl d;
   private final fhm e;

   public fke(ful $$0, fhl $$1, fhm $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hlc($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, ghr.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      flj.Q().af().i();
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
