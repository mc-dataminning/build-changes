import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cc(Optional<Boolean> d) implements bx {
   public static final cc b = new cc(Optional.empty());
   public static final MapCodec<cc> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("in_open_water").forGetter(cc::b)).apply($$0, cc::new)
   );

   public static cc a(boolean $$0) {
      return new cc(Optional.of($$0));
   }

   @Override
   public MapCodec<cc> a() {
      return by.b;
   }

   @Override
   public boolean a(bvb $$0, arx $$1, @Nullable fbr $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof cqd $$3 ? this.d.get() == $$3.l() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
