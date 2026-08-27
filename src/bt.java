import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bt(Optional<Boolean> d) implements bp {
   public static final bt b = new bt(Optional.empty());
   public static final MapCodec<bt> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(aqy.a(Codec.BOOL, "in_open_water").forGetter(bt::b)).apply($$0, bt::new));

   public static bt a(boolean $$0) {
      return new bt(Optional.of($$0));
   }

   @Override
   public bp.a a() {
      return bp.b.c;
   }

   @Override
   public boolean a(bii $$0, akk $$1, @Nullable ehd $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof cca $$3 ? this.d.get() == $$3.j() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
