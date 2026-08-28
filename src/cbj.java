public class cbj extends cbh {
   private final int h;
   private static final int i = 10;
   private static final int j = 20;

   public cbj(bvj $$0, int $$1) {
      super($$0);
      this.h = $$1;
   }

   @Override
   public void a() {
      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0x -> this.a.aY = this.a(this.a.aY, $$0x + 20.0F, this.b));
         this.h().ifPresent($$0x -> this.a.w(this.a(this.a.dN(), $$0x + 10.0F, this.c)));
      } else {
         if (this.a.L().m()) {
            this.a.w(this.a(this.a.dN(), 0.0F, 5.0F));
         }

         this.a.aY = this.a(this.a.aY, this.a.aW, this.b);
      }

      float $$0 = azm.h(this.a.aY - this.a.aW);
      if ($$0 < (float)(-this.h)) {
         this.a.aW -= 4.0F;
      } else if ($$0 > (float)this.h) {
         this.a.aW += 4.0F;
      }
   }
}
