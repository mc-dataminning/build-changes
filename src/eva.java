import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eva extends eug {
   public static final MapCodec<eva> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(aky.a(lv.K).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, eva::new)
   );
   private final jn<cvg> b;

   private eva(List<ewe> $$0, jn<cvg> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eui<eva> b() {
      return euj.f;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      return $$0.a(this.b.a());
   }
}
