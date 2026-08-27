public class fkw extends fld {
   private static final wu a = wu.c("outOfMemory.title");
   private static final wu b = wu.c("outOfMemory.message");
   private static final int c = 300;
   private final fir d = new fir(this);

   public fkw() {
      super(a);
   }

   @Override
   protected void aM_() {
      this.d.a(a, this.p);
      this.d.c(new ffp(300, b, this.p));
      fiv $$0 = this.d.b(fiv.e().a(8));
      $$0.a(ffe.a(wt.l, $$0x -> this.m.a(new fli())).a());
      $$0.a(ffe.a(wu.c("menu.quit"), $$0x -> this.m.q()).a());
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
