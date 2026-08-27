import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record erv(float b) implements erq {
   public static final Codec<erv> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(erv::c)).apply($$0, erv::new));

   @Override
   public err b() {
      return ers.f;
   }

   public boolean a(eol $$0) {
      return $$0.b().i() < this.b;
   }

   public static erq.a a(float $$0) {
      return () -> new erv($$0);
   }

   public float c() {
      return this.b;
   }
}
