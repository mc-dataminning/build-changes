public class fpm extends fpt {
   private static final xd a = xd.c("outOfMemory.title");
   private static final xd b = xd.c("outOfMemory.message");
   private static final int c = 300;
   private final fno d = new fno(this);

   public fpm() {
      super(a);
   }

   @Override
   protected void aT_() {
      this.d.a(a, this.p);
      this.d.c(new fkl(300, b, this.p));
      fns $$0 = this.d.b(fns.e().a(8));
      $$0.a(fka.a(xc.l, $$0x -> this.m.a(new fpv())).a());
      $$0.a(fka.a(xd.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aJ_() {
      return false;
   }
}
