import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ety(float b) implements ett {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ety::c)).apply($$0, ety::new));

   @Override
   public etu b() {
      return etv.f;
   }

   public boolean a(eqj $$0) {
      return $$0.b().i() < this.b;
   }

   public static ett.a a(float $$0) {
      return () -> new ety($$0);
   }

   public float c() {
      return this.b;
   }
}
