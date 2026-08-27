public class ari implements ajf {
   private static final ws a = ws.c("multiplayer.status.request_handled");
   private final aje b;
   private final vq c;
   private boolean d;

   public ari(aje $$0, vq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(ws $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }

   @Override
   public void a(ajg $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new ajd(this.b));
      }
   }

   @Override
   public void a(aja $$0) {
      this.c.a(new aix($$0.b()));
      this.c.a(a);
   }
}
