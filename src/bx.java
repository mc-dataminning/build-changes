import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bx(Optional<Boolean> d) implements bs {
   public static final bx b = new bx(Optional.empty());
   public static final MapCodec<bx> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("in_open_water").forGetter(bx::b)).apply($$0, bx::new)
   );

   public static bx a(boolean $$0) {
      return new bx(Optional.of($$0));
   }

   @Override
   public MapCodec<bx> a() {
      return bt.b;
   }

   @Override
   public boolean a(brw $$0, aqn $$1, @Nullable eum $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof cmm $$3 ? this.d.get() == $$3.p() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
