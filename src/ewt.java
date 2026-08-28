import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewt extends evt {
   public static final MapCodec<ewt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(czm.d.fieldOf("pages").forGetter($$0x -> $$0x.b), evs.a(100).forGetter($$0x -> $$0x.c))).apply($$0, ewt::new)
   );
   private final List<asi<String>> b;
   private final evs c;

   protected ewt(List<exr> $$0, List<asi<String>> $$1, evs $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cwf a(cwf $$0, eug $$1) {
      $$0.a(ku.S, czm.a, this::a);
      return $$0;
   }

   public czm a(czm $$0) {
      List<asi<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public evv<ewt> b() {
      return evw.O;
   }
}
