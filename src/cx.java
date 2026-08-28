import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cx(Optional<ju<dfw>> c, Optional<ju<dfy>> d) implements dz<dfv> {
   public static final Codec<cx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.a(mb.aZ).optionalFieldOf("material").forGetter(cx::b), kf.a(mb.ba).optionalFieldOf("pattern").forGetter(cx::c)).apply($$0, cx::new)
   );

   @Override
   public kt<dfv> a() {
      return ku.U;
   }

   public boolean a(cxo $$0, dfv $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.a()) ? false : !this.d.isPresent() || this.d.get().a($$1.b());
   }

   public Optional<ju<dfw>> b() {
      return this.c;
   }

   public Optional<ju<dfy>> c() {
      return this.d;
   }
}
