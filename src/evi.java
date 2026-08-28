import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evi(String b) implements evk {
   public static final MapCodec<evi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(evi::c)).apply($$0, evi::new));

   public static evk a(String $$0) {
      return new evi($$0);
   }

   @Override
   public evj a() {
      return evl.b;
   }

   @Override
   public exi a(equ $$0) {
      return exi.c(this.b);
   }

   @Override
   public Set<etn<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
