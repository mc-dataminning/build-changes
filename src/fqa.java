public class fqa extends fqh {
   private static final xe a = xe.c("outOfMemory.title");
   private static final xe b = xe.c("outOfMemory.message");
   private static final int c = 300;
   private final foc d = new foc(this);

   public fqa() {
      super(a);
   }

   @Override
   protected void aS_() {
      this.d.a(a, this.p);
      this.d.c(new fkz(300, b, this.p));
      fog $$0 = this.d.b(fog.e().a(8));
      $$0.a(fko.a(xd.l, $$0x -> this.m.a(new fqj())).a());
      $$0.a(fko.a(xe.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aI_() {
      return false;
   }
}
