import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cs(Optional<jm<cwt>> c, Optional<jm<cwv>> d) implements ds<cws> {
   public static final Codec<cs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jx.a(lq.aO).optionalFieldOf("material").forGetter(cs::b), jx.a(lq.aP).optionalFieldOf("pattern").forGetter(cs::c)).apply($$0, cs::new)
   );

   @Override
   public kl<cws> a() {
      return km.K;
   }

   public boolean a(cuo $$0, cws $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : !this.d.isPresent() || this.d.get().a($$1.a());
   }

   public Optional<jm<cwt>> b() {
      return this.c;
   }

   public Optional<jm<cwv>> c() {
      return this.d;
   }
}
