import com.mojang.serialization.Codec;
import java.util.List;

public class ffb {
   public static final ffb a = new ffb(0.0F, 0.0F);
   public static final ffb b = new ffb(1.0F, 1.0F);
   public static final ffb c = new ffb(1.0F, 0.0F);
   public static final ffb d = new ffb(-1.0F, 0.0F);
   public static final ffb e = new ffb(0.0F, 1.0F);
   public static final ffb f = new ffb(0.0F, -1.0F);
   public static final ffb g = new ffb(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final ffb h = new ffb(Float.MIN_VALUE, Float.MIN_VALUE);
   public static final Codec<ffb> i = Codec.FLOAT
      .listOf()
      .comapFlatMap($$0 -> ag.a($$0, 2).map($$0x -> new ffb((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.j, $$0.k));
   public final float j;
   public final float k;

   public ffb(float $$0, float $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public ffb a(float $$0) {
      return new ffb(this.j * $$0, this.k * $$0);
   }

   public float a(ffb $$0) {
      return this.j * $$0.j + this.k * $$0.k;
   }

   public ffb b(ffb $$0) {
      return new ffb(this.j + $$0.j, this.k + $$0.k);
   }

   public ffb b(float $$0) {
      return new ffb(this.j + $$0, this.k + $$0);
   }

   public boolean c(ffb $$0) {
      return this.j == $$0.j && this.k == $$0.k;
   }

   public ffb a() {
      float $$0 = azm.c(this.j * this.j + this.k * this.k);
      return $$0 < 1.0E-4F ? a : new ffb(this.j / $$0, this.k / $$0);
   }

   public float b() {
      return azm.c(this.j * this.j + this.k * this.k);
   }

   public float c() {
      return this.j * this.j + this.k * this.k;
   }

   public float d(ffb $$0) {
      float $$1 = $$0.j - this.j;
      float $$2 = $$0.k - this.k;
      return $$1 * $$1 + $$2 * $$2;
   }

   public ffb d() {
      return new ffb(-this.j, -this.k);
   }
}
