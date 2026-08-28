public class fkc extends fkf {
   private static final wo b = wo.c("mco.connect.connecting");
   private final hkw c;
   private final fhj d;
   private final fhk e;

   public fkc(fui $$0, fhj $$1, fhk $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hkw($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, gho.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      flh.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public wo a() {
      return b;
   }
}
