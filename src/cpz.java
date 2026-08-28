import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cpz(PrivateKey b, cqa c, Instant d) {
   public static final Codec<cpz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azc.g.fieldOf("private_key").forGetter(cpz::b),
               cqa.c.fieldOf("public_key").forGetter(cpz::c),
               azn.q.fieldOf("refreshed_after").forGetter(cpz::d)
            )
            .apply($$0, cpz::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
