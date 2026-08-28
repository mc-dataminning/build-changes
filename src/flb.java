public class flb extends fle {
   private static final wp b = wp.c("mco.connect.connecting");
   private final hmb c;
   private final fii d;
   private final fij e;

   public flb(fvi $$0, fii $$1, fij $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hmb($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, giq.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fmg.Q().af().i();
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
