import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cq(Optional<bd<cyk, cp.a>> c, di.d d) implements dy<cyl> {
   public static final Codec<cq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bd.a(cp.a.a).optionalFieldOf("explosions").forGetter(cq::b), di.d.d.optionalFieldOf("flight_duration", di.d.c).forGetter(cq::c))
            .apply($$0, cq::new)
   );

   @Override
   public ks<cyl> a() {
      return kt.ae;
   }

   public boolean a(cvx $$0, cyl $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : this.d.d($$1.a());
   }

   public Optional<bd<cyk, cp.a>> b() {
      return this.c;
   }

   public di.d c() {
      return this.d;
   }
}
