public class fjg extends fjk {
   private static final vs b = vs.c("title.32bit.deprecation.realms.header").a(n.r);
   private static final vs c = vs.c("title.32bit.deprecation.realms");
   private static final vs k = vs.c("title.32bit.deprecation.realms.check");
   private static final vs l = b.f().f("\n").b(c);
   private final fgh m;

   public fjg(fgh $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.c(fak.a(vr.d, $$0x -> {
         if (this.a.a()) {
            this.f.m.w = true;
            this.f.m.as();
         }

         this.f.a(this.m);
      }).a(this.g / 2 - 75, 100 + $$0, 150, 20).a());
   }
}
