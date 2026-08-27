import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eig(float b) implements eib {
   public static final Codec<eig> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eig::c)).apply($$0, eig::new));

   @Override
   public eic b() {
      return eid.e;
   }

   public boolean a(efc $$0) {
      return $$0.b().i() < this.b;
   }

   public static eib.a a(float $$0) {
      return () -> new eig($$0);
   }

   public float c() {
      return this.b;
   }
}
