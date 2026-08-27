import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eto(eph.b c) implements etr {
   public static final MapCodec<eto> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eph.b.e.fieldOf("target").forGetter(eto::c)).apply($$0, eto::new));
   public static final Codec<eto> b = eph.b.e.xmap(eto::new, eto::c);

   public static etr a(eph.b $$0) {
      return new eto($$0);
   }

   @Override
   public etq a() {
      return ets.c;
   }

   @Nullable
   @Override
   public evp a(eph $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<erw<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
