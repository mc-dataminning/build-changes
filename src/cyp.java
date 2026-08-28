import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cyp(Optional<jo> c, boolean d) {
   public static final Codec<cyp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jo.b.optionalFieldOf("target").forGetter(cyp::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cyp::b)).apply($$0, cyp::new)
   );
   public static final zf<ByteBuf, cyp> b = zf.a(jo.c.a(zd::a), cyp::a, zd.b, cyp::b, cyp::new);

   public cyp a(arm $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ag()) {
            return this;
         } else {
            jg $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cgd.s, $$1) ? this : new cyp(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jo> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
