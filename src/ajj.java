import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ajj(caw b) {
   private static final Codec<ajj> c = RecordCodecBuilder.create($$0 -> $$0.group(cay.d.fieldOf("enabled").forGetter(ajj::a)).apply($$0, ajj::new));
   public static final ajy<ajj> a = ajy.a("features", c);

   public caw a() {
      return this.b;
   }
}
