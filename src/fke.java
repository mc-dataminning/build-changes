public class fke extends fkh {
   private static final wo b = wo.c("mco.connect.connecting");
   private final hkv c;
   private final fhl d;
   private final fhm e;

   public fke(fuk $$0, fhl $$1, fhm $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new hkv($$0);
   }

   @Override
   public void run() {
      if (this.e.a != null) {
         this.c.a(this.d, ghq.a(this.e.a));
      } else {
         this.b();
      }
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      flj.Q().af().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public wo a() {
      return b;
   }
}
