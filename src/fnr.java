public class fnr extends fnv {
   private static final ws b = ws.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final ws c = ws.c("title.32bit.deprecation.realms");
   private static final ws d = ws.c("title.32bit.deprecation.realms.check");
   private static final ws r = b.f().f("\n").b(c);
   private final fkt s;

   public fnr(fkt $$0) {
      super(b, c, d, r);
      this.s = $$0;
   }

   @Override
   protected fii m() {
      fil $$0 = fil.e().a(8);
      $$0.a(feu.a(wr.d, $$0x -> {
         if (this.a.a()) {
            this.m.m.w = true;
            this.m.m.av();
         }

         this.m.a(this.s);
      }).a());
      return $$0;
   }
}
