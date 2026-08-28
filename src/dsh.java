import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsh extends doo implements dkc {
   public static final MapCodec<dsh> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwl.q.fieldOf("color").forGetter(dsh::b), t()).apply($$0, dsh::new));
   private final cwl k;

   @Override
   public MapCodec<dsh> a() {
      return j;
   }

   public dsh(cwl $$0, dxt.d $$1) {
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
   public cwl b() {
      return this.k;
   }
}
