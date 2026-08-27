public class fls extends flz {
   private static final wx a = wx.c("outOfMemory.title");
   private static final wx b = wx.c("outOfMemory.message");
   private static final int c = 300;
   private final fjn d = new fjn(this);

   public fls() {
      super(a);
   }

   @Override
   protected void aN_() {
      this.d.a(a, this.p);
      this.d.c(new fgl(300, b, this.p));
      fjr $$0 = this.d.b(fjr.e().a(8));
      $$0.a(fga.a(ww.l, $$0x -> this.m.a(new fme())).a());
      $$0.a(fga.a(wx.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aE_() {
      return false;
   }
}
