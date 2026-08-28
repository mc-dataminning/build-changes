import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cj(Optional<bd<cvs, cs>> c) implements dx<cyo> {
   public static final Codec<cj> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cs.a).optionalFieldOf("items").forGetter(cj::b)).apply($$0, cj::new));

   @Override
   public kr<cyo> a() {
      return ks.ag;
   }

   public boolean a(cvs $$0, cyo $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bd<cvs, cs>> b() {
      return this.c;
   }
}
