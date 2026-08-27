public class ffb extends fff {
   private static final vb b = vb.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final vb c = vb.c("title.32bit.deprecation.realms");
   private static final vb k = vb.c("title.32bit.deprecation.realms.check");
   private static final vb l = b.f().f("\n").b(c);
   private final fcc m;

   public ffb(fcc $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(ewh.a(va.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.as();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
