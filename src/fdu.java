public class fdu extends fdx {
   private static final ur b = ur.c("multiplayerWarning.header").a(n.r);
   private static final ur c = ur.c("multiplayerWarning.message");
   private static final ur k = ur.c("multiplayerWarning.check");
   private static final ur l = b.f().f("\n").b(c);
   private final fau m;

   public fdu(fau $$0) {
      super(b, c, k, l);
      this.m = $$0;
   }

   @Override
   protected void a(int $$0) {
      this.d(euz.a(uq.i, $$0x -> {
         if (this.a.a()) {
            this.f.m.v = true;
            this.f.m.as();
         }

         this.f.a(new fds(this.m));
      }).a(this.g / 2 - 155, 100 + $$0, 150, 20).a());
      this.d(euz.a(uq.k, $$0x -> this.f.a(this.m)).a(this.g / 2 - 155 + 160, 100 + $$0, 150, 20).a());
   }
}
