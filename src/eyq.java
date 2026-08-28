import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eyq(String b) implements eys {
   public static final MapCodec<eyq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eyq::c)).apply($$0, eyq::new));

   public static eys a(String $$0) {
      return new eyq($$0);
   }

   @Override
   public eyr a() {
      return eyt.b;
   }

   @Override
   public far a(euc $$0) {
      return far.c(this.b);
   }

   @Override
   public Set<ewv<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
