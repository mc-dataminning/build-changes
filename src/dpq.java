import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpq extends dqk implements dhp {
   public static final MapCodec<dpq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuu.q.fieldOf("color").forGetter(dpq::b), t()).apply($$0, dpq::new));
   private final cuu c;

   @Override
   public MapCodec<dpq> a() {
      return a;
   }

   public dpq(cuu $$0, dvc.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cuu b() {
      return this.c;
   }
}
