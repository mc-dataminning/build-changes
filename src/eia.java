import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eia(agg b) implements ehy {
   public static final Codec<eia> a = RecordCodecBuilder.create($$0 -> $$0.group(agg.a.fieldOf("source").forGetter(eia::c)).apply($$0, eia::new));

   @Override
   public ehx a() {
      return ehz.b;
   }

   @Nullable
   @Override
   public sw a(eel $$0) {
      return $$0.d().n().aG().a(this.b);
   }

   @Override
   public Set<egt<?>> b() {
      return ImmutableSet.of();
   }

   public agg c() {
      return this.b;
   }
}
