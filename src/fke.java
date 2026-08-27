public class fke extends fld {
   private static final wu a = wu.c("gui.toMenu");
   private static final wu b = wu.c("gui.toTitle");
   private final fld c;
   private final wu d;
   private final wu r;
   private final fiv s = fiv.d();

   public fke(fld $$0, wu $$1, wu $$2) {
      this($$0, $$1, $$2, a);
   }

   public fke(fld $$0, wu $$1, wu $$2, wu $$3) {
      super($$1);
      this.c = $$0;
      this.d = $$2;
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s.c().b().a(10);
      this.s.a(new fgl(this.l, this.p));
      this.s.a(new ffy(this.d, this.p).d(this.n - 50).b(true));
      ffe $$0;
      if (this.m.F()) {
         $$0 = ffe.a(this.r, $$0x -> this.m.a(this.c)).a();
      } else {
         $$0 = ffe.a(b, $$0x -> this.m.a(new fli())).a();
      }

      this.s.a($$0);
      this.s.a();
      this.s.a(this::c);
      this.c();
   }

   @Override
   protected void c() {
      fip.a(this.s, this.G());
   }

   @Override
   public wu i() {
      return wt.a(this.l, this.d);
   }

   @Override
   public boolean aD_() {
      return false;
   }
}
