import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record cyz(Optional<jp> c, boolean d) {
   public static final Codec<cyz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jp.b.optionalFieldOf("target").forGetter(cyz::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(cyz::b)).apply($$0, cyz::new)
   );
   public static final zj<ByteBuf, cyz> b = zj.a(jp.c.a(zh::a), cyz::a, zh.b, cyz::b, cyz::new);

   public cyz a(arq $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ag()) {
            return this;
         } else {
            jh $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.y().a(cgm.s, $$1) ? this : new cyz(Optional.empty(), true);
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
