public class fly extends fmb {
   private static final wv b = wv.c("mco.connect.connecting");
   private final hnc c;
   private final fjf d;
   private final fjg e;

   public fly(fwf $$0, fjf $$1, fjg $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hnc($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, gjr.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fnd.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public wv a() {
      return b;
   }
}
