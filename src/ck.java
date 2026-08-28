import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ck(Optional<be<cxo, cu>> c) implements dz<czs> {
   public static final Codec<ck> a = RecordCodecBuilder.create($$0 -> $$0.group(be.a(cu.a).optionalFieldOf("items").forGetter(ck::b)).apply($$0, ck::new));

   @Override
   public kt<czs> a() {
      return ku.P;
   }

   public boolean a(cxo $$0, czs $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<be<cxo, cu>> b() {
      return this.c;
   }
}
