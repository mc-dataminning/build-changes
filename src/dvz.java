import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvz extends dmm {
   public static final MapCodec<dvz> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxq.q.fieldOf("color").forGetter(dvz::b), t()).apply($$0, dvz::new));
   private final cxq c;

   @Override
   public MapCodec<dvz> a() {
      return b;
   }

   protected dvz(cxq $$0, dzn.d $$1) {
      super($$1);
      this.c = $$0;
   }

   public cxq b() {
      return this.c;
   }
}
