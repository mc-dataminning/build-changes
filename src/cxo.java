import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cxo(Optional<iz> c, boolean d) {
   public static final Codec<cxo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.a(iz.b, "target").forGetter(cxo::a), axu.a(Codec.BOOL, "tracked", true).forGetter(cxo::b)).apply($$0, cxo::new)
   );
   public static final zc<ByteBuf, cxo> b = zc.a(iz.c.a(za::a), cxo::a, za.b, cxo::b, cxo::new);

   public cxo a(aqt $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            ir $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cdv.s, $$1) ? this : new cxo(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<iz> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
