public class eyc extends eyg {
   private static final vu b = vu.c("mco.connect.connecting");
   private final goy c;
   private final evg d;
   private final evh e;

   public eyc(fhf $$0, evg $$1, evh $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new goy($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, ftp.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      ezg.Q().ae().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public vu a() {
      return b;
   }
}
