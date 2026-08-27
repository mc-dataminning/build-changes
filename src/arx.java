public class arx implements ajt {
   private static final xe a = xe.c("multiplayer.status.request_handled");
   private final ajs b;
   private final wc c;
   private boolean d;

   public arx(ajs $$0, wc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(xe $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }

   @Override
   public void a(aju $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new ajr(this.b));
      }
   }

   @Override
   public void a(ajo $$0) {
      this.c.a(new ajl($$0.b()));
      this.c.a(a);
   }
}
