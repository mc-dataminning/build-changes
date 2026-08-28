import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cxo(Optional<jl> c, boolean d) {
   public static final Codec<cxo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jl.b.optionalFieldOf("target").forGetter(cxo::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cxo::b)).apply($$0, cxo::new)
   );
   public static final yw<ByteBuf, cxo> b = yw.a(jl.c.a(yu::a), cxo::a, yu.b, cxo::b, cxo::new);

   public cxo a(aqt $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.af()) {
            return this;
         } else {
            jd $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(ceu.s, $$1) ? this : new cxo(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jl> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
