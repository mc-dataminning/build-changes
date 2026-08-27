import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eoa(float b) implements env {
   public static final Codec<eoa> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eoa::c)).apply($$0, eoa::new));

   @Override
   public enw b() {
      return enx.e;
   }

   public boolean a(ekw $$0) {
      return $$0.b().i() < this.b;
   }

   public static env.a a(float $$0) {
      return () -> new eoa($$0);
   }

   public float c() {
      return this.b;
   }
}
