import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drt extends dip {
   public static final MapCodec<drt> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuu.q.fieldOf("color").forGetter(drt::b), t()).apply($$0, drt::new));
   private final cuu d;

   @Override
   public MapCodec<drt> a() {
      return c;
   }

   protected drt(cuu $$0, dvc.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cuu b() {
      return this.d;
   }
}
