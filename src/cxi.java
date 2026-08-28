import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cxi(Optional<jh> c, boolean d) {
   public static final Codec<cxi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jh.b.optionalFieldOf("target").forGetter(cxi::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cxi::b)).apply($$0, cxi::new)
   );
   public static final zj<ByteBuf, cxi> b = zj.a(jh.c.a(zh::a), cxi::a, zh.b, cxi::b, cxi::new);

   public cxi a(arb $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            iz $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(ces.s, $$1) ? this : new cxi(Optional.empty(), true);
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
