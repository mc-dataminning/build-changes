import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record daj(Optional<jp> c, boolean d) {
   public static final Codec<daj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jp.b.optionalFieldOf("target").forGetter(daj::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(daj::b)).apply($$0, daj::new)
   );
   public static final zt<ByteBuf, daj> b = zt.a(jp.c.a(zr::a), daj::a, zr.b, daj::b, daj::new);

   public daj a(ash $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ah()) {
            return this;
         } else {
            jh $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.z().a(cho.s, $$1) ? this : new daj(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jp> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
