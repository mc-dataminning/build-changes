import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record aqm(cjw b) {
   private static final Codec<aqm> c = RecordCodecBuilder.create($$0 -> $$0.group(cjy.f.fieldOf("enabled").forGetter(aqm::a)).apply($$0, aqm::new));
   public static final arc<aqm> a = arc.a("features", c);

   public cjw a() {
      return this.b;
   }
}
