import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record erm(float b) implements erh {
   public static final Codec<erm> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(erm::c)).apply($$0, erm::new));

   @Override
   public eri b() {
      return erj.e;
   }

   public boolean a(eoa $$0) {
      return $$0.b().i() < this.b;
   }

   public static erh.a a(float $$0) {
      return () -> new erm($$0);
   }

   public float c() {
      return this.b;
   }
}
