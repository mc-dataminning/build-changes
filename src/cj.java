import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cj(Optional<bd<cuo, cs>> c) implements dw<cxm> {
   public static final Codec<cj> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cs.a).optionalFieldOf("items").forGetter(cj::b)).apply($$0, cj::new));

   @Override
   public kp<cxm> a() {
      return kq.ab;
   }

   public boolean a(cuo $$0, cxm $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bd<cuo, cs>> b() {
      return this.c;
   }
}
