import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record exg(est.b c) implements exj {
   public static final MapCodec<exg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(est.b.e.fieldOf("target").forGetter(exg::c)).apply($$0, exg::new));
   public static final Codec<exg> b = est.b.e.xmap(exg::new, exg::c);

   public static exj a(est.b $$0) {
      return new exg($$0);
   }

   @Override
   public exi a() {
      return exk.c;
   }

   @Nullable
   @Override
   public ezh a(est $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<evm<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
