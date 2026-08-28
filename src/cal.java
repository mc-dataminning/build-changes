public class cal extends caj {
   private final int h;
   private static final int i = 10;
   private static final int j = 20;

   public cal(bum $$0, int $$1) {
      super($$0);
      this.h = $$1;
   }

   @Override
   public void a() {
      if (this.d > 0) {
         this.d--;
         this.i().ifPresent($$0x -> this.a.aV = this.a(this.a.aV, $$0x + 20.0F, this.b));
         this.h().ifPresent($$0x -> this.a.w(this.a(this.a.dK(), $$0x + 10.0F, this.c)));
      } else {
         if (this.a.P().m()) {
            this.a.w(this.a(this.a.dK(), 0.0F, 5.0F));
         }

         this.a.aV = this.a(this.a.aV, this.a.aT, this.b);
      }

      float $$0 = azd.g(this.a.aV - this.a.aT);
      if ($$0 < (float)(-this.h)) {
         this.a.aT -= 4.0F;
      } else if ($$0 > (float)this.h) {
         this.a.aT += 4.0F;
      }
   }
}
