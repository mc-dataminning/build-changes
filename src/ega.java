import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record ega(aeu b) implements efy {
   public static final Codec<ega> a = RecordCodecBuilder.create($$0 -> $$0.group(aeu.a.fieldOf("source").forGetter(ega::c)).apply($$0, ega::new));

   @Override
   public efx a() {
      return efz.b;
   }

   @Nullable
   @Override
   public rn a(ecl $$0) {
      return $$0.d().n().aG().a(this.b);
   }

   @Override
   public Set<eet<?>> b() {
      return ImmutableSet.of();
   }

   public aeu c() {
      return this.b;
   }
}
