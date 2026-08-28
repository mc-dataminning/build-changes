import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsa extends doh implements djv {
   public static final MapCodec<dsa> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwh.q.fieldOf("color").forGetter(dsa::b), t()).apply($$0, dsa::new));
   private final cwh k;

   @Override
   public MapCodec<dsa> a() {
      return j;
   }

   public dsa(cwh $$0, dxm.d $$1) {
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
   public cwh b() {
      return this.k;
   }
}
