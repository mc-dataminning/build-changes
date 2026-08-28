public class fmv extends fnc {
   private static final xo a = xo.c("outOfMemory.title");
   private static final xo b = xo.c("outOfMemory.message");
   private static final int c = 300;
   private final fkq d = new fkq(this);

   public fmv() {
      super(a);
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      this.d.c(new fho(300, b, this.p));
      fku $$0 = this.d.b(fku.e().a(8));
      $$0.a(fhd.a(xn.l, $$0x -> this.m.a(new fnh())).a());
      $$0.a(fhd.a(xo.c("menu.quit"), $$0x -> this.m.q()).a());
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
