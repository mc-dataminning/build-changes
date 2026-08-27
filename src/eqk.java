public class eqk extends eqo {
   private static final ui b = ui.c("mco.connect.connecting");
   private final gfu c;
   private final eno d;
   private final enp e;

   public eqk(ezd $$0, eno $$1, enp $$2) {
      this.d = $$1;
      this.e = $$2;
      this.c = new gfu($$0);
   }

   @Override
   public void run() {
      this.c.a(this.d, fld.a(this.e.a));
   }

   @Override
   public void b() {
      super.b();
      this.c.a();
      ero.O().ac().a();
   }

   @Override
   public void c() {
      this.c.b();
   }

   @Override
   public ui a() {
      return b;
   }
}
