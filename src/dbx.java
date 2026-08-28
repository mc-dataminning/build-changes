import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dbx(Optional<jd> c, boolean d) {
   public static final Codec<dbx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.b.optionalFieldOf("target").forGetter(dbx::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dbx::b)).apply($$0, dbx::new)
   );
   public static final yw<ByteBuf, dbx> b = yw.a(jd.c.a(yu::a), dbx::a, yu.b, dbx::b, dbx::new);

   public dbx a(arq $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.aj()) {
            return this;
         } else {
            iu $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cik.s, $$1) ? this : new dbx(Optional.empty(), true);
         }
      } else {
         return this;
      }
   }

   public Optional<jd> a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }
}
