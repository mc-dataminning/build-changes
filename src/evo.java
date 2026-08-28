import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evo extends evt {
   public static final MapCodec<evo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(cu.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), evw.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
            .apply($$0, evo::new)
   );
   private final cu b;
   private final evu c;

   private evo(List<exr> $$0, cu $$1, evu $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evv<evo> b() {
      return evw.v;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(eum $$0) {
      super.a($$0);
      this.c.a($$0.a(".modifier"));
   }
}
