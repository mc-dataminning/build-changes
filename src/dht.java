import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dht extends din implements czt {
   public static final MapCodec<dht> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpd.q.fieldOf("color").forGetter(dht::b), u()).apply($$0, dht::new));
   private final cpd c;

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   public dht(cpd $$0, dna.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public cpd b() {
      return this.c;
   }
}
