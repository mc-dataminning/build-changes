import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ck(Optional<bd<cvx, ct>> c) implements dy<cyn> {
   public static final Codec<ck> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(ct.a).optionalFieldOf("items").forGetter(ck::b)).apply($$0, ck::new));

   @Override
   public ks<cyn> a() {
      return kt.ak;
   }

   public boolean a(cvx $$0, cyn $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.d());
   }

   public Optional<bd<cvx, ct>> b() {
      return this.c;
   }
}
