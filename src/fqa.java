public class fqa extends fqd {
   private static final xc b = xc.c("mco.connect.connecting");
   private final hrm c;
   private final fng d;
   private final fnh e;

   public fqa(gaf $$0, fng $$1, fnh $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hrm($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, gnv.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      frf.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public xc a() {
      return b;
   }
}
