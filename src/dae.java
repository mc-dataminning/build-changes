import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dae(Optional<jp> c, boolean d) {
   public static final Codec<dae> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jp.b.optionalFieldOf("target").forGetter(dae::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dae::b)).apply($$0, dae::new)
   );
   public static final zt<ByteBuf, dae> b = zt.a(jp.c.a(zr::a), dae::a, zr.b, dae::b, dae::new);

   public dae a(ash $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ah()) {
            return this;
         } else {
            jh $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.z().a(chj.s, $$1) ? this : new dae(Optional.empty(), true);
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
