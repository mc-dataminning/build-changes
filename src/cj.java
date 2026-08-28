import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cj(Optional<bd<cvl, cs>> c) implements dw<cyh> {
   public static final Codec<cj> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cs.a).optionalFieldOf("items").forGetter(cj::b)).apply($$0, cj::new));

   @Override
   public kq<cyh> a() {
      return kr.ad;
   }

   public boolean a(cvl $$0, cyh $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bd<cvl, cs>> b() {
      return this.c;
   }
}
