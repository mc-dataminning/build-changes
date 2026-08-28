import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dai(Optional<jp> c, boolean d) {
   public static final Codec<dai> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jp.b.optionalFieldOf("target").forGetter(dai::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dai::b)).apply($$0, dai::new)
   );
   public static final zt<ByteBuf, dai> b = zt.a(jp.c.a(zr::a), dai::a, zr.b, dai::b, dai::new);

   public dai a(ash $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ah()) {
            return this;
         } else {
            jh $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.z().a(chn.s, $$1) ? this : new dai(Optional.empty(), true);
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
