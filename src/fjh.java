public class fjh extends fjo {
   private static final wg a = wg.c("outOfMemory.title");
   private static final wg b = wg.c("outOfMemory.message");
   private static final int c = 300;
   private final fhc d = new fhc(this);

   public fjh() {
      super(a);
   }

   @Override
   protected void aN_() {
      this.d.a(a, this.m);
      this.d.c(new fea(300, b, this.m));
      fhg $$0 = this.d.b(fhg.e().a(8));
      $$0.a(fdp.a(wf.l, $$0x -> this.j.a(new fjt())).a());
      $$0.a(fdp.a(wg.c("menu.quit"), $$0x -> this.j.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aE_() {
      return false;
   }
}
