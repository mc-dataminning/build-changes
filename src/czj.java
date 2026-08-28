import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record czj(Optional<jq> c, boolean d) {
   public static final Codec<czj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jq.b.optionalFieldOf("target").forGetter(czj::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(czj::b)).apply($$0, czj::new)
   );
   public static final ym<ByteBuf, czj> b = ym.a(jq.c.a(yk::a), czj::a, yk.b, czj::b, czj::new);

   public czj a(arc $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ai()) {
            return this;
         } else {
            ji $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cgo.s, $$1) ? this : new czj(Optional.empty(), true);
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
