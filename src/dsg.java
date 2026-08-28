import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsg extends dta implements dkc {
   public static final MapCodec<dsg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwl.q.fieldOf("color").forGetter(dsg::b), t()).apply($$0, dsg::new));
   private final cwl c;

   @Override
   public MapCodec<dsg> a() {
      return a;
   }

   public dsg(cwl $$0, dxt.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cwl b() {
      return this.c;
   }
}
