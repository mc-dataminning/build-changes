import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dhu extends dec implements czt {
   public static final MapCodec<dhu> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpd.q.fieldOf("color").forGetter(dhu::b), u()).apply($$0, dhu::new));
   private final cpd k;

   @Override
   public MapCodec<dhu> a() {
      return j;
   }

   public dhu(cpd $$0, dna.d $$1) {
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
   public cpd b() {
      return this.k;
   }
}
