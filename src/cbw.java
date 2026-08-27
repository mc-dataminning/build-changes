import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cbw(PrivateKey b, cbx c, Instant d) {
   public static final Codec<cbw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqx.g.fieldOf("private_key").forGetter(cbw::b),
               cbx.c.fieldOf("public_key").forGetter(cbw::c),
               arg.m.fieldOf("refreshed_after").forGetter(cbw::d)
            )
            .apply($$0, cbw::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
