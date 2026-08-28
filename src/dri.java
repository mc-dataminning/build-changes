import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dri extends dnn implements djb {
   public static final MapCodec<dri> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvk.q.fieldOf("color").forGetter(dri::b), t()).apply($$0, dri::new));
   private final cvk k;

   @Override
   public MapCodec<dri> a() {
      return j;
   }

   public dri(cvk $$0, dwu.d $$1) {
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
   public cvk b() {
      return this.k;
   }
}
