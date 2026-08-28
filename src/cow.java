import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cow(PrivateKey b, cox c, Instant d) {
   public static final Codec<cow> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayk.g.fieldOf("private_key").forGetter(cow::b),
               cox.c.fieldOf("public_key").forGetter(cow::c),
               ayv.q.fieldOf("refreshed_after").forGetter(cow::d)
            )
            .apply($$0, cow::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
