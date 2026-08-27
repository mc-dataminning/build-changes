import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ekj(float b) implements eke {
   public static final Codec<ekj> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ekj::c)).apply($$0, ekj::new));

   @Override
   public ekf b() {
      return ekg.e;
   }

   public boolean a(ehf $$0) {
      return $$0.b().i() < this.b;
   }

   public static eke.a a(float $$0) {
      return () -> new ekj($$0);
   }

   public float c() {
      return this.b;
   }
}
