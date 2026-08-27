public class apz implements ahz {
   private static final vq a = vq.c("multiplayer.status.request_handled");
   private final ahy b;
   private final uo c;
   private boolean d;

   public apz(ahy $$0, uo $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(vq $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }

   @Override
   public void a(aia $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new ahx(this.b));
      }
   }

   @Override
   public void a(ahu $$0) {
      this.c.a(new ahr($$0.b()));
      this.c.a(a);
   }
}
