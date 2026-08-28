public class flc extends flf {
   private static final xv b = xv.c("mco.connect.connecting");
   private final hhu c;
   private final fij d;
   private final fik e;

   public flc(fty $$0, fij $$1, fik $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hhu($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, ghc.a(this.e.a));
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
   public xv a() {
      return b;
   }
}
