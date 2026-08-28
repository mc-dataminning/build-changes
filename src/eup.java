import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record eup(akk b) implements eun {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akk.a.fieldOf("source").forGetter(eup::c)).apply($$0, eup::new));

   @Override
   public eum a() {
      return euo.b;
   }

   @Nullable
   @Override
   public uu a(eqo $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<eth<?>> b() {
      return ImmutableSet.of();
   }

   public akk c() {
      return this.b;
   }
}
