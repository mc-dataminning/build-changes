public class fmw extends fnd {
   private static final wu a = wu.c("outOfMemory.title");
   private static final wu b = wu.c("outOfMemory.message");
   private static final int c = 300;
   private final fkz q = new fkz(this);

   public fmw() {
      super(a);
   }

   @Override
   protected void aO_() {
      this.q.a(a, this.o);
      this.q.c(new fhx(300, b, this.o));
      fld $$0 = this.q.b(fld.e().a(8));
      $$0.a(fhm.a(wt.l, $$0x -> this.l.a(new fnf())).a());
      $$0.a(fhm.a(wu.c("menu.quit"), $$0x -> this.l.q()).a());
      this.q.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
   }

   @Override
   public boolean aE_() {
      return false;
   }
}
