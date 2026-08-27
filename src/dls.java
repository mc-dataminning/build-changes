import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dls extends dmm implements ddr {
   public static final MapCodec<dls> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csj.q.fieldOf("color").forGetter(dls::b), u()).apply($$0, dls::new));
   private final csj c;

   @Override
   public MapCodec<dls> a() {
      return a;
   }

   public dls(csj $$0, drc.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public csj b() {
      return this.c;
   }
}
