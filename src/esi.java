import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record esi(String b) implements esk {
   public static final Codec<esi> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(esi::c)).apply($$0, esi::new));

   public static esk a(String $$0) {
      return new esi($$0);
   }

   @Override
   public esj a() {
      return esl.b;
   }

   @Override
   public eui a(eoa $$0) {
      return eui.c(this.b);
   }

   @Override
   public Set<eqq<?>> b() {
      return ImmutableSet.of();
   }

   public String c() {
      return this.b;
   }
}
