import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record clj(PrivateKey b, clk c, Instant d) {
   public static final Codec<clj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               awx.g.fieldOf("private_key").forGetter(clj::b),
               clk.c.fieldOf("public_key").forGetter(clj::c),
               axh.m.fieldOf("refreshed_after").forGetter(clj::d)
            )
            .apply($$0, clj::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
