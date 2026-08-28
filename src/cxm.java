import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cxm(Optional<jh> c, boolean d) {
   public static final Codec<cxm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jh.b.optionalFieldOf("target").forGetter(cxm::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cxm::b)).apply($$0, cxm::new)
   );
   public static final zm<ByteBuf, cxm> b = zm.a(jh.c.a(zk::a), cxm::a, zk.b, cxm::b, cxm::new);

   public cxm a(are $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            iz $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cew.s, $$1) ? this : new cxm(Optional.empty(), true);
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
