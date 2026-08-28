import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cwx(Optional<ji> c, boolean d) {
   public static final Codec<cwx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ji.b.optionalFieldOf("target").forGetter(cwx::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cwx::b)).apply($$0, cwx::new)
   );
   public static final ys<ByteBuf, cwx> b = ys.a(ji.c.a(yq::a), cwx::a, yq.b, cwx::b, cwx::new);

   public cwx a(aqk $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            ja $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(ceg.s, $$1) ? this : new cwx(Optional.empty(), true);
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
