import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ama(cdx b) {
   private static final Codec<ama> c = RecordCodecBuilder.create($$0 -> $$0.group(cdz.e.fieldOf("enabled").forGetter(ama::a)).apply($$0, ama::new));
   public static final amq<ama> a = amq.a("features", c);

   public cdx a() {
      return this.b;
   }
}
