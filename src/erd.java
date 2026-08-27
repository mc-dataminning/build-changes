import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record erd(String b) implements erf {
   public static final Codec<erd> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(erd::c)).apply($$0, erd::new));

   public static erf a(String $$0) {
      return new erd($$0);
   }

   @Override
   public ere a() {
      return erg.b;
   }

   @Override
   public etd a(enb $$0) {
      return etd.c(this.b);
   }

   @Override
   public Set<epl<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
