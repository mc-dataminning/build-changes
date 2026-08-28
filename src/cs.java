import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cs(Optional<jm<cww>> c, Optional<jm<cwy>> d) implements ds<cwv> {
   public static final Codec<cs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jx.a(lq.aO).optionalFieldOf("material").forGetter(cs::b), jx.a(lq.aP).optionalFieldOf("pattern").forGetter(cs::c)).apply($$0, cs::new)
   );

   @Override
   public kl<cwv> a() {
      return km.K;
   }

   public boolean a(cur $$0, cwv $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : !this.d.isPresent() || this.d.get().a($$1.a());
   }

   public Optional<jm<cww>> b() {
      return this.c;
   }

   public Optional<jm<cwy>> c() {
      return this.d;
   }
}
