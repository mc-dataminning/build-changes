import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record dx(Optional<Boolean> c) implements by {
   public static final MapCodec<dx> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("sheared").forGetter(dx::c)).apply($$0, dx::new)
   );

   @Override
   public MapCodec<dx> a() {
      return bz.f;
   }

   @Override
   public boolean a(bvs $$0, arn $$1, @Nullable fcu $$2) {
      return $$0 instanceof cje $$3 ? !this.c.isPresent() || $$3.x() == this.c.get() : false;
   }

   public static dx b() {
      return new dx(Optional.of(false));
   }
}
