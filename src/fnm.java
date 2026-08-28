public class fnm extends fnp {
   private static final wy b = wy.c("mco.connect.connecting");
   private final hoz c;
   private final fkt d;
   private final fku e;

   public fnm(fxu $$0, fkt $$1, fku $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hoz($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, glj.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fos.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public wy a() {
      return b;
   }
}
