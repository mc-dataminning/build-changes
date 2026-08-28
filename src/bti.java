public class bti {
   private float a;
   private float b;
   private float c;
   private float d;
   private float e;
   private float f;
   private final buf g;

   public bti(buf $$0) {
      this.g = $$0;
   }

   public void a() {
      this.d = this.a;
      this.e = this.b;
      this.f = this.c;
      if (this.g.a(btr.e).a(cvo.nU)) {
         float $$0 = (float) (Math.PI / 12);
         float $$1 = (float) (-Math.PI / 12);
         float $$2 = 0.0F;
         if (this.g.fE()) {
            float $$3 = 1.0F;
            eye $$4 = this.g.dv();
            if ($$4.e < 0.0) {
               eye $$5 = $$4.d();
               $$3 = 1.0F - (float)Math.pow(-$$5.e, 1.5);
            }

            $$0 = $$3 * (float) (Math.PI / 9) + (1.0F - $$3) * $$0;
            $$1 = $$3 * (float) (-Math.PI / 2) + (1.0F - $$3) * $$1;
         } else if (this.g.cf()) {
            $$0 = (float) (Math.PI * 2.0 / 9.0);
            $$1 = (float) (-Math.PI / 4);
            $$2 = 0.08726646F;
         }

         this.a = this.a + ($$0 - this.a) * 0.3F;
         this.b = this.b + ($$2 - this.b) * 0.3F;
         this.c = this.c + ($$1 - this.c) * 0.3F;
      } else {
         this.a = 0.0F;
         this.b = 0.0F;
         this.c = 0.0F;
      }
   }

   public float a(float $$0) {
      return azc.h($$0, this.d, this.a);
   }

   public float b(float $$0) {
      return azc.h($$0, this.e, this.b);
   }

   public float c(float $$0) {
      return azc.h($$0, this.f, this.c);
   }
}
