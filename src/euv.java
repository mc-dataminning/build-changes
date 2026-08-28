import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record euv(eqk.b c) implements euy {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eqk.b.e.fieldOf("target").forGetter(euv::c)).apply($$0, euv::new));
   public static final Codec<euv> b = eqk.b.e.xmap(euv::new, euv::c);

   public static euy a(eqk.b $$0) {
      return new euv($$0);
   }

   @Override
   public eux a() {
      return euz.c;
   }

   @Nullable
   @Override
   public eww a(eqk $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<etd<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
