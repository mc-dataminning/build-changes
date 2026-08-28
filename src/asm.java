public class asm implements akb {
   private static final xd b = xd.c("multiplayer.status.request_handled");
   private final aka c;
   private final vx d;
   private boolean e;

   public asm(aka $$0, vx $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(vz $$0) {
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   @Override
   public void a(akc $$0) {
      if (this.e) {
         this.d.a(b);
      } else {
         this.e = true;
         this.d.a(new ajz(this.c));
      }
   }

   @Override
   public void a(ajw $$0) {
      this.d.a(new ajt($$0.b()));
      this.d.a(b);
   }
}
