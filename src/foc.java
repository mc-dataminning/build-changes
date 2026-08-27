public class foc extends fof {
   private static final wu b = wu.c("multiplayerWarning.header").a(n.r);
   private static final wu c = wu.c("multiplayerWarning.message");
   private static final wu d = wu.c("multiplayerWarning.check");
   private static final wu r = b.f().f("\n").b(c);
   private final fld s;

   public foc(fld $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fis m() {
      fiv $$0 = fiv.e().a(8);
      $$0.a(ffe.a(wt.i, $$0x -> {
         if (this.a.a()) {
            this.m.m.v = true;
            this.m.m.av();
         }

         this.m.a(new foa(this.s));
      }).a());
      $$0.a(ffe.a(wt.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.m.a(this.s);
   }
}
