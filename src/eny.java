import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eny(float b) implements ent {
   public static final Codec<eny> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eny::c)).apply($$0, eny::new));

   @Override
   public enu b() {
      return env.e;
   }

   public boolean a(eku $$0) {
      return $$0.b().i() < this.b;
   }

   public static ent.a a(float $$0) {
      return () -> new eny($$0);
   }

   public float c() {
      return this.b;
   }
}
