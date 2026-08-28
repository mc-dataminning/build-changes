import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cna(PrivateKey b, cnb c, Instant d) {
   public static final Codec<cna> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.g.fieldOf("private_key").forGetter(cna::b),
               cnb.c.fieldOf("public_key").forGetter(cna::c),
               ayh.o.fieldOf("refreshed_after").forGetter(cna::d)
            )
            .apply($$0, cna::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
