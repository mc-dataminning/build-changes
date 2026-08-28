import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dh(Optional<Boolean> c) implements by {
   public static final MapCodec<dh> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("sheared").forGetter(dh::c)).apply($$0, dh::new)
   );

   @Override
   public MapCodec<dh> a() {
      return bz.f;
   }

   @Override
   public boolean a(bwf $$0, arq $$1, @Nullable feq $$2) {
      return $$0 instanceof cjw $$3 ? !this.c.isPresent() || $$3.x() == this.c.get() : false;
   }

   public static dh b() {
      return new dh(Optional.of(false));
   }
}
