public class fas extends faw {
   private static final te b = te.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final te c = te.c("title.32bit.deprecation.realms");
   private static final te k = te.c("title.32bit.deprecation.realms.check");
   private static final te l = b.e().f("\n").b(c);
   private final exv m;

   public fas(exv $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(esi.a(td.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.aq();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
