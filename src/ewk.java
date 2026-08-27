public class ewk extends ewo {
   private static final vq b = vq.c("mco.connect.connecting");
   private final gna c;
   private final eto d;
   private final etp e;

   public ewk(ffl $$0, eto $$1, etp $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new gna($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, frs.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      exo.P().ad().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public vq a() {
      return b;
   }
}
