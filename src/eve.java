import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eve extends eug {
   public static final MapCodec<eve> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cxl.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eve::new));
   private final jn<cxl> b;

   private eve(List<ewe> $$0, jn<cxl> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eui<eve> b() {
      return euj.F;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      $$0.a(kr.I, cxn.a, this.b, cxn::b);
      return $$0;
   }

   public static eug.a<?> a(jn<cxl> $$0) {
      return a($$1 -> new eve($$1, $$0));
   }
}
