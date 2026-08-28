public class fpt extends fpw {
   private static final wu b = wu.c("multiplayerWarning.header").a(n.r);
   private static final wu c = wu.c("multiplayerWarning.message");
   private static final wu q = wu.c("multiplayerWarning.check");
   private static final wu r = b.f().f("\n").b(c);
   private final fnd s;

   public fpt(fnd $$0) {
      super(b, c, q, r);
      this.s = $$0;
   }

   @Override
   protected fla m() {
      fld $$0 = fld.e().a(8);
      $$0.a(fhm.a(wt.i, $$0x -> {
         if (this.a.a()) {
            this.l.m.v = true;
            this.l.m.av();
         }

         this.l.a(new fps(this.s));
      }).a());
      $$0.a(fhm.a(wt.k, $$0x -> this.d()).a());
      return $$0;
   }

   @Override
   public void d() {
      this.l.a(this.s);
   }
}
