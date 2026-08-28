import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ck(Optional<be<cxp, cu>> c) implements dz<czt> {
   public static final Codec<ck> a = RecordCodecBuilder.create($$0 -> $$0.group(be.a(cu.a).optionalFieldOf("items").forGetter(ck::b)).apply($$0, ck::new));

   @Override
   public kt<czt> a() {
      return ku.P;
   }

   public boolean a(cxp $$0, czt $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<be<cxp, cu>> b() {
      return this.c;
   }
}
