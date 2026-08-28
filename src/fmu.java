public class fmu extends fnb {
   private static final xo a = xo.c("outOfMemory.title");
   private static final xo b = xo.c("outOfMemory.message");
   private static final int c = 300;
   private final fkp d = new fkp(this);

   public fmu() {
      super(a);
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      this.d.c(new fhn(300, b, this.p));
      fkt $$0 = this.d.b(fkt.e().a(8));
      $$0.a(fhc.a(xn.l, $$0x -> this.m.a(new fng())).a());
      $$0.a(fhc.a(xo.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
