public class fpw extends fqd {
   private static final xd a = xd.c("outOfMemory.title");
   private static final xd b = xd.c("outOfMemory.message");
   private static final int c = 300;
   private final fny d = new fny(this);

   public fpw() {
      super(a);
   }

   @Override
   protected void aR_() {
      this.d.a(a, this.p);
      this.d.c(new fkv(300, b, this.p));
      foc $$0 = this.d.b(foc.e().a(8));
      $$0.a(fkk.a(xc.l, $$0x -> this.m.a(new fqf())).a());
      $$0.a(fkk.a(xd.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aH_() {
      return false;
   }
}
