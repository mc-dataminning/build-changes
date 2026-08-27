import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record enc(float b) implements emx {
   public static final Codec<enc> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(enc::c)).apply($$0, enc::new));

   @Override
   public emy b() {
      return emz.e;
   }

   public boolean a(ejy $$0) {
      return $$0.b().i() < this.b;
   }

   public static emx.a a(float $$0) {
      return () -> new enc($$0);
   }

   public float c() {
      return this.b;
   }
}
