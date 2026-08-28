import com.mojang.serialization.Codec;
import java.util.List;

public class fgb {
   public static final fgb a = new fgb(0.0F, 0.0F);
   public static final fgb b = new fgb(1.0F, 1.0F);
   public static final fgb c = new fgb(1.0F, 0.0F);
   public static final fgb d = new fgb(-1.0F, 0.0F);
   public static final fgb e = new fgb(0.0F, 1.0F);
   public static final fgb f = new fgb(0.0F, -1.0F);
   public static final fgb g = new fgb(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final fgb h = new fgb(Float.MIN_VALUE, Float.MIN_VALUE);
   public static final Codec<fgb> i = Codec.FLOAT
      .listOf()
      .comapFlatMap($$0 -> ag.a($$0, 2).map($$0x -> new fgb((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.j, $$0.k));
   public final float j;
   public final float k;

   public fgb(float $$0, float $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public fgb a(float $$0) {
      return new fgb(this.j * $$0, this.k * $$0);
   }

   public float a(fgb $$0) {
      return this.j * $$0.j + this.k * $$0.k;
   }

   public fgb b(fgb $$0) {
      return new fgb(this.j + $$0.j, this.k + $$0.k);
   }

   public fgb b(float $$0) {
      return new fgb(this.j + $$0, this.k + $$0);
   }

   public boolean c(fgb $$0) {
      return this.j == $$0.j && this.k == $$0.k;
   }

   public fgb a() {
      float $$0 = azz.c(this.j * this.j + this.k * this.k);
      return $$0 < 1.0E-4F ? a : new fgb(this.j / $$0, this.k / $$0);
   }

   public float b() {
      return azz.c(this.j * this.j + this.k * this.k);
   }

   public float c() {
      return this.j * this.j + this.k * this.k;
   }

   public float d(fgb $$0) {
      float $$1 = $$0.j - this.j;
      float $$2 = $$0.k - this.k;
      return $$1 * $$1 + $$2 * $$2;
   }

   public fgb d() {
      return new fgb(-this.j, -this.k);
   }
}
