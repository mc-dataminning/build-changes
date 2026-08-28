public class asx implements akj {
   private static final xl b = xl.c("multiplayer.status.request_handled");
   private final aki c;
   private final wf d;
   private boolean e;

   public asx(aki $$0, wf $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(wh $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(akk $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new akh(this.c));
      }
   }

   @Override
   public void a(ake $$0) {
      this.d.a(new akb($$0.b()));
      this.d.a(b);
   }
}
