import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;
import javax.annotation.Nullable;

public record etb(akm b) implements esz {
   public static final MapCodec<etb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(akm.a.fieldOf("source").forGetter(etb::c)).apply($$0, etb::new));

   @Override
   public esy a() {
      return eta.b;
   }

   @Nullable
   @Override
   public va a(epf $$0) {
      return $$0.d().o().aL().a(this.b);
   }

   @Override
   public Set<eru<?>> b() {
      return ImmutableSet.of();
   }

   public akm c() {
      return this.b;
   }
}
