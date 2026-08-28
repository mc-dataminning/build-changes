import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record evs(akr b) implements evq {
   public static final MapCodec<evs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akr.a.fieldOf("source").forGetter(evs::c)).apply($$0, evs::new));

   @Override
   public evp a() {
      return evr.b;
   }

   @Nullable
   @Override
   public uy a(err $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<euk<?>> b() {
      return ImmutableSet.of();
   }

   public akr c() {
      return this.b;
   }
}
