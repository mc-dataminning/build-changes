public class fnw extends fod {
   private static final wz a = wz.c("outOfMemory.title");
   private static final wz b = wz.c("outOfMemory.message");
   private static final int c = 300;
   private final flz r = new flz(this);

   public fnw() {
      super(a);
   }

   @Override
   protected void aT_() {
      this.r.a(a, this.o);
      this.r.c(new fix(300, b, this.o));
      fmd $$0 = this.r.b(fmd.e().a(8));
      $$0.a(fim.a(wy.l, $$0x -> this.l.a(new fof())).a());
      $$0.a(fim.a(wz.c("menu.quit"), $$0x -> this.l.q()).a());
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
