import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cx(Optional<ju<dfp>> c, Optional<ju<dfr>> d) implements dz<dfo> {
   public static final Codec<cx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.a(mb.aY).optionalFieldOf("material").forGetter(cx::b), kf.a(mb.aZ).optionalFieldOf("pattern").forGetter(cx::c)).apply($$0, cx::new)
   );

   @Override
   public kt<dfo> a() {
      return ku.U;
   }

   public boolean a(cxk $$0, dfo $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<ju<dfp>> b() {
      return this.c;
   }

   public Optional<ju<dfr>> c() {
      return this.d;
   }
}
