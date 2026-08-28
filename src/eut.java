import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eut extends eug {
   static final MapCodec<eut> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(exb.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, eut::new));
   private final exa b;

   private eut(List<ewe> $$0, exa $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<evm<?>> a() {
      return this.b.a();
   }

   @Override
   public eui<eut> b() {
      return euj.R;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      $$0.b(kr.o, new cyb(this.b.a($$1)));
      return $$0;
   }
}
