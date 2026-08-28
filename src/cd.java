import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cd(Optional<Boolean> d) implements by {
   public static final cd b = new cd(Optional.empty());
   public static final MapCodec<cd> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("in_open_water").forGetter(cd::b)).apply($$0, cd::new)
   );

   public static cd a(boolean $$0) {
      return new cd(Optional.of($$0));
   }

   @Override
   public MapCodec<cd> a() {
      return bz.b;
   }

   @Override
   public boolean a(bva $$0, ard $$1, @Nullable fbx $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof cqg $$3 ? this.d.get() == $$3.f() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
