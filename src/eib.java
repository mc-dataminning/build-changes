import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eib(float b) implements ehw {
   public static final Codec<eib> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(eib::c)).apply($$0, eib::new));

   @Override
   public ehx b() {
      return ehy.e;
   }

   public boolean a(eex $$0) {
      return $$0.b().i() < this.b;
   }

   public static ehw.a a(float $$0) {
      return () -> new eib($$0);
   }

   public float c() {
      return this.b;
   }
}
