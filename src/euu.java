import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record euu(eqj.b c) implements eux {
   public static final MapCodec<euu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eqj.b.e.fieldOf("target").forGetter(euu::c)).apply($$0, euu::new));
   public static final Codec<euu> b = eqj.b.e.xmap(euu::new, euu::c);

   public static eux a(eqj.b $$0) {
      return new euu($$0);
   }

   @Override
   public euw a() {
      return euy.c;
   }

   @Nullable
   @Override
   public ewv a(eqj $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<etc<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
