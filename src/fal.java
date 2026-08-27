public class fal extends fap {
   private static final wg b = wg.c("mco.connect.connecting");
   private final gri c;
   private final exp d;
   private final exq e;

   public fal(fjo $$0, exp $$1, exq $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new gri($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, fvy.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fbp.Q().ae().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public wg a() {
      return b;
   }
}
