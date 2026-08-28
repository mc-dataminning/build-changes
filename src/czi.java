import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record czi(Optional<jq> c, boolean d) {
   public static final Codec<czi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jq.b.optionalFieldOf("target").forGetter(czi::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(czi::b)).apply($$0, czi::new)
   );
   public static final yn<ByteBuf, czi> b = yn.a(jq.c.a(yl::a), czi::a, yl.b, czi::b, czi::new);

   public czi a(ard $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ai()) {
            return this;
         } else {
            ji $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cgo.s, $$1) ? this : new czi(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jq> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
