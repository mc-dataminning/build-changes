import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eus(eqh.b c) implements euv {
   public static final MapCodec<eus> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eqh.b.e.fieldOf("target").forGetter(eus::c)).apply($$0, eus::new));
   public static final Codec<eus> b = eqh.b.e.xmap(eus::new, eus::c);

   public static euv a(eqh.b $$0) {
      return new eus($$0);
   }

   @Override
   public euu a() {
      return euw.c;
   }

   @Nullable
   @Override
   public ewt a(eqh $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<eta<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
