import com.mojang.serialization.Codec;
import java.util.List;

public class ffp {
   public static final ffp a = new ffp(0.0F, 0.0F);
   public static final ffp b = new ffp(1.0F, 1.0F);
   public static final ffp c = new ffp(1.0F, 0.0F);
   public static final ffp d = new ffp(-1.0F, 0.0F);
   public static final ffp e = new ffp(0.0F, 1.0F);
   public static final ffp f = new ffp(0.0F, -1.0F);
   public static final ffp g = new ffp(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ffp h = new ffp(Float.MIN_VALUE, Float.MIN_VALUE);
   public static final Codec<ffp> i = Codec.FLOAT
      .listOf()
      .comapFlatMap($$0 -> ag.a($$0, 2).map($$0x -> new ffp((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.j, $$0.k));
   public final float j;
   public final float k;

   public ffp(float $$0, float $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public ffp a(float $$0) {
      return new ffp(this.j * $$0, this.k * $$0);
   }

   public float a(ffp $$0) {
      return this.j * $$0.j + this.k * $$0.k;
   }

   public ffp b(ffp $$0) {
      return new ffp(this.j + $$0.j, this.k + $$0.k);
   }

   public ffp b(float $$0) {
      return new ffp(this.j + $$0, this.k + $$0);
   }

   public boolean c(ffp $$0) {
      return this.j == $$0.j && this.k == $$0.k;
   }

   public ffp a() {
      float $$0 = azo.c(this.j * this.j + this.k * this.k);
      return $$0 < 1.0E-4F ? a : new ffp(this.j / $$0, this.k / $$0);
   }

   public float b() {
      return azo.c(this.j * this.j + this.k * this.k);
   }

   public float c() {
      return this.j * this.j + this.k * this.k;
   }

   public float d(ffp $$0) {
      float $$1 = $$0.j - this.j;
      float $$2 = $$0.k - this.k;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ffp d() {
      return new ffp(-this.j, -this.k);
   }
}
