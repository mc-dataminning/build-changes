public class fdt extends fdx {
   private static final ur b = ur.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final ur c = ur.c("title.32bit.deprecation.realms");
   private static final ur k = ur.c("title.32bit.deprecation.realms.check");
   private static final ur l = b.f().f("\n").b(c);
   private final fau m;

   public fdt(fau $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(euz.a(uq.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.as();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
