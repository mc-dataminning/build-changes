public class aqy implements aiv {
   private static final wi a = wi.c("multiplayer.status.request_handled");
   private final aiu b;
   private final vg c;
   private boolean d;

   public aqy(aiu $$0, vg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(wi $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }

   @Override
   public void a(aiw $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new ait(this.b));
      }
   }

   @Override
   public void a(aiq $$0) {
      this.c.a(new ain($$0.b()));
      this.c.a(a);
   }
}
