import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efo(float b) implements efj {
   public static final Codec<efo> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efo::c)).apply($$0, efo::new));

   @Override
   public efk b() {
      return efl.e;
   }

   public boolean a(eck $$0) {
      return $$0.b().i() < this.b;
   }

   public static efj.a a(float $$0) {
      return () -> new efo($$0);
   }

   public float c() {
      return this.b;
   }
}
