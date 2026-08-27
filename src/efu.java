import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efu(float b) implements efp {
   public static final Codec<efu> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efu::c)).apply($$0, efu::new));

   @Override
   public efq b() {
      return efr.e;
   }

   public boolean a(ecq $$0) {
      return $$0.b().i() < this.b;
   }

   public static efp.a a(float $$0) {
      return () -> new efu($$0);
   }

   public float c() {
      return this.b;
   }
}
