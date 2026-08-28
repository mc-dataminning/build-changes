import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record etv(float b) implements etq {
   public static final MapCodec<etv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(etv::c)).apply($$0, etv::new));

   @Override
   public etr b() {
      return ets.f;
   }

   public boolean a(eqg $$0) {
      return $$0.b().i() < this.b;
   }

   public static etq.a a(float $$0) {
      return () -> new etv($$0);
   }

   public float c() {
      return this.b;
   }
}
