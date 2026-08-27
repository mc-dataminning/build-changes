import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cwo(Optional<iw> c, boolean d) {
   public static final Codec<cwo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.b.optionalFieldOf("target").forGetter(cwo::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cwo::b)).apply($$0, cwo::new)
   );
   public static final yv<ByteBuf, cwo> b = yv.a(iw.c.a(yt::a), cwo::a, yt.b, cwo::b, cwo::new);

   public cwo a(aqn $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ae()) {
            return this;
         } else {
            io $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cdy.s, $$1) ? this : new cwo(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<iw> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
