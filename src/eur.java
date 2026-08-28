import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eur(eqg.b c) implements euu {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eqg.b.e.fieldOf("target").forGetter(eur::c)).apply($$0, eur::new));
   public static final Codec<eur> b = eqg.b.e.xmap(eur::new, eur::c);

   public static euu a(eqg.b $$0) {
      return new eur($$0);
   }

   @Override
   public eut a() {
      return euv.c;
   }

   @Nullable
   @Override
   public ews a(eqg $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<esz<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
