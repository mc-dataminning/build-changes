import com.mojang.serialization.Codec;
import java.util.List;

public class few {
   public static final few a = new few(0.0F, 0.0F);
   public static final few b = new few(1.0F, 1.0F);
   public static final few c = new few(1.0F, 0.0F);
   public static final few d = new few(-1.0F, 0.0F);
   public static final few e = new few(0.0F, 1.0F);
   public static final few f = new few(0.0F, -1.0F);
   public static final few g = new few(Float.MAX_VALUE, Float.MAX_VALUE);
   public static final few h = new few(Float.MIN_VALUE, Float.MIN_VALUE);
   public static final Codec<few> i = Codec.FLOAT
      .listOf()
      .comapFlatMap($$0 -> ag.a($$0, 2).map($$0x -> new few((Float)$$0x.get(0), (Float)$$0x.get(1))), $$0 -> List.of($$0.j, $$0.k));
   public final float j;
   public final float k;

   public few(float $$0, float $$1) {
      this.j = $$0;
      this.k = $$1;
   }

   public few a(float $$0) {
      return new few(this.j * $$0, this.k * $$0);
   }

   public float a(few $$0) {
      return this.j * $$0.j + this.k * $$0.k;
   }

   public few b(few $$0) {
      return new few(this.j + $$0.j, this.k + $$0.k);
   }

   public few b(float $$0) {
      return new few(this.j + $$0, this.k + $$0);
   }

   public boolean c(few $$0) {
      return this.j == $$0.j && this.k == $$0.k;
   }

   public few a() {
      float $$0 = azm.c(this.j * this.j + this.k * this.k);
      return $$0 < 1.0E-4F ? a : new few(this.j / $$0, this.k / $$0);
   }

   public float b() {
      return azm.c(this.j * this.j + this.k * this.k);
   }

   public float c() {
      return this.j * this.j + this.k * this.k;
   }

   public float d(few $$0) {
      float $$1 = $$0.j - this.j;
      float $$2 = $$0.k - this.k;
      return $$1 * $$1 + $$2 * $$2;
   }

   public few d() {
      return new few(-this.j, -this.k);
   }
}
