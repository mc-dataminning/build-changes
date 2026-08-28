import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duj extends dld {
   public static final MapCodec<duj> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwl.q.fieldOf("color").forGetter(duj::b), t()).apply($$0, duj::new));
   private final cwl d;

   @Override
   public MapCodec<duj> a() {
      return c;
   }

   protected duj(cwl $$0, dxt.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cwl b() {
      return this.d;
   }
}
