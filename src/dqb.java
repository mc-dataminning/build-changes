import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqb extends dqv implements dia {
   public static final MapCodec<dqb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvc.q.fieldOf("color").forGetter(dqb::b), t()).apply($$0, dqb::new));
   private final cvc c;

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   public dqb(cvc $$0, dvn.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cvc b() {
      return this.c;
   }
}
