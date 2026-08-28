import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dcs(Optional<je> c, boolean d) {
   public static final Codec<dcs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(je.b.optionalFieldOf("target").forGetter(dcs::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dcs::b)).apply($$0, dcs::new)
   );
   public static final yy<ByteBuf, dcs> b = yy.a(je.c.a(yw::a), dcs::a, yw.b, dcs::b, dcs::new);

   public dcs a(ars $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.aj()) {
            return this;
         } else {
            iv $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cja.s, $$1) ? this : new dcs(Optional.empty(), true);
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
