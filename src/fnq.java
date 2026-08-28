public class fnq extends fnx {
   private static final wy a = wy.c("outOfMemory.title");
   private static final wy b = wy.c("outOfMemory.message");
   private static final int c = 300;
   private final flt q = new flt(this);

   public fnq() {
      super(a);
   }

   @Override
   protected void aP_() {
      this.q.a(a, this.o);
      this.q.c(new fir(300, b, this.o));
      flx $$0 = this.q.b(flx.e().a(8));
      $$0.a(fig.a(wx.l, $$0x -> this.l.a(new fnz())).a());
      $$0.a(fig.a(wy.c("menu.quit"), $$0x -> this.l.q()).a());
      this.q.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
   }

   @Override
   public boolean aF_() {
      return false;
   }
}
