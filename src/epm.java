public class epm extends epp {
   private static final tl b = tl.c("mco.connect.connecting");
   private final geu c;
   private final emq d;
   private final emr e;

   public epm(eye $$0, emq $$1, emr $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new geu($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, fke.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      eqp.O().ac().a();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public tl a() {
      return b;
   }
}
