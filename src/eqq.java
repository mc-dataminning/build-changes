import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eqq(float b) implements eql {
   public static final Codec<eqq> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eqq::c)).apply($$0, eqq::new));

   @Override
   public eqm b() {
      return eqn.e;
   }

   public boolean a(enk $$0) {
      return $$0.b().i() < this.b;
   }

   public static eql.a a(float $$0) {
      return () -> new eqq($$0);
   }

   public float c() {
      return this.b;
   }
}
