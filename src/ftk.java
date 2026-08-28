public class ftk extends ftr {
   private static final xv a = xv.c("outOfMemory.title");
   private static final xv b = xv.c("outOfMemory.message");
   private static final int c = 300;
   private final frn d = new frn(this);

   public ftk() {
      super(a);
   }

   @Override
   protected void aT_() {
      this.d.a(a, this.p);
      this.d.c(new foj(300, b, this.p));
      frr $$0 = this.d.b(frr.e().a(8));
      $$0.a(fny.a(xu.l, $$0x -> this.m.a(new ftt())).a());
      $$0.a(fny.a(xv.c("menu.quit"), $$0x -> this.m.q()).a());
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
