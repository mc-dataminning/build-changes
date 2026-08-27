import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cfj(PrivateKey b, cfk c, Instant d) {
   public static final Codec<cfj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atl.g.fieldOf("private_key").forGetter(cfj::b),
               cfk.c.fieldOf("public_key").forGetter(cfj::c),
               atv.m.fieldOf("refreshed_after").forGetter(cfj::d)
            )
            .apply($$0, cfj::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
