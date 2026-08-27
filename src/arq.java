public class arq implements ajm {
   private static final wx a = wx.c("multiplayer.status.request_handled");
   private final ajl b;
   private final vv c;
   private boolean d;

   public arq(ajl $$0, vv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(wx $$0) {
   }

   @Override
   public boolean c() {
      return this.c.i();
   }

   @Override
   public void a(ajn $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new ajk(this.b));
      }
   }

   @Override
   public void a(ajh $$0) {
      this.c.a(new aje($$0.b()));
      this.c.a(a);
   }
}
