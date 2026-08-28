import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exv(String b) implements exx {
   public static final MapCodec<exv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(exv::c)).apply($$0, exv::new));

   public static exx a(String $$0) {
      return new exv($$0);
   }

   @Override
   public exw a() {
      return exy.b;
   }

   @Override
   public ezw a(eth $$0) {
      return ezw.c(this.b);
   }

   @Override
   public Set<ewa<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
