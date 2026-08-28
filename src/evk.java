import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evk(String b) implements evm {
   public static final MapCodec<evk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(evk::c)).apply($$0, evk::new));

   public static evm a(String $$0) {
      return new evk($$0);
   }

   @Override
   public evl a() {
      return evn.b;
   }

   @Override
   public exk a(eqw $$0) {
      return exk.c(this.b);
   }

   @Override
   public Set<etp<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
