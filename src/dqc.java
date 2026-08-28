import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqc extends dmj implements dia {
   public static final MapCodec<dqc> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvc.q.fieldOf("color").forGetter(dqc::b), t()).apply($$0, dqc::new));
   private final cvc k;

   @Override
   public MapCodec<dqc> a() {
      return j;
   }

   public dqc(cvc $$0, dvn.d $$1) {
      super($$1);
      this.k = $$0;
      this.l(
         this.F
            .b()
            .b(a, Boolean.valueOf(false))
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
      );
   }

   @Override
   public cvc b() {
      return this.k;
   }
}
