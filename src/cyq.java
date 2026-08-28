import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cyq(Optional<jn> c, boolean d) {
   public static final Codec<cyq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jn.b.optionalFieldOf("target").forGetter(cyq::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cyq::b)).apply($$0, cyq::new)
   );
   public static final zc<ByteBuf, cyq> b = zc.a(jn.c.a(za::a), cyq::a, za.b, cyq::b, cyq::new);

   public cyq a(arj $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ag()) {
            return this;
         } else {
            jf $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cfu.s, $$1) ? this : new cyq(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jn> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
