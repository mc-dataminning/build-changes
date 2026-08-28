import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cyv(Optional<jp> c, boolean d) {
   public static final Codec<cyv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jp.b.optionalFieldOf("target").forGetter(cyv::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cyv::b)).apply($$0, cyv::new)
   );
   public static final zg<ByteBuf, cyv> b = zg.a(jp.c.a(ze::a), cyv::a, ze.b, cyv::b, cyv::new);

   public cyv a(arn $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ag()) {
            return this;
         } else {
            jh $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cgi.s, $$1) ? this : new cyv(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jp> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
