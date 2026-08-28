import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cs(Optional<jm<cwv>> c, Optional<jm<cwx>> d) implements ds<cwu> {
   public static final Codec<cs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jx.a(lq.aO).optionalFieldOf("material").forGetter(cs::b), jx.a(lq.aP).optionalFieldOf("pattern").forGetter(cs::c)).apply($$0, cs::new)
   );

   @Override
   public kl<cwu> a() {
      return km.K;
   }

   public boolean a(cuq $$0, cwu $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : !this.d.isPresent() || this.d.get().a($$1.a());
   }

   public Optional<jm<cwv>> b() {
      return this.c;
   }

   public Optional<jm<cwx>> c() {
      return this.d;
   }
}
