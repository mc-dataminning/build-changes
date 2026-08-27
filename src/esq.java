import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record esq(float b) implements esl {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(esq::c)).apply($$0, esq::new));

   @Override
   public esm b() {
      return esn.f;
   }

   public boolean a(epf $$0) {
      return $$0.b().i() < this.b;
   }

   public static esl.a a(float $$0) {
      return () -> new esq($$0);
   }

   public float c() {
      return this.b;
   }
}
