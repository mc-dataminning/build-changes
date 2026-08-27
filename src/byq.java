public class byq extends byo {
   private final int h;
   private static final int i = 10;
   private static final int j = 20;

   public byq(bsq $$0, int $$1) {
      super($$0);
      this.h = $$1;
   }

   @Override
   public void a() {
      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0x -> this.a.bb = this.a(this.a.bb, $$0x + 20.0F, this.b));
         this.h().ifPresent($$0x -> this.a.s(this.a(this.a.dH(), $$0x + 10.0F, this.c)));
      } else {
         if (this.a.K().l()) {
            this.a.s(this.a(this.a.dH(), 0.0F, 5.0F));
         }

         this.a.bb = this.a(this.a.bb, this.a.aZ, this.b);
      }

      float $$0 = ayd.g(this.a.bb - this.a.aZ);
      if ($$0 < (float)(-this.h)) {
         this.a.aZ -= 4.0F;
      } else if ($$0 > (float)this.h) {
         this.a.aZ += 4.0F;
      }
   }
}
