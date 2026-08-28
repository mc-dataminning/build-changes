public class fqb extends fqe {
   private static final wu b = wu.c("multiplayerWarning.header").a(n.r);
   private static final wu c = wu.c("multiplayerWarning.message");
   private static final wu q = wu.c("multiplayerWarning.check");
   private static final wu r = b.f().f("\n").b(c);
   private final fnl s;

   public fqb(fnl $$0) {
      super(b, c, q, r);
      this.s = $$0;
   }

   @Override
   protected fli m() {
      fll $$0 = fll.e().a(8);
      $$0.a(fhu.a(wt.i, $$0x -> {
         if (this.a.a()) {
            this.l.m.v = true;
            this.l.m.av();
         }

         this.l.a(new fqa(this.s));
      }).a());
      $$0.a(fhu.a(wt.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.l.a(this.s);
   }
}
