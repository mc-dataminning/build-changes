import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cg(Optional<bc<cup, cp>> c) implements ds<cxc> {
   public static final Codec<cg> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cp.a).optionalFieldOf("items").forGetter(cg::b)).apply($$0, cg::new));

   @Override
   public kl<cxc> a() {
      return km.F;
   }

   public boolean a(cup $$0, cxc $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bc<cup, cp>> b() {
      return this.c;
   }
}
