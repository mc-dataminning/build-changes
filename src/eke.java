import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eke(ahd b) implements ekc {
   public static final Codec<eke> a = RecordCodecBuilder.create($$0 -> $$0.group(ahd.a.fieldOf("source").forGetter(eke::c)).apply($$0, eke::new));

   @Override
   public ekb a() {
      return ekd.b;
   }

   @Nullable
   @Override
   public ti a(egp $$0) {
      return $$0.d().o().aI().a(this.b);
   }

   @Override
   public Set<eix<?>> b() {
      return ImmutableSet.of();
   }

   public ahd c() {
      return this.b;
   }
}
