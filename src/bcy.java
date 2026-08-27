import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class bcy extends bda {
   public static final bcy a = new bcy(0.0F);
   public static final Codec<bcy> b = Codec.either(
         Codec.FLOAT, RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("value").forGetter($$0x -> $$0x.d)).apply($$0, bcy::new))
      )
      .xmap($$0 -> (bcy)$$0.map(bcy::a, $$0x -> $$0x), $$0 -> Either.left($$0.d));
   private final float d;

   public static bcy a(float $$0) {
      return $$0 == 0.0F ? a : new bcy($$0);
   }

   private bcy(float $$0) {
      this.d = $$0;
   }

   public float d() {
      return this.d;
   }

   @Override
   public float a(apf $$0) {
      return this.d;
   }

   @Override
   public float a() {
      return this.d;
   }

   @Override
   public float b() {
      return this.d + 1.0F;
   }

   @Override
   public bdb<?> c() {
      return bdb.a;
   }

   @Override
   public String toString() {
      return Float.toString(this.d);
   }
}
