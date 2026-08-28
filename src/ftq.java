public class ftq extends ftx {
   private static final xv a = xv.c("outOfMemory.title");
   private static final xv b = xv.c("outOfMemory.message");
   private static final int c = 300;
   private final frt d = new frt(this);

   public ftq() {
      super(a);
   }

   @Override
   protected void aT_() {
      this.d.a(a, this.p);
      this.d.c(new fop(300, b, this.p));
      frx $$0 = this.d.b(frx.e().a(8));
      $$0.a(foe.a(xu.l, $$0x -> this.m.a(new ftz())).a());
      $$0.a(foe.a(xv.c("menu.quit"), $$0x -> this.m.q()).a());
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
