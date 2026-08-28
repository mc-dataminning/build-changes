import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cp(Optional<bd<cxl, co.a>> c, dh.d d) implements dw<cxm> {
   public static final Codec<cp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bd.a(co.a.a).optionalFieldOf("explosions").forGetter(cp::b), dh.d.d.optionalFieldOf("flight_duration", dh.d.c).forGetter(cp::c))
            .apply($$0, cp::new)
   );

   @Override
   public kp<cxm> a() {
      return kq.V;
   }

   public boolean a(cuq $$0, cxm $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : this.d.d($$1.a());
   }

   public Optional<bd<cxl, co.a>> b() {
      return this.c;
   }

   public dh.d c() {
      return this.d;
   }
}
