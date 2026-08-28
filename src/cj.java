import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cj(Optional<bd<cvp, cs>> c) implements dw<cyl> {
   public static final Codec<cj> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cs.a).optionalFieldOf("items").forGetter(cj::b)).apply($$0, cj::new));

   @Override
   public kq<cyl> a() {
      return kr.ag;
   }

   public boolean a(cvp $$0, cyl $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bd<cvp, cs>> b() {
      return this.c;
   }
}
