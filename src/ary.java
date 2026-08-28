public class ary implements ajr {
   private static final wz b = wz.c("multiplayer.status.request_handled");
   private final ajq c;
   private final vt d;
   private boolean e;

   public ary(ajq $$0, vt $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(vv $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(ajs $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new ajp(this.c));
      }
   }

   @Override
   public void a(ajm $$0) {
      this.d.a(new ajj($$0.b()));
      this.d.a(b);
   }
}
