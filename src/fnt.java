public class fnt extends fnw {
   private static final wy b = wy.c("mco.connect.connecting");
   private final hph c;
   private final fla d;
   private final flb e;

   public fnt(fyb $$0, fla $$1, flb $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hph($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, glr.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      foz.Q().af().i();
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
