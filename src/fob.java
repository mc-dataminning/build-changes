public class fob extends fof {
   private static final wu b = wu.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final wu c = wu.c("title.32bit.deprecation.realms");
   private static final wu d = wu.c("title.32bit.deprecation.realms.check");
   private static final wu r = b.f().f("\n").b(c);
   private final fld s;

   public fob(fld $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fis m() {
      fiv $$0 = fiv.e().a(8);
      $$0.a(ffe.a(wt.d, $$0x -> {
         if (this.a.a()) {
            this.m.m.w = true;
            this.m.m.av();
         }

         this.m.a(this.s);
      }).a());
      return $$0;
   }
}
