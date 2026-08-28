import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cwz(Optional<ji> c, boolean d) {
   public static final Codec<cwz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ji.b.optionalFieldOf("target").forGetter(cwz::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cwz::b)).apply($$0, cwz::new)
   );
   public static final ys<ByteBuf, cwz> b = ys.a(ji.c.a(yq::a), cwz::a, yq.b, cwz::b, cwz::new);

   public cwz a(aqm $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            ja $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cej.s, $$1) ? this : new cwz(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<ji> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
