import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ehi(String b) implements ehk {
   public static final Codec<ehi> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ehi::c)).apply($$0, ehi::new));

   public static ehk a(String $$0) {
      return new ehi($$0);
   }

   @Override
   public ehj a() {
      return ehl.b;
   }

   @Nullable
   @Override
   public String a(edi $$0) {
      return this.b;
   }

   @Override
   public Set<efq<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
