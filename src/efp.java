import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efp(float b) implements efk {
   public static final Codec<efp> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efp::c)).apply($$0, efp::new));

   @Override
   public efl b() {
      return efm.e;
   }

   public boolean a(ecl $$0) {
      return $$0.b().i() < this.b;
   }

   public static efk.a a(float $$0) {
      return () -> new efp($$0);
   }

   public float c() {
      return this.b;
   }
}
