import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cyj(Optional<jm> c, boolean d) {
   public static final Codec<cyj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jm.b.optionalFieldOf("target").forGetter(cyj::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cyj::b)).apply($$0, cyj::new)
   );
   public static final zb<ByteBuf, cyj> b = zb.a(jm.c.a(yz::a), cyj::a, yz.b, cyj::b, cyj::new);

   public cyj a(arg $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ag()) {
            return this;
         } else {
            je $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cfm.s, $$1) ? this : new cyj(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jm> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
