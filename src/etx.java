import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record etx(float b) implements ets {
   public static final MapCodec<etx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(etx::c)).apply($$0, etx::new));

   @Override
   public ett b() {
      return etu.f;
   }

   public boolean a(eqi $$0) {
      return $$0.b().i() < this.b;
   }

   public static ets.a a(float $$0) {
      return () -> new etx($$0);
   }

   public float c() {
      return this.b;
   }
}
