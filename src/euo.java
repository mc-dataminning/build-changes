import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record euo(eqd.b c) implements eur {
   public static final MapCodec<euo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eqd.b.e.fieldOf("target").forGetter(euo::c)).apply($$0, euo::new));
   public static final Codec<euo> b = eqd.b.e.xmap(euo::new, euo::c);

   public static eur a(eqd.b $$0) {
      return new euo($$0);
   }

   @Override
   public euq a() {
      return eus.c;
   }

   @Nullable
   @Override
   public ewp a(eqd $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<esw<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
