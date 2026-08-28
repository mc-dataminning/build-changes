import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cxa(Optional<ji> c, boolean d) {
   public static final Codec<cxa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ji.b.optionalFieldOf("target").forGetter(cxa::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cxa::b)).apply($$0, cxa::new)
   );
   public static final ys<ByteBuf, cxa> b = ys.a(ji.c.a(yq::a), cxa::a, yq.b, cxa::b, cxa::new);

   public cxa a(aqm $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            ja $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cek.s, $$1) ? this : new cxa(Optional.empty(), true);
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
