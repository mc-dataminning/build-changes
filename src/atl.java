import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record atl(crj b) {
   private static final Codec<atl> c = RecordCodecBuilder.create($$0 -> $$0.group(crl.g.fieldOf("enabled").forGetter(atl::a)).apply($$0, atl::new));
   public static final aud<atl> a = aud.a("features", c);

   public crj a() {
      return this.b;
   }
}
