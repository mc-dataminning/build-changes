public class frq extends fru {
   private static final xe b = xe.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final xe c = xe.c("title.32bit.deprecation.realms");
   private static final xe d = xe.c("title.32bit.deprecation.realms.check");
   private static final xe r = b.f().f("\n").a(c);
   private final fon s;

   public frq(fon $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fmb B() {
      fme $$0 = fme.e().a(8);
      $$0.a(fin.a(xd.d, $$0x -> {
         if (this.a.a()) {
            this.m.m.w = true;
            this.m.m.av();
         }

         this.m.a(this.s);
      }).a());
      return $$0;
   }
}
