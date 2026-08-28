public class fmy extends fnf {
   private static final xp a = xp.c("outOfMemory.title");
   private static final xp b = xp.c("outOfMemory.message");
   private static final int c = 300;
   private final fkt d = new fkt(this);

   public fmy() {
      super(a);
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      this.d.c(new fhr(300, b, this.p));
      fkx $$0 = this.d.b(fkx.e().a(8));
      $$0.a(fhg.a(xo.l, $$0x -> this.m.a(new fnk())).a());
      $$0.a(fhg.a(xp.c("menu.quit"), $$0x -> this.m.q()).a());
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
