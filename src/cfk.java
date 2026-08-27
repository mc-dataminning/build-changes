import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cfk(PrivateKey b, cfl c, Instant d) {
   public static final Codec<cfk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atm.g.fieldOf("private_key").forGetter(cfk::b),
               cfl.c.fieldOf("public_key").forGetter(cfk::c),
               atw.m.fieldOf("refreshed_after").forGetter(cfk::d)
            )
            .apply($$0, cfk::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
