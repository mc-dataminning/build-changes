import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ase(coy b) {
   private static final Codec<ase> c = RecordCodecBuilder.create($$0 -> $$0.group(cpa.e.fieldOf("enabled").forGetter(ase::a)).apply($$0, ase::new));
   public static final asw<ase> a = asw.a("features", c);

   public coy a() {
      return this.b;
   }
}
