import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ci(Optional<bd<cvs, cs>> c) implements dx<cyc> {
   public static final Codec<ci> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(cs.a).optionalFieldOf("items").forGetter(ci::b)).apply($$0, ci::new));

   @Override
   public kr<cyc> a() {
      return ks.K;
   }

   public boolean a(cvs $$0, cyc $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<bd<cvs, cs>> b() {
      return this.c;
   }
}
