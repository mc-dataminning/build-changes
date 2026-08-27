import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cuz(Optional<iu> c, boolean d) {
   public static final Codec<cuz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.a(iu.b, "target").forGetter(cuz::a), axe.a(Codec.BOOL, "tracked", true).forGetter(cuz::b)).apply($$0, cuz::new)
   );
   public static final yq<ByteBuf, cuz> b = yq.a(iu.c.a(yo::a), cuz::a, yo.b, cuz::b, cuz::new);

   public cuz a(aqe $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ae()) {
            return this;
         } else {
            im $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(ccl.s, $$1) ? this : new cuz(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<iu> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
