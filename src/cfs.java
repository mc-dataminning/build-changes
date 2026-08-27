import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cfs(PrivateKey b, cft c, Instant d) {
   public static final Codec<cfs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atn.g.fieldOf("private_key").forGetter(cfs::b),
               cft.c.fieldOf("public_key").forGetter(cfs::c),
               atx.m.fieldOf("refreshed_after").forGetter(cfs::d)
            )
            .apply($$0, cfs::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
