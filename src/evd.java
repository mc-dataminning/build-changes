import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evd extends eug {
   static final MapCodec<evd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(exb.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, evd::new));
   private final exa b;

   private evd(List<ewe> $$0, exa $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<evm<?>> a() {
      return this.b.a();
   }

   @Override
   public eui<evd> b() {
      return euj.Q;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      int $$2 = azc.a(this.b.a($$1), 0, 4);
      $$0.b(kr.S, $$2);
      return $$0;
   }

   public exa c() {
      return this.b;
   }

   public static eug.a<?> a(exa $$0) {
      return a($$1 -> new evd($$1, $$0));
   }
}
