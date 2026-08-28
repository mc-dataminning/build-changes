import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ath(cra b) {
   private static final Codec<ath> c = RecordCodecBuilder.create($$0 -> $$0.group(crc.g.fieldOf("enabled").forGetter(ath::a)).apply($$0, ath::new));
   public static final atz<ath> a = atz.a("features", c);

   public cra a() {
      return this.b;
   }
}
