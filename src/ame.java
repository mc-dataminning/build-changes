import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ame(cec b) {
   private static final Codec<ame> c = RecordCodecBuilder.create($$0 -> $$0.group(cee.e.fieldOf("enabled").forGetter(ame::a)).apply($$0, ame::new));
   public static final amu<ame> a = amu.a("features", c);

   public cec a() {
      return this.b;
   }
}
