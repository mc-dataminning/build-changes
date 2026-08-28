import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record ca(Optional<Boolean> d) implements bv {
   public static final ca b = new ca(Optional.empty());
   public static final MapCodec<ca> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("in_open_water").forGetter(ca::b)).apply($$0, ca::new)
   );

   public static ca a(boolean $$0) {
      return new ca(Optional.of($$0));
   }

   @Override
   public MapCodec<ca> a() {
      return bw.b;
   }

   @Override
   public boolean a(bss $$0, are $$1, @Nullable evp $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof cnj $$3 ? this.d.get() == $$3.p() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
