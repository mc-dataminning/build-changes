public class fnc extends fnj {
   private static final wu a = wu.c("outOfMemory.title");
   private static final wu b = wu.c("outOfMemory.message");
   private static final int c = 300;
   private final flf q = new flf(this);

   public fnc() {
      super(a);
   }

   @Override
   protected void aP_() {
      this.q.a(a, this.o);
      this.q.c(new fid(300, b, this.o));
      flj $$0 = this.q.b(flj.e().a(8));
      $$0.a(fhs.a(wt.l, $$0x -> this.l.a(new fnl())).a());
      $$0.a(fhs.a(wu.c("menu.quit"), $$0x -> this.l.q()).a());
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
