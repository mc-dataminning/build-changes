import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ck(Optional<be<cwm, cu>> c) implements dz<cyq> {
   public static final Codec<ck> a = RecordCodecBuilder.create($$0 -> $$0.group(be.a(cu.a).optionalFieldOf("items").forGetter(ck::b)).apply($$0, ck::new));

   @Override
   public kt<cyq> a() {
      return ku.P;
   }

   public boolean a(cwm $$0, cyq $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<be<cwm, cu>> b() {
      return this.c;
   }
}
