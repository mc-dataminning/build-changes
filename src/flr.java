public class flr extends fly {
   private static final wx a = wx.c("outOfMemory.title");
   private static final wx b = wx.c("outOfMemory.message");
   private static final int c = 300;
   private final fjm d = new fjm(this);

   public flr() {
      super(a);
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      this.d.c(new fgk(300, b, this.p));
      fjq $$0 = this.d.b(fjq.e().a(8));
      $$0.a(ffz.a(ww.l, $$0x -> this.m.a(new fmd())).a());
      $$0.a(ffz.a(wx.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
