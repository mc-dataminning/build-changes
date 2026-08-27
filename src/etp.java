import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etp(String b) implements etr {
   public static final MapCodec<etp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(etp::c)).apply($$0, etp::new));

   public static etr a(String $$0) {
      return new etp($$0);
   }

   @Override
   public etq a() {
      return ets.b;
   }

   @Override
   public evp a(eph $$0) {
      return evp.c(this.b);
   }

   @Override
   public Set<erw<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
