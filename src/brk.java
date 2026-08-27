public class brk extends bri {
   private final int h;
   private static final int i = 10;
   private static final int j = 20;

   public brk(bln $$0, int $$1) {
      super($$0);
      this.h = $$1;
   }

   @Override
   public void a() {
      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0x -> this.a.aW = this.a(this.a.aW, $$0x + 20.0F, this.b));
         this.h().ifPresent($$0x -> this.a.s(this.a(this.a.dF(), $$0x + 10.0F, this.c)));
      } else {
         if (this.a.N().l()) {
            this.a.s(this.a(this.a.dF(), 0.0F, 5.0F));
         }

         this.a.aW = this.a(this.a.aW, this.a.aU, this.b);
      }

      float $$0 = atq.g(this.a.aW - this.a.aU);
      if ($$0 < (float)(-this.h)) {
         this.a.aU -= 4.0F;
      } else if ($$0 > (float)this.h) {
         this.a.aU += 4.0F;
      }
   }
}
