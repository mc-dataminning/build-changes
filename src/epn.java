public class epn extends epq {
   private static final ti b = ti.c("mco.connect.connecting");
   private final get c;
   private final emr d;
   private final ems e;

   public epn(eyf $$0, emr $$1, ems $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new get($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, fkd.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      eqq.O().ac().a();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public ti a() {
      return b;
   }
}
