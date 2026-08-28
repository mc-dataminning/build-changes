import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record etw(float b) implements etr {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(etw::c)).apply($$0, etw::new));

   @Override
   public ets b() {
      return ett.f;
   }

   public boolean a(eqh $$0) {
      return $$0.b().i() < this.b;
   }

   public static etr.a a(float $$0) {
      return () -> new etw($$0);
   }

   public float c() {
      return this.b;
   }
}
