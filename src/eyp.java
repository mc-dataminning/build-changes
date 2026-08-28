import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eyp(euc.b c) implements eys {
   public static final MapCodec<eyp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(euc.b.e.fieldOf("target").forGetter(eyp::c)).apply($$0, eyp::new));
   public static final Codec<eyp> b = euc.b.e.xmap(eyp::new, eyp::c);

   public static eys a(euc.b $$0) {
      return new eyp($$0);
   }

   @Override
   public eyr a() {
      return eyt.c;
   }

   @Nullable
   @Override
   public far a(euc $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<ewv<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
