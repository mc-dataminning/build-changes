public class arr implements ajn {
   private static final wx a = wx.c("multiplayer.status.request_handled");
   private final ajm b;
   private final vv c;
   private boolean d;

   public arr(ajm $$0, vv $$1) {
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
   public void a(ajo $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new ajl(this.b));
      }
   }

   @Override
   public void a(aji $$0) {
      this.c.a(new ajf($$0.b()));
      this.c.a(a);
   }
}
