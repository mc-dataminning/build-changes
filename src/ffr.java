import com.mojang.serialization.Codec;
import java.util.List;

public class ffr {
   public static final ffr a = new ffr(0.0F, 0.0F);
   public static final ffr b = new ffr(1.0F, 1.0F);
   public static final ffr c = new ffr(1.0F, 0.0F);
   public static final ffr d = new ffr(-1.0F, 0.0F);
   public static final ffr e = new ffr(0.0F, 1.0F);
   public static final ffr f = new ffr(0.0F, -1.0F);
   public static final ffr g = new ffr(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ffr h = new ffr(Float.MIN_VALUE, Float.MIN_VALUE);
   public static final Codec<ffr> i = Codec.FLOAT
      .listOf()
      .comapFlatMap($$0 -> ag.a($$0, 2).map($$0x -> new ffr((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.j, $$0.k));
   public final float j;
   public final float k;

   public ffr(float $$0, float $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public ffr a(float $$0) {
      return new ffr(this.j * $$0, this.k * $$0);
   }

   public float a(ffr $$0) {
      return this.j * $$0.j + this.k * $$0.k;
   }

   public ffr b(ffr $$0) {
      return new ffr(this.j + $$0.j, this.k + $$0.k);
   }

   public ffr b(float $$0) {
      return new ffr(this.j + $$0, this.k + $$0);
   }

   public boolean c(ffr $$0) {
      return this.j == $$0.j && this.k == $$0.k;
   }

   public ffr a() {
      float $$0 = azq.c(this.j * this.j + this.k * this.k);
      return $$0 < 1.0E-4F ? a : new ffr(this.j / $$0, this.k / $$0);
   }

   public float b() {
      return azq.c(this.j * this.j + this.k * this.k);
   }

   public float c() {
      return this.j * this.j + this.k * this.k;
   }

   public float d(ffr $$0) {
      float $$1 = $$0.j - this.j;
      float $$2 = $$0.k - this.k;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ffr d() {
      return new ffr(-this.j, -this.k);
   }
}
