public class fmq extends fnj {
   private static final wu a = wu.c("gui.toMenu");
   private static final wu b = wu.c("gui.toTitle");
   private final fnj c;
   private final wu q;
   private final wu r;
   private final flj s = flj.d();

   public fmq(fnj $$0, wu $$1, wu $$2) {
      this($$0, $$1, $$2, a);
   }

   public fmq(fnj $$0, wu $$1, wu $$2, wu $$3) {
      super($$1);
      this.c = $$0;
      this.q = $$2;
      this.r = $$3;
   }

   @Override
   protected void aP_() {
      this.s.c().b().a(10);
      this.s.a(new fiz(this.k, this.o));
      this.s.a(new fim(this.q, this.o).d(this.m - 50).b(true));
      fhs $$0;
      if (this.l.F()) {
         $$0 = fhs.a(this.r, $$0x -> this.l.a(this.c)).a();
      } else {
         $$0 = fhs.a(b, $$0x -> this.l.a(new fnl())).a();
      }

      this.s.a($$0);
      this.s.a();
      this.s.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fld.a(this.s, this.H());
   }

   @Override
   public wu i() {
      return wt.a(this.k, this.q);
   }

   @Override
   public boolean aF_() {
      return false;
   }
}
