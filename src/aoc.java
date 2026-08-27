public class aoc implements agf {
   private static final vd a = vd.c("multiplayer.status.request_handled");
   private final age b;
   private final ue c;
   private boolean d;

   public aoc(age $$0, ue $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public void a(vd $$0) {
   }

   @Override
   public boolean c() {
      return this.c.k();
   }

   @Override
   public void a(agh $$0) {
      if (this.d) {
         this.c.a(a);
      } else {
         this.d = true;
         this.c.a(new agd(this.b));
      }
   }

   @Override
   public void a(agg $$0) {
      this.c.a(new agc($$0.a()));
      this.c.a(a);
   }
}
