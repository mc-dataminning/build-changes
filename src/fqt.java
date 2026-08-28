public class fqt extends fra {
   private static final xi a = xi.c("outOfMemory.title");
   private static final xi b = xi.c("outOfMemory.message");
   private static final int c = 300;
   private final fow d = new fow(this);

   public fqt() {
      super(a);
   }

   @Override
   protected void aR_() {
      this.d.a(a, this.p);
      this.d.c(new fls(300, b, this.p));
      fpa $$0 = this.d.b(fpa.e().a(8));
      $$0.a(flh.a(xh.l, $$0x -> this.m.a(new frc())).a());
      $$0.a(flh.a(xi.c("menu.quit"), $$0x -> this.m.q()).a());
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
