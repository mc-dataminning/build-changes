import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cxl(Optional<jh> c, boolean d) {
   public static final Codec<cxl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jh.b.optionalFieldOf("target").forGetter(cxl::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cxl::b)).apply($$0, cxl::new)
   );
   public static final zm<ByteBuf, cxl> b = zm.a(jh.c.a(zk::a), cxl::a, zk.b, cxl::b, cxl::new);

   public cxl a(are $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            iz $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cev.s, $$1) ? this : new cxl(Optional.empty(), true);
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
