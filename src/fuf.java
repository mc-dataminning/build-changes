public class fuf extends fum {
   private static final wp a = wp.c("outOfMemory.title");
   private static final wp b = wp.c("outOfMemory.message");
   private static final int c = 300;
   private final fsi d = new fsi(this);

   public fuf() {
      super(a);
   }

   @Override
   protected void aR_() {
      this.d.a(a, this.p);
      this.d.c(new fpf(300, b, this.p));
      fsm $$0 = this.d.b(fsm.e().a(8));
      $$0.a(fou.a(wo.l, $$0x -> this.m.a(new fuo())).a());
      $$0.a(fou.a(wp.c("menu.quit"), $$0x -> this.m.q()).a());
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
