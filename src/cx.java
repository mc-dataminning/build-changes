import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cx(Optional<ju<deb>> c, Optional<ju<ded>> d) implements dz<dea> {
   public static final Codec<cx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.a(ma.aX).optionalFieldOf("material").forGetter(cx::b), kf.a(ma.aY).optionalFieldOf("pattern").forGetter(cx::c)).apply($$0, cx::new)
   );

   @Override
   public kt<dea> a() {
      return ku.U;
   }

   public boolean a(cwm $$0, dea $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<ju<deb>> b() {
      return this.c;
   }

   public Optional<ju<ded>> c() {
      return this.d;
   }
}
