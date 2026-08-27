public class ans implements afv {
   private static final vb a = vb.c("multiplayer.status.request_handled");
   private final afu b;
   private final uc c;
   private boolean d;

   public ans(afu $$0, uc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(vb $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(afx $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new aft(this.b));
      }
   }

   @Override
   public void a(afw $$0) {
      this.c.a(new afs($$0.a()));
      this.c.a(a);
   }
}
