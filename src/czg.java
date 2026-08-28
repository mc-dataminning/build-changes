import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record czg(Optional<jp> c, boolean d) {
   public static final Codec<czg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jp.b.optionalFieldOf("target").forGetter(czg::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(czg::b)).apply($$0, czg::new)
   );
   public static final zh<ByteBuf, czg> b = zh.a(jp.c.a(zf::a), czg::a, zf.b, czg::b, czg::new);

   public czg a(arp $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.ag()) {
            return this;
         } else {
            jh $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.z().a(cgp.s, $$1) ? this : new czg(Optional.empty(), true);
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
