import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record evb(eqo.b c) implements eve {
   public static final MapCodec<evb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eqo.b.e.fieldOf("target").forGetter(evb::c)).apply($$0, evb::new));
   public static final Codec<evb> b = eqo.b.e.xmap(evb::new, evb::c);

   public static eve a(eqo.b $$0) {
      return new evb($$0);
   }

   @Override
   public evd a() {
      return evf.c;
   }

   @Nullable
   @Override
   public exc a(eqo $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eth<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
