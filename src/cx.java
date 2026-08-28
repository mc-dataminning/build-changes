import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cx(Optional<ju<dfx>> c, Optional<ju<dfz>> d) implements dz<dfw> {
   public static final Codec<cx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.a(mb.aZ).optionalFieldOf("material").forGetter(cx::b), kf.a(mb.ba).optionalFieldOf("pattern").forGetter(cx::c)).apply($$0, cx::new)
   );

   @Override
   public kt<dfw> a() {
      return ku.U;
   }

   public boolean a(cxp $$0, dfw $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<ju<dfx>> b() {
      return this.c;
   }

   public Optional<ju<dfz>> c() {
      return this.d;
   }
}
