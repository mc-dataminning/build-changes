public class fue extends ful {
   private static final wp a = wp.c("outOfMemory.title");
   private static final wp b = wp.c("outOfMemory.message");
   private static final int c = 300;
   private final fsh d = new fsh(this);

   public fue() {
      super(a);
   }

   @Override
   protected void aR_() {
      this.d.a(a, this.p);
      this.d.c(new fpe(300, b, this.p));
      fsl $$0 = this.d.b(fsl.e().a(8));
      $$0.a(fot.a(wo.l, $$0x -> this.m.a(new fun())).a());
      $$0.a(fot.a(wp.c("menu.quit"), $$0x -> this.m.q()).a());
      this.d.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.d.a();
   }

   @Override
   public boolean aG_() {
      return false;
   }
}
