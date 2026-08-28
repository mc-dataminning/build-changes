import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cyn(Optional<jm> c, boolean d) {
   public static final Codec<cyn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jm.b.optionalFieldOf("target").forGetter(cyn::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cyn::b)).apply($$0, cyn::new)
   );
   public static final zb<ByteBuf, cyn> b = zb.a(jm.c.a(yz::a), cyn::a, yz.b, cyn::b, cyn::new);

   public cyn a(arh $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ag()) {
            return this;
         } else {
            je $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cfr.s, $$1) ? this : new cyn(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jm> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
