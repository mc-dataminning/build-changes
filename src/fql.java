public class fql extends fqs {
   private static final xh a = xh.c("outOfMemory.title");
   private static final xh b = xh.c("outOfMemory.message");
   private static final int c = 300;
   private final fon d = new fon(this);

   public fql() {
      super(a);
   }

   @Override
   protected void aS_() {
      this.d.a(a, this.p);
      this.d.c(new flk(300, b, this.p));
      fos $$0 = this.d.b(fos.e().a(8));
      $$0.a(fkz.a(xg.l, $$0x -> this.m.a(new fqu())).a());
      $$0.a(fkz.a(xh.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aI_() {
      return false;
   }
}
