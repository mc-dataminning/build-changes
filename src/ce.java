import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ce(Optional<Boolean> d) implements bz {
   public static final ce b = new ce(Optional.empty());
   public static final MapCodec<ce> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("in_open_water").forGetter(ce::b)).apply($$0, ce::new)
   );

   public static ce a(boolean $$0) {
      return new ce(Optional.of($$0));
   }

   @Override
   public MapCodec<ce> a() {
      return ca.b;
   }

   @Override
   public boolean a(bwi $$0, arq $$1, @Nullable ffc $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof csd $$3 ? this.d.get() == $$3.f() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
