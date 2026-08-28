import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ci(Optional<bd<cvp, cs>> c) implements dw<cxz> {
   public static final Codec<ci> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cs.a).optionalFieldOf("items").forGetter(ci::b)).apply($$0, ci::new));

   @Override
   public kq<cxz> a() {
      return kr.K;
   }

   public boolean a(cvp $$0, cxz $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<bd<cvp, cs>> b() {
      return this.c;
   }
}
