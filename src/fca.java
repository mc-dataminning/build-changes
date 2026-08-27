public class fca extends fce {
   private static final wu b = wu.c("mco.connect.connecting");
   private final gsy c;
   private final eze d;
   private final ezf e;

   public fca(fld $$0, eze $$1, ezf $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new gsy($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, fxn.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      fde.Q().ae().i();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public wu a() {
      return b;
   }
}
