import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public record bu(Optional<Boolean> d) implements bq {
   public static final bu b = new bu(Optional.empty());
   public static final MapCodec<bu> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(atg.a(Codec.BOOL, "in_open_water").forGetter(bu::b)).apply($$0, bu::new));

   public static bu a(boolean $$0) {
      return new bu(Optional.of($$0));
   }

   @Override
   public bq.a a() {
      return bq.b.c;
   }

   @Override
   public boolean a(blf $$0, amp $$1, @Nullable elb $$2) {
      if (this.d.isEmpty()) {
         return true;
      } else {
         return $$0 instanceof cff $$3 ? this.d.get() == $$3.q() : false;
      }
   }

   public Optional<Boolean> b() {
      return this.d;
   }
}
