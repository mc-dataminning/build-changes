public class fep extends fet {
   private static final wu b = wu.c("mco.connect.connecting");
   private final gvp c;
   private final fbt d;
   private final fbu e;

   public fep(fnj $$0, fbt $$1, fbu $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new gvp($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, gab.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fft.Q().ae().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public wu a() {
      return b;
   }
}
