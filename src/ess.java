import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ess(String b) implements esu {
   public static final Codec<ess> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ess::c)).apply($$0, ess::new));

   public static esu a(String $$0) {
      return new ess($$0);
   }

   @Override
   public est a() {
      return esv.b;
   }

   @Override
   public eus a(eol $$0) {
      return eus.c(this.b);
   }

   @Override
   public Set<eqz<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
