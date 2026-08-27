import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cul(Optional<im> c, boolean d) {
   public static final Codec<cul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.a(im.b, "target").forGetter(cul::a), awu.a(Codec.BOOL, "tracked", true).forGetter(cul::b)).apply($$0, cul::new)
   );
   public static final yg<ByteBuf, cul> b = yg.a(im.c.a(ye::a), cul::a, ye.b, cul::b, cul::new);

   public cul a(apu $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ae()) {
            return this;
         } else {
            id $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cca.s, $$1) ? this : new cul(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<im> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
