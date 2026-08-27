public class anl implements afo {
   private static final uv a = uv.c("multiplayer.status.request_handled");
   private final afn b;
   private final tw c;
   private boolean d;

   public anl(afn $$0, tw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(uv $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(afq $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new afm(this.b));
      }
   }

   @Override
   public void a(afp $$0) {
      this.c.a(new afl($$0.a()));
      this.c.a(a);
   }
}
