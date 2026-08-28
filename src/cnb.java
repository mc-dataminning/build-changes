import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cnb(PrivateKey b, cnc c, Instant d) {
   public static final Codec<cnb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               axw.g.fieldOf("private_key").forGetter(cnb::b),
               cnc.c.fieldOf("public_key").forGetter(cnb::c),
               ayh.o.fieldOf("refreshed_after").forGetter(cnb::d)
            )
            .apply($$0, cnb::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
