public class arq implements ajk {
   private static final wu b = wu.c("multiplayer.status.request_handled");
   private final ajj c;
   private final vp d;
   private boolean e;

   public arq(ajj $$0, vp $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(wu $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(ajl $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new aji(this.c));
      }
   }

   @Override
   public void a(ajf $$0) {
      this.d.a(new ajc($$0.b()));
      this.d.a(b);
   }
}
