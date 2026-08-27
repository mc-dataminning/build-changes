import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egm(float b) implements egh {
   public static final Codec<egm> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("chance").forGetter(egm::c)).apply($$0, egm::new));

   @Override
   public egi b() {
      return egj.e;
   }

   public boolean a(edi $$0) {
      return $$0.b().i() < this.b;
   }

   public static egh.a a(float $$0) {
      return () -> new egm($$0);
   }

   public float c() {
      return this.b;
   }
}
