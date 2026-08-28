import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyu(String b) implements eyw {
   public static final MapCodec<eyu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eyu::c)).apply($$0, eyu::new));

   public static eyw a(String $$0) {
      return new eyu($$0);
   }

   @Override
   public eyv a() {
      return eyx.b;
   }

   @Override
   public fav a(eug $$0) {
      return fav.c(this.b);
   }

   @Override
   public Set<ewz<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
