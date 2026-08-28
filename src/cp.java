import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cp(Optional<bd<cye, co.a>> c, dh.d d) implements dw<cyf> {
   public static final Codec<cp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bd.a(co.a.a).optionalFieldOf("explosions").forGetter(cp::b), dh.d.d.optionalFieldOf("flight_duration", dh.d.c).forGetter(cp::c))
            .apply($$0, cp::new)
   );

   @Override
   public kq<cyf> a() {
      return kr.X;
   }

   public boolean a(cvl $$0, cyf $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : this.d.d($$1.a());
   }

   public Optional<bd<cye, co.a>> b() {
      return this.c;
   }

   public dh.d c() {
      return this.d;
   }
}
