import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eqh(float b) implements eqc {
   public static final Codec<eqh> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eqh::c)).apply($$0, eqh::new));

   @Override
   public eqd b() {
      return eqe.e;
   }

   public boolean a(enb $$0) {
      return $$0.b().i() < this.b;
   }

   public static eqc.a a(float $$0) {
      return () -> new eqh($$0);
   }

   public float c() {
      return this.b;
   }
}
