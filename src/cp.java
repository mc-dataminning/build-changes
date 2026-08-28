import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cp(Optional<bd<cyi, co.a>> c, dh.d d) implements dw<cyj> {
   public static final Codec<cp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bd.a(co.a.a).optionalFieldOf("explosions").forGetter(cp::b), dh.d.d.optionalFieldOf("flight_duration", dh.d.c).forGetter(cp::c))
            .apply($$0, cp::new)
   );

   @Override
   public kq<cyj> a() {
      return kr.aa;
   }

   public boolean a(cvp $$0, cyj $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : this.d.d($$1.a());
   }

   public Optional<bd<cyi, co.a>> b() {
      return this.c;
   }

   public dh.d c() {
      return this.d;
   }
}
