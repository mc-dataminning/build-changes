public class fmw extends fnd {
   private static final xp a = xp.c("outOfMemory.title");
   private static final xp b = xp.c("outOfMemory.message");
   private static final int c = 300;
   private final fkr d = new fkr(this);

   public fmw() {
      super(a);
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      this.d.c(new fhp(300, b, this.p));
      fkv $$0 = this.d.b(fkv.e().a(8));
      $$0.a(fhe.a(xo.l, $$0x -> this.m.a(new fni())).a());
      $$0.a(fhe.a(xp.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aC_() {
      return false;
   }
}
