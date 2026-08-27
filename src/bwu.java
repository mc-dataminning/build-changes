public class bwu extends bws {
   private final int h;
   private static final int i = 10;
   private static final int j = 20;

   public bwu(bqv $$0, int $$1) {
      super($$0);
      this.h = $$1;
   }

   @Override
   public void a() {
      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0x -> this.a.aZ = this.a(this.a.aZ, $$0x + 20.0F, this.b));
         this.h().ifPresent($$0x -> this.a.s(this.a(this.a.dE(), $$0x + 10.0F, this.c)));
      } else {
         if (this.a.K().l()) {
            this.a.s(this.a(this.a.dE(), 0.0F, 5.0F));
         }

         this.a.aZ = this.a(this.a.aZ, this.a.aX, this.b);
      }

      float $$0 = axm.g(this.a.aZ - this.a.aX);
      if ($$0 < (float)(-this.h)) {
         this.a.aX -= 4.0F;
      } else if ($$0 > (float)this.h) {
         this.a.aX += 4.0F;
      }
   }
}
