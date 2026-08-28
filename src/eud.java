import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eud(alb b) implements eub {
   public static final MapCodec<eud> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alb.a.fieldOf("source").forGetter(eud::c)).apply($$0, eud::new));

   @Override
   public eua a() {
      return euc.b;
   }

   @Nullable
   @Override
   public vo a(eqd $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<esw<?>> b() {
      return ImmutableSet.of();
   }

   public alb c() {
      return this.b;
   }
}
