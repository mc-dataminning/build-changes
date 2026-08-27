import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eva(float b) implements euu {
   public static final Codec<eva> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eva::c)).apply($$0, eva::new));

   @Override
   public euv b() {
      return euw.f;
   }

   public boolean a(erp $$0) {
      return $$0.b().i() < this.b;
   }

   public static euu.a a(float $$0) {
      return () -> new eva($$0);
   }

   public float c() {
      return this.b;
   }
}
