import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ati(cte b) {
   private static final Codec<ati> c = RecordCodecBuilder.create($$0 -> $$0.group(ctg.f.fieldOf("enabled").forGetter(ati::a)).apply($$0, ati::new));
   public static final atz<ati> a = new atz<>("features", c);

   public cte a() {
      return this.b;
   }
}
