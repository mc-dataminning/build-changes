import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record erm(String b) implements ero {
   public static final Codec<erm> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(erm::c)).apply($$0, erm::new));

   public static ero a(String $$0) {
      return new erm($$0);
   }

   @Override
   public ern a() {
      return erp.b;
   }

   @Override
   public etm a(enk $$0) {
      return etm.c(this.b);
   }

   @Override
   public Set<epu<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
