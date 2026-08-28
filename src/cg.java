import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cg(Optional<bc<cuq, cp>> c) implements ds<cxd> {
   public static final Codec<cg> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cp.a).optionalFieldOf("items").forGetter(cg::b)).apply($$0, cg::new));

   @Override
   public kl<cxd> a() {
      return km.F;
   }

   public boolean a(cuq $$0, cxd $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bc<cuq, cp>> b() {
      return this.c;
   }
}
