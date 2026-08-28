import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dse extends dja {
   public static final MapCodec<dse> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvc.q.fieldOf("color").forGetter(dse::b), t()).apply($$0, dse::new));
   private final cvc d;

   @Override
   public MapCodec<dse> a() {
      return c;
   }

   protected dse(cvc $$0, dvn.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cvc b() {
      return this.d;
   }
}
