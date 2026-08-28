import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record evh(equ.b c) implements evk {
   public static final MapCodec<evh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(equ.b.e.fieldOf("target").forGetter(evh::c)).apply($$0, evh::new));
   public static final Codec<evh> b = equ.b.e.xmap(evh::new, evh::c);

   public static evk a(equ.b $$0) {
      return new evh($$0);
   }

   @Override
   public evj a() {
      return evl.c;
   }

   @Nullable
   @Override
   public exi a(equ $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<etn<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
