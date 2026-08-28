public class fpl extends fpo {
   private static final xg b = xg.c("mco.connect.connecting");
   private final hra c;
   private final fmr d;
   private final fms e;

   public fpl(fzq $$0, fmr $$1, fms $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hra($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, gng.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fqq.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public xg a() {
      return b;
   }
}
