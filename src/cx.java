import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cx(Optional<ju<ddq>> c, Optional<ju<dds>> d) implements dz<ddp> {
   public static final Codec<cx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.a(lz.aX).optionalFieldOf("material").forGetter(cx::b), kf.a(lz.aY).optionalFieldOf("pattern").forGetter(cx::c)).apply($$0, cx::new)
   );

   @Override
   public kt<ddp> a() {
      return ku.U;
   }

   public boolean a(cwb $$0, ddp $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<ju<ddq>> b() {
      return this.c;
   }

   public Optional<ju<dds>> c() {
      return this.d;
   }
}
