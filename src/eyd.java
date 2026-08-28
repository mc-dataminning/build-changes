import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eyd(ali b) implements eyb {
   public static final MapCodec<eyd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("source").forGetter(eyd::c)).apply($$0, eyd::new));

   @Override
   public eya a() {
      return eyc.b;
   }

   @Nullable
   @Override
   public vh a(euc $$0) {
      return $$0.d().o().aK().a(this.b);
   }

   @Override
   public Set<ewv<?>> b() {
      return ImmutableSet.of();
   }

   public ali c() {
      return this.b;
   }
}
