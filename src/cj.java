import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cj(Optional<bd<cuq, cs>> c) implements dw<cxo> {
   public static final Codec<cj> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cs.a).optionalFieldOf("items").forGetter(cj::b)).apply($$0, cj::new));

   @Override
   public kp<cxo> a() {
      return kq.ab;
   }

   public boolean a(cuq $$0, cxo $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bd<cuq, cs>> b() {
      return this.c;
   }
}
