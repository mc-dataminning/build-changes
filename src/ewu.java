import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ewu(alb b) implements ews {
   public static final MapCodec<ewu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alb.a.fieldOf("source").forGetter(ewu::c)).apply($$0, ewu::new));

   @Override
   public ewr a() {
      return ewt.b;
   }

   @Nullable
   @Override
   public vc a(est $$0) {
      return $$0.d().o().aK().a(this.b);
   }

   @Override
   public Set<evm<?>> b() {
      return ImmutableSet.of();
   }

   public alb c() {
      return this.b;
   }
}
