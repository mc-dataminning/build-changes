import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efl(float b) implements efg {
   public static final Codec<efl> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efl::c)).apply($$0, efl::new));

   @Override
   public efh b() {
      return efi.e;
   }

   public boolean a(ech $$0) {
      return $$0.b().i() < this.b;
   }

   public static efg.a a(float $$0) {
      return () -> new efl($$0);
   }

   public float c() {
      return this.b;
   }
}
