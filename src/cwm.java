import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cwm(Optional<iw> c, boolean d) {
   public static final Codec<cwm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(iw.b.optionalFieldOf("target").forGetter(cwm::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cwm::b)).apply($$0, cwm::new)
   );
   public static final yv<ByteBuf, cwm> b = yv.a(iw.c.a(yt::a), cwm::a, yt.b, cwm::b, cwm::new);

   public cwm a(aqm $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ae()) {
            return this;
         } else {
            io $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cdw.s, $$1) ? this : new cwm(Optional.empty(), true);
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
