public class ccz extends ccx {
   private final int h;
   private static final int i = 10;
   private static final int j = 20;

   public ccz(bxb $$0, int $$1) {
      super($$0);
      this.h = $$1;
   }

   @Override
   public void a() {
      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0x -> this.a.aX = this.a(this.a.aX, $$0x + 20.0F, this.b));
         this.h().ifPresent($$0x -> this.a.x(this.a(this.a.dN(), $$0x + 10.0F, this.c)));
      } else {
         if (this.a.O().k()) {
            this.a.x(this.a(this.a.dN(), 0.0F, 5.0F));
         }

         this.a.aX = this.a(this.a.aX, this.a.aV, this.b);
      }

      float $$0 = azk.h(this.a.aX - this.a.aV);
      if ($$0 < (float)(-this.h)) {
         this.a.aV -= 4.0F;
      } else if ($$0 > (float)this.h) {
         this.a.aV += 4.0F;
      }
   }
}
