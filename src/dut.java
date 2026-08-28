import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dut extends dvs implements dmi {
   public static final MapCodec<dut> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyl.q.fieldOf("color").forGetter(dut::b), t()).apply($$0, dut::new));
   private final cyl c;

   @Override
   public MapCodec<dut> a() {
      return a;
   }

   public dut(cyl $$0, eas.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cyl b() {
      return this.c;
   }
}
