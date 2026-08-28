import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eus(String b) implements euu {
   public static final MapCodec<eus> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eus::c)).apply($$0, eus::new));

   public static euu a(String $$0) {
      return new eus($$0);
   }

   @Override
   public eut a() {
      return euv.b;
   }

   @Override
   public ews a(eqg $$0) {
      return ews.c(this.b);
   }

   @Override
   public Set<esz<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
