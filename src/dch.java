import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dch(Optional<je> c, boolean d) {
   public static final Codec<dch> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(je.b.optionalFieldOf("target").forGetter(dch::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dch::b)).apply($$0, dch::new)
   );
   public static final yw<ByteBuf, dch> b = yw.a(je.c.a(yu::a), dch::a, yu.b, dch::b, dch::new);

   public dch a(arq $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.aj()) {
            return this;
         } else {
            iv $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cip.s, $$1) ? this : new dch(Optional.empty(), true);
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
