import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dce(Optional<je> c, boolean d) {
   public static final Codec<dce> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(je.b.optionalFieldOf("target").forGetter(dce::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dce::b)).apply($$0, dce::new)
   );
   public static final yw<ByteBuf, dce> b = yw.a(je.c.a(yu::a), dce::a, yu.b, dce::b, dce::new);

   public dce a(arq $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.aj()) {
            return this;
         } else {
            iv $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cip.s, $$1) ? this : new dce(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<je> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
