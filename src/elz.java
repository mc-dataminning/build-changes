import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elz(float b) implements elu {
   public static final Codec<elz> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(elz::c)).apply($$0, elz::new));

   @Override
   public elv b() {
      return elw.e;
   }

   public boolean a(eiv $$0) {
      return $$0.b().i() < this.b;
   }

   public static elu.a a(float $$0) {
      return () -> new elz($$0);
   }

   public float c() {
      return this.b;
   }
}
