import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record chj(PrivateKey b, chk c, Instant d) {
   public static final Codec<chj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               avf.g.fieldOf("private_key").forGetter(chj::b),
               chk.c.fieldOf("public_key").forGetter(chj::c),
               avp.m.fieldOf("refreshed_after").forGetter(chj::d)
            )
            .apply($$0, chj::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
