public class fjq extends fjx {
   private static final wi a = wi.c("outOfMemory.title");
   private static final wi b = wi.c("outOfMemory.message");
   private static final int c = 300;
   private final fhl d = new fhl(this);

   public fjq() {
      super(a);
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.m);
      this.d.c(new fej(300, b, this.m));
      fhp $$0 = this.d.b(fhp.e().a(8));
      $$0.a(fdy.a(wh.l, $$0x -> this.j.a(new fkc())).a());
      $$0.a(fdy.a(wi.c("menu.quit"), $$0x -> this.j.q()).a());
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
