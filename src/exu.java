import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record exu(eth.b c) implements exx {
   public static final MapCodec<exu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(eth.b.e.fieldOf("target").forGetter(exu::c)).apply($$0, exu::new));
   public static final Codec<exu> b = eth.b.e.xmap(exu::new, exu::c);

   public static exx a(eth.b $$0) {
      return new exu($$0);
   }

   @Override
   public exw a() {
      return exy.c;
   }

   @Nullable
   @Override
   public ezw a(eth $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<ewa<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
