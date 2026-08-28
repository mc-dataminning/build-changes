import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eup(String b) implements eur {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eup::c)).apply($$0, eup::new));

   public static eur a(String $$0) {
      return new eup($$0);
   }

   @Override
   public euq a() {
      return eus.b;
   }

   @Override
   public ewp a(eqd $$0) {
      return ewp.c(this.b);
   }

   @Override
   public Set<esw<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
