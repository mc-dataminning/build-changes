import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enq extends enj {
   public static final MapCodec<enq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, enq::new)
   );
   private final int c;

   private enq(int $$0) {
      this.c = $$0;
   }

   public static enq a(int $$0) {
      return new enq($$0);
   }

   @Override
   protected boolean a(eni $$0, bac $$1, jh $$2) {
      int $$3 = $$0.a(edj.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(edj.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public enl<?> b() {
      return enl.d;
   }
}
