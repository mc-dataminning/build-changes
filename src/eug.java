import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eug extends euo {
   public static final MapCodec<eug> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a.fieldOf("name").forGetter($$0x -> $$0x.j)).and(b($$0)).apply($$0, eug::new)
   );
   private final alh j;

   private eug(alh $$0, int $$1, int $$2, List<exh> $$3, List<evk> $$4) {
      super($$1, $$2, $$3, $$4);
      this.j = $$0;
   }

   @Override
   public eun a() {
      return euk.e;
   }

   @Override
   public void a(Consumer<cvx> $$0, etw $$1) {
      $$1.a(this.j, $$0);
   }

   public static euo.a<?> a(alh $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eug($$0, $$1, $$2, $$3, $$4));
   }
}
