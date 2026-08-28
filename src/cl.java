import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cl(Optional<be<cwm, cu>> c) implements dz<cze> {
   public static final Codec<cl> a = RecordCodecBuilder.create($$0 -> $$0.group(be.a(cu.a).optionalFieldOf("items").forGetter(cl::b)).apply($$0, cl::new));

   @Override
   public kt<cze> a() {
      return ku.al;
   }

   public boolean a(cwm $$0, cze $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<be<cwm, cu>> b() {
      return this.c;
   }
}
