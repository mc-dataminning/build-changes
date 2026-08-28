import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record daa(Optional<jp> c, boolean d) {
   public static final Codec<daa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jp.b.optionalFieldOf("target").forGetter(daa::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(daa::b)).apply($$0, daa::new)
   );
   public static final zi<ByteBuf, daa> b = zi.a(jp.c.a(zg::a), daa::a, zg.b, daa::b, daa::new);

   public daa a(arx $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ai()) {
            return this;
         } else {
            jh $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(chf.s, $$1) ? this : new daa(Optional.empty(), true);
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
