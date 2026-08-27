import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dkw extends dlq implements dcv {
   public static final MapCodec<dkw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(crs.q.fieldOf("color").forGetter(dkw::b), u()).apply($$0, dkw::new));
   private final crs c;

   @Override
   public MapCodec<dkw> a() {
      return a;
   }

   public dkw(crs $$0, dqg.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public crs b() {
      return this.c;
   }
}
