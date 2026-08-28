import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ewe(err.b c) implements ewh {
   public static final MapCodec<ewe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(err.b.e.fieldOf("target").forGetter(ewe::c)).apply($$0, ewe::new));
   public static final Codec<ewe> b = err.b.e.xmap(ewe::new, ewe::c);

   public static ewh a(err.b $$0) {
      return new ewe($$0);
   }

   @Override
   public ewg a() {
      return ewi.c;
   }

   @Nullable
   @Override
   public eyf a(err $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<euk<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
