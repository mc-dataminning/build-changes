import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cl(Optional<be<cxo, cu>> c) implements dz<dag> {
   public static final Codec<cl> a = RecordCodecBuilder.create($$0 -> $$0.group(be.a(cu.a).optionalFieldOf("items").forGetter(cl::b)).apply($$0, cl::new));

   @Override
   public kt<dag> a() {
      return ku.al;
   }

   public boolean a(cxo $$0, dag $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<be<cxo, cu>> b() {
      return this.c;
   }
}
