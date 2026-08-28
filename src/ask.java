public class ask implements ajt {
   private static final wp b = wp.c("multiplayer.status.request_handled");
   private final ajs c;
   private final vi d;
   private boolean e;

   public ask(ajs $$0, vi $$1) {
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
   public void a(aju $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new ajr(this.c));
      }
   }

   @Override
   public void a(ajo $$0) {
      this.d.a(new ajl($$0.b()));
      this.d.a(b);
   }
}
