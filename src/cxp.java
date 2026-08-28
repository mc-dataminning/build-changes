import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cxp(Optional<jh> c, boolean d) {
   public static final Codec<cxp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jh.b.optionalFieldOf("target").forGetter(cxp::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cxp::b)).apply($$0, cxp::new)
   );
   public static final zn<ByteBuf, cxp> b = zn.a(jh.c.a(zl::a), cxp::a, zl.b, cxp::b, cxp::new);

   public cxp a(arf $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            iz $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cez.s, $$1) ? this : new cxp(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jh> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
