import javax.annotation.concurrent.Immutable;

@Immutable
public class bls {
   private static final float a = -72000.0F;
   private static final float b = 1440000.0F;
   private static final float c = 3600000.0F;
   private final blr d;
   private final float e;

   public bls(blr $$0, long $$1, long $$2, float $$3) {
      this.d = $$0;
      this.e = this.a($$0, $$1, $$2, $$3);
   }

   public blr a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }

   public boolean c() {
      return this.e >= (float)blr.d.ordinal();
   }

   public boolean a(float $$0) {
      return this.e > $$0;
   }

   public float d() {
      if (this.e < 2.0F) {
         return 0.0F;
      } else {
         return this.e > 4.0F ? 1.0F : (this.e - 2.0F) / 2.0F;
      }
   }

   private float a(blr $$0, long $$1, long $$2, float $$3) {
      if ($$0 == blr.a) {
         return 0.0F;
      } else {
         boolean $$4 = $$0 == blr.d;
         float $$5 = 0.75F;
         float $$6 = awh.a(((float)$$1 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
         $$5 += $$6;
         float $$7 = 0.0F;
         $$7 += awh.a((float)$$2 / 3600000.0F, 0.0F, 1.0F) * ($$4 ? 1.0F : 0.75F);
         $$7 += awh.a($$3 * 0.25F, 0.0F, $$6);
         if ($$0 == blr.b) {
            $$7 *= 0.5F;
         }

         $$5 += $$7;
         return (float)$$0.a() * $$5;
      }
   }
}
