import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eux(akk b) implements euv {
   public static final MapCodec<eux> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.a.fieldOf("source").forGetter(eux::c)).apply($$0, eux::new));

   @Override
   public euu a() {
      return euw.b;
   }

   @Nullable
   @Override
   public uu a(eqw $$0) {
      return $$0.d().o().aM().a(this.b);
   }

   @Override
   public Set<etp<?>> b() {
      return ImmutableSet.of();
   }

   public akk c() {
      return this.b;
   }
}
