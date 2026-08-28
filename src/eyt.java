import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eyt(eug.b c) implements eyw {
   public static final MapCodec<eyt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eug.b.e.fieldOf("target").forGetter(eyt::c)).apply($$0, eyt::new));
   public static final Codec<eyt> b = eug.b.e.xmap(eyt::new, eyt::c);

   public static eyw a(eug.b $$0) {
      return new eyt($$0);
   }

   @Override
   public eyv a() {
      return eyx.c;
   }

   @Nullable
   @Override
   public fav a(eug $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<ewz<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
