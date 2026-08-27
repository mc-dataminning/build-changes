import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record erb(ajv b) implements eqz {
   public static final Codec<erb> a = RecordCodecBuilder.create($$0 -> $$0.group(ajv.a.fieldOf("source").forGetter(erb::c)).apply($$0, erb::new));

   @Override
   public eqy a() {
      return era.b;
   }

   @Nullable
   @Override
   public ul a(enk $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<epu<?>> b() {
      return ImmutableSet.of();
   }

   public ajv c() {
      return this.b;
   }
}
