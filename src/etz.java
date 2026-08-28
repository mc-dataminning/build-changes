import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record etz(float b) implements etu {
   public static final MapCodec<etz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(etz::c)).apply($$0, etz::new));

   @Override
   public etv b() {
      return etw.f;
   }

   public boolean a(eqk $$0) {
      return $$0.b().i() < this.b;
   }

   public static etu.a a(float $$0) {
      return () -> new etz($$0);
   }

   public float c() {
      return this.b;
   }
}
