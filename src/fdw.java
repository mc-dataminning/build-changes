import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fdw(dgh b) implements fdy {
   public static final MapCodec<fdw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dgh.b.fieldOf("amount").forGetter(fdw::c)).apply($$0, fdw::new));

   @Override
   public float b(ezt $$0) {
      int $$1 = $$0.b(fcn.k);
      return this.b.a($$1);
   }

   @Override
   public fdx b() {
      return fdz.g;
   }

   public static fdw a(dgh $$0) {
      return new fdw($$0);
   }

   public dgh c() {
      return this.b;
   }
}
