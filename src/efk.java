import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efk(float b) implements eff {
   public static final Codec<efk> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efk::c)).apply($$0, efk::new));

   @Override
   public efg b() {
      return efh.e;
   }

   public boolean a(ecg $$0) {
      return $$0.b().i() < this.b;
   }

   public static eff.a a(float $$0) {
      return () -> new efk($$0);
   }

   public float c() {
      return this.b;
   }
}
