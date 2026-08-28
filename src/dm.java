import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record dm(cv.d c) implements by {
   public static final MapCodec<dm> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cv.d.d.optionalFieldOf("size", cv.d.c).forGetter(dm::b)).apply($$0, dm::new)
   );

   public static dm a(cv.d $$0) {
      return new dm($$0);
   }

   @Override
   public boolean a(bwd $$0, arq $$1, @Nullable fei $$2) {
      return $$0 instanceof coi $$3 ? this.c.d($$3.go()) : false;
   }

   @Override
   public MapCodec<dm> a() {
      return bz.d;
   }

   public cv.d b() {
      return this.c;
   }
}
