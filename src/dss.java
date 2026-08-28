import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dss extends dto implements dkl {
   public static final MapCodec<dss> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwv.q.fieldOf("color").forGetter(dss::b), t()).apply($$0, dss::new));
   private final cwv c;

   @Override
   public MapCodec<dss> a() {
      return a;
   }

   public dss(cwv $$0, dyl.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cwv b() {
      return this.c;
   }
}
