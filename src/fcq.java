import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fcq(dfm b) implements fcs {
   public static final MapCodec<fcq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfm.b.fieldOf("amount").forGetter(fcq::c)).apply($$0, fcq::new));

   @Override
   public float b(eyn $$0) {
      int $$1 = $$0.b(fbh.k);
      return this.b.a($$1);
   }

   @Override
   public fcr b() {
      return fct.g;
   }

   public static fcq a(dfm $$0) {
      return new fcq($$0);
   }

   public dfm c() {
      return this.b;
   }
}
