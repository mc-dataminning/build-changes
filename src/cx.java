import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cx(Optional<ju<ddu>> c, Optional<ju<ddw>> d) implements dz<ddt> {
   public static final Codec<cx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.a(ma.aX).optionalFieldOf("material").forGetter(cx::b), kf.a(ma.aY).optionalFieldOf("pattern").forGetter(cx::c)).apply($$0, cx::new)
   );

   @Override
   public kt<ddt> a() {
      return ku.U;
   }

   public boolean a(cwf $$0, ddt $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<ju<ddu>> b() {
      return this.c;
   }

   public Optional<ju<ddw>> c() {
      return this.d;
   }
}
