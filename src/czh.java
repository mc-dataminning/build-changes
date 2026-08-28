import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record czh(Optional<jq> c, boolean d) {
   public static final Codec<czh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jq.b.optionalFieldOf("target").forGetter(czh::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(czh::b)).apply($$0, czh::new)
   );
   public static final ym<ByteBuf, czh> b = ym.a(jq.c.a(yk::a), czh::a, yk.b, czh::b, czh::new);

   public czh a(arc $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ai()) {
            return this;
         } else {
            ji $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cgn.s, $$1) ? this : new czh(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jq> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
