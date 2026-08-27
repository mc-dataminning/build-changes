public class bys extends byq {
   private final int h;
   private static final int i = 10;
   private static final int j = 20;

   public bys(bss $$0, int $$1) {
      super($$0);
      this.h = $$1;
   }

   @Override
   public void a() {
      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0x -> this.a.ba = this.a(this.a.ba, $$0x + 20.0F, this.b));
         this.h().ifPresent($$0x -> this.a.s(this.a(this.a.dH(), $$0x + 10.0F, this.c)));
      } else {
         if (this.a.K().l()) {
            this.a.s(this.a(this.a.dH(), 0.0F, 5.0F));
         }

         this.a.ba = this.a(this.a.ba, this.a.aY, this.b);
      }

      float $$0 = ayf.g(this.a.ba - this.a.aY);
      if ($$0 < (float)(-this.h)) {
         this.a.aY -= 4.0F;
      } else if ($$0 > (float)this.h) {
         this.a.aY += 4.0F;
      }
   }
}
