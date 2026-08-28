import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eug(ale b) implements eue {
   public static final MapCodec<eug> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("source").forGetter(eug::c)).apply($$0, eug::new));

   @Override
   public eud a() {
      return euf.b;
   }

   @Nullable
   @Override
   public vo a(eqg $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<esz<?>> b() {
      return ImmutableSet.of();
   }

   public ale c() {
      return this.b;
   }
}
