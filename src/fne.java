public class fne extends fnl {
   private static final wu a = wu.c("outOfMemory.title");
   private static final wu b = wu.c("outOfMemory.message");
   private static final int c = 300;
   private final flh q = new flh(this);

   public fne() {
      super(a);
   }

   @Override
   protected void aP_() {
      this.q.a(a, this.o);
      this.q.c(new fif(300, b, this.o));
      fll $$0 = this.q.b(fll.e().a(8));
      $$0.a(fhu.a(wt.l, $$0x -> this.l.a(new fnn())).a());
      $$0.a(fhu.a(wu.c("menu.quit"), $$0x -> this.l.q()).a());
      this.q.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      this.q.a();
   }

   @Override
   public boolean aF_() {
      return false;
   }
}
