import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpx extends dme implements dhv {
   public static final MapCodec<dpx> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuy.q.fieldOf("color").forGetter(dpx::b), t()).apply($$0, dpx::new));
   private final cuy k;

   @Override
   public MapCodec<dpx> a() {
      return j;
   }

   public dpx(cuy $$0, dvi.d $$1) {
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
   public cuy b() {
      return this.k;
   }
}
