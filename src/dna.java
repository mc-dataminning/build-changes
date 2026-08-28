import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dna extends dji implements dey {
   public static final MapCodec<dna> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csv.q.fieldOf("color").forGetter(dna::b), u()).apply($$0, dna::new));
   private final csv k;

   @Override
   public MapCodec<dna> a() {
      return j;
   }

   public dna(csv $$0, dsj.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public csv b() {
      return this.k;
   }
}
