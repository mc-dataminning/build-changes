import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ch(Optional<bc<cuq, cp>> c) implements ds<cxm> {
   public static final Codec<ch> a = RecordCodecBuilder.create($$0 -> $$0.group(bc.a(cp.a).optionalFieldOf("items").forGetter(ch::b)).apply($$0, ch::new));

   @Override
   public kl<cxm> a() {
      return km.aa;
   }

   public boolean a(cuq $$0, cxm $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bc<cuq, cp>> b() {
      return this.c;
   }
}
