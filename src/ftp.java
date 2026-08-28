public class ftp extends ftw {
   private static final xv a = xv.c("outOfMemory.title");
   private static final xv b = xv.c("outOfMemory.message");
   private static final int c = 300;
   private final frs d = new frs(this);

   public ftp() {
      super(a);
   }

   @Override
   protected void aT_() {
      this.d.a(a, this.p);
      this.d.c(new foo(300, b, this.p));
      frw $$0 = this.d.b(frw.e().a(8));
      $$0.a(fod.a(xu.l, $$0x -> this.m.a(new fty())).a());
      $$0.a(fod.a(xv.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
