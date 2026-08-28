import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cpu(PrivateKey b, cpv c, Instant d) {
   public static final Codec<cpu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               azc.g.fieldOf("private_key").forGetter(cpu::b),
               cpv.c.fieldOf("public_key").forGetter(cpu::c),
               azn.q.fieldOf("refreshed_after").forGetter(cpu::d)
            )
            .apply($$0, cpu::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
