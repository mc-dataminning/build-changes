public class fbj extends fbn {
   private static final tn b = tn.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final tn c = tn.c("title.32bit.deprecation.realms");
   private static final tn k = tn.c("title.32bit.deprecation.realms.check");
   private static final tn l = b.e().f("\n").b(c);
   private final eym m;

   public fbj(eym $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(ess.a(tm.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.ar();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
