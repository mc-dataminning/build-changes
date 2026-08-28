import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dde(Optional<jf> c, boolean d) {
   public static final Codec<dde> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jf.b.optionalFieldOf("target").forGetter(dde::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dde::b)).apply($$0, dde::new)
   );
   public static final ze<ByteBuf, dde> b = ze.a(jf.c.a(zc::a), dde::a, zc.b, dde::b, dde::new);

   public dde a(asb $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.aj()) {
            return this;
         } else {
            iw $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cjl.s, $$1) ? this : new dde(Optional.empty(), true);
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
