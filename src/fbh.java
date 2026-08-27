public class fbh extends fbl {
   private static final tm b = tm.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final tm c = tm.c("title.32bit.deprecation.realms");
   private static final tm k = tm.c("title.32bit.deprecation.realms.check");
   private static final tm l = b.e().f("\n").b(c);
   private final eyk m;

   public fbh(eyk $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(esq.a(tl.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.ar();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
