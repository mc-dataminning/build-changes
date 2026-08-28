public class asv implements akc {
   private static final ww b = ww.c("multiplayer.status.request_handled");
   private final akb c;
   private final vp d;
   private boolean e;

   public asv(akb $$0, vp $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(vr $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(akd $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new aka(this.c));
      }
   }

   @Override
   public void a(ajx $$0) {
      this.d.a(new aju($$0.b()));
      this.d.a(b);
   }
}
