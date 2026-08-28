import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evx extends evt {
   public static final MapCodec<evx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eue.e.fieldOf("component").forGetter($$0x -> $$0x.b), evw.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, evx::new)
   );
   private final eud<?> b;
   private final evu c;

   private evx(List<exr> $$0, eud<?> $$1, evu $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evv<evx> b() {
      return evw.u;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      if ($$0.f()) {
         return $$0;
      } else {
         this.b.a($$0, $$1x -> this.c.apply($$1x, $$1));
         return $$0;
      }
   }

   @Override
   public void a(eum $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
