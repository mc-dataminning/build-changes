import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record exy(etl.b c) implements eyb {
   public static final MapCodec<exy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(etl.b.e.fieldOf("target").forGetter(exy::c)).apply($$0, exy::new));
   public static final Codec<exy> b = etl.b.e.xmap(exy::new, exy::c);

   public static eyb a(etl.b $$0) {
      return new exy($$0);
   }

   @Override
   public eya a() {
      return eyc.c;
   }

   @Nullable
   @Override
   public faa a(etl $$0) {
      return $$0.c(this.c.a());
   }

   @Override
   public Set<ewe<?>> b() {
      return ImmutableSet.of(this.c.a());
   }
}
