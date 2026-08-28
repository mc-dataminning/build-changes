import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record evm(akq b) implements evk {
   public static final MapCodec<evm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akq.a.fieldOf("source").forGetter(evm::c)).apply($$0, evm::new));

   @Override
   public evj a() {
      return evl.b;
   }

   @Nullable
   @Override
   public ux a(erl $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<eue<?>> b() {
      return ImmutableSet.of();
   }

   public akq c() {
      return this.b;
   }
}
