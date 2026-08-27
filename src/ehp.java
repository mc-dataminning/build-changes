import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehp(float b) implements ehk {
   public static final Codec<ehp> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(ehp::c)).apply($$0, ehp::new));

   @Override
   public ehl b() {
      return ehm.e;
   }

   public boolean a(eel $$0) {
      return $$0.b().i() < this.b;
   }

   public static ehk.a a(float $$0) {
      return () -> new ehp($$0);
   }

   public float c() {
      return this.b;
   }
}
