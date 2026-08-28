public class frp extends frw {
   private static final xj a = xj.c("outOfMemory.title");
   private static final xj b = xj.c("outOfMemory.message");
   private static final int c = 300;
   private final fps d = new fps(this);

   public frp() {
      super(a);
   }

   @Override
   protected void aR_() {
      this.d.a(a, this.p);
      this.d.c(new fmo(300, b, this.p));
      fpw $$0 = this.d.b(fpw.e().a(8));
      $$0.a(fmd.a(xi.l, $$0x -> this.m.a(new fry())).a());
      $$0.a(fmd.a(xj.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
