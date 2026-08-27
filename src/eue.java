public class eue extends eui {
   private static final vf b = vf.c("mco.connect.connecting");
   private final gkm c;
   private final eri d;
   private final erj e;

   public eue(fdb $$0, eri $$1, erj $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new gkm($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, fpf.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      evi.O().ac().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public vf a() {
      return b;
   }
}
