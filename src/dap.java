import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dap(Optional<jr> c, boolean d) {
   public static final Codec<dap> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jr.b.optionalFieldOf("target").forGetter(dap::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dap::b)).apply($$0, dap::new)
   );
   public static final yt<ByteBuf, dap> b = yt.a(jr.c.a(yr::a), dap::a, yr.b, dap::b, dap::new);

   public dap a(arn $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.aj()) {
            return this;
         } else {
            jj $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(chx.s, $$1) ? this : new dap(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jr> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
