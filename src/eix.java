import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eix(String b) implements eiz {
   public static final Codec<eix> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(eix::c)).apply($$0, eix::new));

   public static eiz a(String $$0) {
      return new eix($$0);
   }

   @Override
   public eiy a() {
      return eja.b;
   }

   @Nullable
   @Override
   public String a(eex $$0) {
      return this.b;
   }

   @Override
   public Set<ehf<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
