import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cg(Optional<bc<cur, cp>> c) implements ds<cxe> {
   public static final Codec<cg> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cp.a).optionalFieldOf("items").forGetter(cg::b)).apply($$0, cg::new));

   @Override
   public kl<cxe> a() {
      return km.F;
   }

   public boolean a(cur $$0, cxe $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bc<cur, cp>> b() {
      return this.c;
   }
}
