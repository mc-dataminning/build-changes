public class asz implements akg {
   private static final xa b = xa.c("multiplayer.status.request_handled");
   private final akf c;
   private final vt d;
   private boolean e;

   public asz(akf $$0, vt $$1) {
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
   public void a(akh $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new ake(this.c));
      }
   }

   @Override
   public void a(akb $$0) {
      this.d.a(new ajy($$0.b()));
      this.d.a(b);
   }
}
