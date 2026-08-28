public class fub extends fui {
   private static final wo a = wo.c("outOfMemory.title");
   private static final wo b = wo.c("outOfMemory.message");
   private static final int c = 300;
   private final fse d = new fse(this);

   public fub() {
      super(a);
   }

   @Override
   protected void aR_() {
      this.d.a(a, this.p);
      this.d.c(new fpb(300, b, this.p));
      fsi $$0 = this.d.b(fsi.e().a(8));
      $$0.a(fop.a(wn.l, $$0x -> this.m.a(new fuk())).a());
      $$0.a(fop.a(wo.c("menu.quit"), $$0x -> this.m.q()).a());
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
