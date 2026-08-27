public class fof extends fon {
   private static final xe a = xe.c("outOfMemory.title");
   private static final xe b = xe.c("outOfMemory.message");
   private static final int c = 300;
   private final fma d = new fma(this);

   public fof() {
      super(a);
   }

   @Override
   protected void aN_() {
      this.d.a(a, this.p);
      this.d.c(new fiy(300, b, this.p));
      fme $$0 = this.d.b(fme.e().a(8));
      $$0.a(fin.a(xd.l, $$0x -> this.m.a(new fou())).a());
      $$0.a(fin.a(xe.c("menu.quit"), $$0x -> this.m.q()).a());
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
