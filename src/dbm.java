import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Optional;

public record dbm(Optional<jd> c, boolean d) {
   public static final Codec<dbm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.b.optionalFieldOf("target").forGetter(dbm::a), Codec.BOOL.optionalFieldOf("tracked", true).forGetter(dbm::b)).apply($$0, dbm::new)
   );
   public static final yu<ByteBuf, dbm> b = yu.a(jd.c.a(ys::a), dbm::a, ys.b, dbm::b, dbm::new);

   public dbm a(aro $$0) {
      if (this.d && !this.c.isEmpty()) {
         if (this.c.get().a() != $$0.aj()) {
            return this;
         } else {
            iu $$1 = this.c.get().b();
            return $$0.k($$1) && $$0.A().a(cif.s, $$1) ? this : new dbm(Optional.empty(), true);
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
