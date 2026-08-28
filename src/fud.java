public class fud extends fuk {
   private static final wp a = wp.c("outOfMemory.title");
   private static final wp b = wp.c("outOfMemory.message");
   private static final int c = 300;
   private final fsg d = new fsg(this);

   public fud() {
      super(a);
   }

   @Override
   protected void aR_() {
      this.d.a(a, this.p);
      this.d.c(new fpd(300, b, this.p));
      fsk $$0 = this.d.b(fsk.e().a(8));
      $$0.a(fos.a(wo.l, $$0x -> this.m.a(new fum())).a());
      $$0.a(fos.a(wp.c("menu.quit"), $$0x -> this.m.q()).a());
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
