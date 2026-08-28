import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record czz(Optional<jq> c, boolean d) {
   public static final Codec<czz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jq.b.optionalFieldOf("target").forGetter(czz::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(czz::b)).apply($$0, czz::new)
   );
   public static final yn<ByteBuf, czz> b = yn.a(jq.c.a(yl::a), czz::a, yl.b, czz::b, czz::new);

   public czz a(ard $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.aj()) {
            return this;
         } else {
            ji $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(chg.s, $$1) ? this : new czz(Optional.empty(), true);
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
