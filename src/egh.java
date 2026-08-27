import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record egh(aey b) implements egf {
   public static final Codec<egh> a = RecordCodecBuilder.create($$0 -> $$0.group(aey.a.fieldOf("source").forGetter(egh::c)).apply($$0, egh::new));

   @Override
   public ege a() {
      return egg.b;
   }

   @Nullable
   @Override
   public rs a(ecs $$0) {
      return $$0.d().n().aG().a(this.b);
   }

   @Override
   public Set<efa<?>> b() {
      return ImmutableSet.of();
   }

   public aey c() {
      return this.b;
   }
}
