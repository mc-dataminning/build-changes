import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eny(String b) implements eoa {
   public static final Codec<eny> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eny::c)).apply($$0, eny::new));

   public static eoa a(String $$0) {
      return new eny($$0);
   }

   @Override
   public enz a() {
      return eob.b;
   }

   @Override
   public epy a(ejy $$0) {
      return epy.d(this.b);
   }

   @Override
   public Set<emg<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
