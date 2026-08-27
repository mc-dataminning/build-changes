import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record etm(epf.b c) implements etp {
   public static final MapCodec<etm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(epf.b.e.fieldOf("target").forGetter(etm::c)).apply($$0, etm::new));
   public static final Codec<etm> b = epf.b.e.xmap(etm::new, etm::c);

   public static etp a(epf.b $$0) {
      return new etm($$0);
   }

   @Override
   public eto a() {
      return etq.c;
   }

   @Nullable
   @Override
   public evn a(epf $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eru<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
