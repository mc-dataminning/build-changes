public class fmx extends fne {
   private static final xp a = xp.c("outOfMemory.title");
   private static final xp b = xp.c("outOfMemory.message");
   private static final int c = 300;
   private final fks d = new fks(this);

   public fmx() {
      super(a);
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      this.d.c(new fhq(300, b, this.p));
      fkw $$0 = this.d.b(fkw.e().a(8));
      $$0.a(fhf.a(xo.l, $$0x -> this.m.a(new fnj())).a());
      $$0.a(fhf.a(xp.c("menu.quit"), $$0x -> this.m.q()).a());
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
