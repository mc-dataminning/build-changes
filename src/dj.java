import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dj(Optional<Boolean> c) implements ca {
   public static final MapCodec<dj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("sheared").forGetter(dj::c)).apply($$0, dj::new)
   );

   @Override
   public MapCodec<dj> a() {
      return cb.f;
   }

   @Override
   public boolean a(bxe $$0, asb $$1, @Nullable fgc $$2) {
      return $$0 instanceof cmr $$3 ? !this.c.isPresent() || $$3.u() == this.c.get() : false;
   }

   public static dj b() {
      return new dj(Optional.of(false));
   }
}
