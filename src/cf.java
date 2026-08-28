import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cf(Optional<Boolean> d) implements ca {
   public static final cf b = new cf(Optional.empty());
   public static final MapCodec<cf> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("in_open_water").forGetter(cf::b)).apply($$0, cf::new)
   );

   public static cf a(boolean $$0) {
      return new cf(Optional.of($$0));
   }

   @Override
   public MapCodec<cf> a() {
      return cb.b;
   }

   @Override
   public boolean a(bxe $$0, asb $$1, @Nullable fgc $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof csz $$3 ? this.d.get() == $$3.e() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
