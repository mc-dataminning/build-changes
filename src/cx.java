import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cx(Optional<ju<dfo>> c, Optional<ju<dfq>> d) implements dz<dfn> {
   public static final Codec<cx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.a(mb.aZ).optionalFieldOf("material").forGetter(cx::b), kf.a(mb.ba).optionalFieldOf("pattern").forGetter(cx::c)).apply($$0, cx::new)
   );

   @Override
   public kt<dfn> a() {
      return ku.U;
   }

   public boolean a(cxg $$0, dfn $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<ju<dfo>> b() {
      return this.c;
   }

   public Optional<ju<dfq>> c() {
      return this.d;
   }
}
