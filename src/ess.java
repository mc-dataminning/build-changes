import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ess(float b) implements esn {
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ess::c)).apply($$0, ess::new));

   @Override
   public eso b() {
      return esp.f;
   }

   public boolean a(eph $$0) {
      return $$0.b().i() < this.b;
   }

   public static esn.a a(float $$0) {
      return () -> new ess($$0);
   }

   public float c() {
      return this.b;
   }
}
