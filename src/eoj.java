import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eoj(ajh b) implements eoh {
   public static final Codec<eoj> a = RecordCodecBuilder.create($$0 -> $$0.group(ajh.a.fieldOf("source").forGetter(eoj::c)).apply($$0, eoj::new));

   @Override
   public eog a() {
      return eoi.b;
   }

   @Nullable
   @Override
   public tx a(eku $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<enc<?>> b() {
      return ImmutableSet.of();
   }

   public ajh c() {
      return this.b;
   }
}
