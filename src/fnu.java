public class fnu extends fob {
   private static final wz a = wz.c("outOfMemory.title");
   private static final wz b = wz.c("outOfMemory.message");
   private static final int c = 300;
   private final flx r = new flx(this);

   public fnu() {
      super(a);
   }

   @Override
   protected void aT_() {
      this.r.a(a, this.o);
      this.r.c(new fiv(300, b, this.o));
      fmb $$0 = this.r.b(fmb.e().a(8));
      $$0.a(fik.a(wy.l, $$0x -> this.l.a(new fod())).a());
      $$0.a(fik.a(wz.c("menu.quit"), $$0x -> this.l.q()).a());
      this.r.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.r.a();
   }

   @Override
   public boolean aJ_() {
      return false;
   }
}
