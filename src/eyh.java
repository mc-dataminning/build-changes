import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eyh(all b) implements eyf {
   public static final MapCodec<eyh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(all.a.fieldOf("source").forGetter(eyh::c)).apply($$0, eyh::new));

   @Override
   public eye a() {
      return eyg.b;
   }

   @Nullable
   @Override
   public vk a(eug $$0) {
      return $$0.d().o().aK().a(this.b);
   }

   @Override
   public Set<ewz<?>> b() {
      return ImmutableSet.of();
   }

   public all c() {
      return this.b;
   }
}
