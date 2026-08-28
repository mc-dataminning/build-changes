public class fri extends frp {
   private static final xl a = xl.c("outOfMemory.title");
   private static final xl b = xl.c("outOfMemory.message");
   private static final int c = 300;
   private final fpl d = new fpl(this);

   public fri() {
      super(a);
   }

   @Override
   protected void aS_() {
      this.d.a(a, this.p);
      this.d.c(new fmh(300, b, this.p));
      fpp $$0 = this.d.b(fpp.e().a(8));
      $$0.a(flw.a(xk.l, $$0x -> this.m.a(new frr())).a());
      $$0.a(flw.a(xl.c("menu.quit"), $$0x -> this.m.q()).a());
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
