import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record di(Optional<Boolean> c) implements bz {
   public static final MapCodec<di> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("sheared").forGetter(di::c)).apply($$0, di::new)
   );

   @Override
   public MapCodec<di> a() {
      return ca.f;
   }

   @Override
   public boolean a(bwt $$0, ars $$1, @Nullable ffq $$2) {
      return $$0 instanceof cmg $$3 ? !this.c.isPresent() || $$3.x() == this.c.get() : false;
   }

   public static di b() {
      return new di(Optional.of(false));
   }
}
