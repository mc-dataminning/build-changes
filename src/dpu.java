import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpu extends dgp implements cts {
   public static final MapCodec<dpu> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cti.q.fieldOf("color").forGetter(dpu::b), u()).apply($$0, dpu::new));
   private final cti d;

   @Override
   public MapCodec<dpu> a() {
      return c;
   }

   protected dpu(cti $$0, dtb.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cti b() {
      return this.d;
   }

   @Override
   public bsy m() {
      return bsy.g;
   }

   @Override
   public jm<avo> n() {
      return avp.og;
   }
}
