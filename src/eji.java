import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eji(float b) implements ejd {
   public static final Codec<eji> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eji::c)).apply($$0, eji::new));

   @Override
   public eje b() {
      return ejf.e;
   }

   public boolean a(ege $$0) {
      return $$0.b().i() < this.b;
   }

   public static ejd.a a(float $$0) {
      return () -> new eji($$0);
   }

   public float c() {
      return this.b;
   }
}
