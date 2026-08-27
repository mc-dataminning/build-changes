public class byp extends byn {
   private final int h;
   private static final int i = 10;
   private static final int j = 20;

   public byp(bsq $$0, int $$1) {
      super($$0);
      this.h = $$1;
   }

   @Override
   public void a() {
      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0x -> this.a.bl = this.a(this.a.bl, $$0x + 20.0F, this.b));
         this.h().ifPresent($$0x -> this.a.s(this.a(this.a.dM(), $$0x + 10.0F, this.c)));
      } else {
         if (this.a.J().l()) {
            this.a.s(this.a(this.a.dM(), 0.0F, 5.0F));
         }

         this.a.bl = this.a(this.a.bl, this.a.bj, this.b);
      }

      float $$0 = aym.g(this.a.bl - this.a.bj);
      if ($$0 < (float)(-this.h)) {
         this.a.bj -= 4.0F;
      } else if ($$0 > (float)this.h) {
         this.a.bj += 4.0F;
      }
   }
}
