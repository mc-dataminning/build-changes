public class ftr extends fty {
   private static final xv a = xv.c("outOfMemory.title");
   private static final xv b = xv.c("outOfMemory.message");
   private static final int c = 300;
   private final fru d = new fru(this);

   public ftr() {
      super(a);
   }

   @Override
   protected void aT_() {
      this.d.a(a, this.p);
      this.d.c(new foq(300, b, this.p));
      fry $$0 = this.d.b(fry.e().a(8));
      $$0.a(fof.a(xu.l, $$0x -> this.m.a(new fua())).a());
      $$0.a(fof.a(xv.c("menu.quit"), $$0x -> this.m.q()).a());
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
