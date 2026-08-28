import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dcu(Optional<jf> c, boolean d) {
   public static final Codec<dcu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jf.b.optionalFieldOf("target").forGetter(dcu::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dcu::b)).apply($$0, dcu::new)
   );
   public static final za<ByteBuf, dcu> b = za.a(jf.c.a(yy::a), dcu::a, yy.b, dcu::b, dcu::new);

   public dcu a(aru $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.aj()) {
            return this;
         } else {
            iw $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cjc.s, $$1) ? this : new dcu(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jf> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
