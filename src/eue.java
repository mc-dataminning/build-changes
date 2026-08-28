import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eue extends eug {
   public static final MapCodec<eue> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(ess.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, eue::new));
   private final ess b;

   private eue(List<ewe> $$0, ess $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eui<eue> b() {
      return euj.w;
   }

   @Override
   public Set<evm<?>> a() {
      return this.b.a();
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      int $$2 = this.b.a($$1, $$0.J());
      $$0.e($$2);
      return $$0;
   }

   public static eug.a<?> a(ess $$0) {
      return a($$1 -> new eue($$1, $$0));
   }
}
