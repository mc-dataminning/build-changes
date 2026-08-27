import javax.annotation.concurrent.Immutable;

@Immutable
public class bpy {
   private static final float a = -72000.0F;
   private static final float b = 1440000.0F;
   private static final float c = 3600000.0F;
   private final bpx d;
   private final float e;

   public bpy(bpx $$0, long $$1, long $$2, float $$3) {
      this.d = $$0;
      this.e = this.a($$0, $$1, $$2, $$3);
   }

   public bpx a() {
      return this.d;
   }

   public float b() {
      return this.e;
   }

   public boolean c() {
      return this.e >= (float)bpx.d.ordinal();
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

   private float a(bpx $$0, long $$1, long $$2, float $$3) {
      if ($$0 == bpx.a) {
         return 0.0F;
      } else {
         boolean $$4 = $$0 == bpx.d;
         float $$5 = 0.75F;
         float $$6 = aym.a(((float)$$1 + -72000.0F) / 1440000.0F, 0.0F, 1.0F) * 0.25F;
         $$5 += $$6;
         float $$7 = 0.0F;
         $$7 += aym.a((float)$$2 / 3600000.0F, 0.0F, 1.0F) * ($$4 ? 1.0F : 0.75F);
         $$7 += aym.a($$3 * 0.25F, 0.0F, $$6);
         if ($$0 == bpx.b) {
            $$7 *= 0.5F;
         }

         $$5 += $$7;
         return (float)$$0.a() * $$5;
      }
   }
}
