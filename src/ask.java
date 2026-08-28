public class ask implements ajs {
   private static final wp b = wp.c("multiplayer.status.request_handled");
   private final ajr c;
   private final vi d;
   private boolean e;

   public ask(ajr $$0, vi $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(vk $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(ajt $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new ajq(this.c));
      }
   }

   @Override
   public void a(ajn $$0) {
      this.d.a(new ajk($$0.b()));
      this.d.a(b);
   }
}
