public class aog implements agi {
   private static final vf a = vf.c("multiplayer.status.request_handled");
   private final agh b;
   private final ug c;
   private boolean d;

   public aog(agh $$0, ug $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(vf $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(agk $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new agg(this.b));
      }
   }

   @Override
   public void a(agj $$0) {
      this.c.a(new agf($$0.a()));
      this.c.a(a);
   }
}
