import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cxn(Optional<jh> c, boolean d) {
   public static final Codec<cxn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jh.b.optionalFieldOf("target").forGetter(cxn::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cxn::b)).apply($$0, cxn::new)
   );
   public static final zn<ByteBuf, cxn> b = zn.a(jh.c.a(zl::a), cxn::a, zl.b, cxn::b, cxn::new);

   public cxn a(arf $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            iz $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cex.s, $$1) ? this : new cxn(Optional.empty(), true);
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
