import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eut(eqi.b c) implements euw {
   public static final MapCodec<eut> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eqi.b.e.fieldOf("target").forGetter(eut::c)).apply($$0, eut::new));
   public static final Codec<eut> b = eqi.b.e.xmap(eut::new, eut::c);

   public static euw a(eqi.b $$0) {
      return new eut($$0);
   }

   @Override
   public euv a() {
      return eux.c;
   }

   @Nullable
   @Override
   public ewu a(eqi $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<etb<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
