import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record by(Optional<Boolean> d) implements bt {
   public static final by b = new by(Optional.empty());
   public static final MapCodec<by> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(axu.a(Codec.BOOL, "in_open_water").forGetter(by::b)).apply($$0, by::new));

   public static by a(boolean $$0) {
      return new by(Optional.of($$0));
   }

   @Override
   public MapCodec<by> a() {
      return bu.b;
   }

   @Override
   public boolean a(brv $$0, aqt $$1, @Nullable ewu $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof cmn $$3 ? this.d.get() == $$3.p() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
