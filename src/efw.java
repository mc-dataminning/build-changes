import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record efw(float b) implements efr {
   public static final Codec<efw> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(efw::c)).apply($$0, efw::new));

   @Override
   public efs b() {
      return eft.e;
   }

   public boolean a(ecs $$0) {
      return $$0.b().i() < this.b;
   }

   public static efr.a a(float $$0) {
      return () -> new efw($$0);
   }

   public float c() {
      return this.b;
   }
}
