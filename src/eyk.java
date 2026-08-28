import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyk(String b) implements eym {
   public static final MapCodec<eyk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eyk::c)).apply($$0, eyk::new));

   public static eym a(String $$0) {
      return new eyk($$0);
   }

   @Override
   public eyl a() {
      return eyn.b;
   }

   @Override
   public fal a(etw $$0) {
      return fal.c(this.b);
   }

   @Override
   public Set<ewp<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
