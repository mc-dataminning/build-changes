import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record enn(ajc b) implements enl {
   public static final Codec<enn> a = RecordCodecBuilder.create($$0 -> $$0.group(ajc.a.fieldOf("source").forGetter(enn::c)).apply($$0, enn::new));

   @Override
   public enk a() {
      return enm.b;
   }

   @Nullable
   @Override
   public tv a(ejy $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<emg<?>> b() {
      return ImmutableSet.of();
   }

   public ajc c() {
      return this.b;
   }
}
