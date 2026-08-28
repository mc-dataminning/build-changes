import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record evj(eqw.b c) implements evm {
   public static final MapCodec<evj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eqw.b.e.fieldOf("target").forGetter(evj::c)).apply($$0, evj::new));
   public static final Codec<evj> b = eqw.b.e.xmap(evj::new, evj::c);

   public static evm a(eqw.b $$0) {
      return new evj($$0);
   }

   @Override
   public evl a() {
      return evn.c;
   }

   @Nullable
   @Override
   public exk a(eqw $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<etp<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
