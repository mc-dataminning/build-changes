import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ets(float b) implements etn {
   public static final MapCodec<ets> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ets::c)).apply($$0, ets::new));

   @Override
   public eto b() {
      return etp.f;
   }

   public boolean a(eqd $$0) {
      return $$0.b().i() < this.b;
   }

   public static etn.a a(float $$0) {
      return () -> new ets($$0);
   }

   public float c() {
      return this.b;
   }
}
