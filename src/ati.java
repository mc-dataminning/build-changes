import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ati(crf b) {
   private static final Codec<ati> c = RecordCodecBuilder.create($$0 -> $$0.group(crh.g.fieldOf("enabled").forGetter(ati::a)).apply($$0, ati::new));
   public static final aua<ati> a = aua.a("features", c);

   public crf a() {
      return this.b;
   }
}
