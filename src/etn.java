import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etn(String b) implements etp {
   public static final MapCodec<etn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(etn::c)).apply($$0, etn::new));

   public static etp a(String $$0) {
      return new etn($$0);
   }

   @Override
   public eto a() {
      return etq.b;
   }

   @Override
   public evn a(epf $$0) {
      return evn.c(this.b);
   }

   @Override
   public Set<eru<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
