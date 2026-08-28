import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record cb(Optional<Boolean> d) implements bw {
   public static final cb b = new cb(Optional.empty());
   public static final MapCodec<cb> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("in_open_water").forGetter(cb::b)).apply($$0, cb::new)
   );

   public static cb a(boolean $$0) {
      return new cb(Optional.of($$0));
   }

   @Override
   public MapCodec<cb> a() {
      return bx.b;
   }

   @Override
   public boolean a(btr $$0, arj $$1, @Nullable eyw $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof com $$3 ? this.d.get() == $$3.m() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
