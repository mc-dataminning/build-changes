public class aoh implements agj {
   private static final vg a = vg.c("multiplayer.status.request_handled");
   private final agi b;
   private final uh c;
   private boolean d;

   public aoh(agi $$0, uh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(vg $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(agl $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new agh(this.b));
      }
   }

   @Override
   public void a(agk $$0) {
      this.c.a(new agg($$0.a()));
      this.c.a(a);
   }
}
