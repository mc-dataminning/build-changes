import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cj(Optional<bd<cvx, ct>> c) implements dy<cyb> {
   public static final Codec<cj> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(ct.a).optionalFieldOf("items").forGetter(cj::b)).apply($$0, cj::new));

   @Override
   public ks<cyb> a() {
      return kt.O;
   }

   public boolean a(cvx $$0, cyb $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.c());
   }

   public Optional<bd<cvx, ct>> b() {
      return this.c;
   }
}
