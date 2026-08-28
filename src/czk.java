import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record czk(Optional<jq> c, boolean d) {
   public static final Codec<czk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jq.b.optionalFieldOf("target").forGetter(czk::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(czk::b)).apply($$0, czk::new)
   );
   public static final yn<ByteBuf, czk> b = yn.a(jq.c.a(yl::a), czk::a, yl.b, czk::b, czk::new);

   public czk a(ard $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ai()) {
            return this;
         } else {
            ji $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cgq.s, $$1) ? this : new czk(Optional.empty(), true);
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
