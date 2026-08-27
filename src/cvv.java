import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cvv(Optional<iv> c, boolean d) {
   public static final Codec<cvv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a(iv.b, "target").forGetter(cvv::a), axh.a(Codec.BOOL, "tracked", true).forGetter(cvv::b)).apply($$0, cvv::new)
   );
   public static final ys<ByteBuf, cvv> b = ys.a(iv.c.a(yq::a), cvv::a, yq.b, cvv::b, cvv::new);

   public cvv a(aqh $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ae()) {
            return this;
         } else {
            in $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cdh.s, $$1) ? this : new cvv(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<iv> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
