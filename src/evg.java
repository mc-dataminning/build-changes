import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evg extends eug {
   public static final MapCodec<evg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(cyt.d.fieldOf("pages").forGetter($$0x -> $$0x.b), euf.a(100).forGetter($$0x -> $$0x.c))).apply($$0, evg::new)
   );
   private final List<arx<String>> b;
   private final euf c;

   protected evg(List<ewe> $$0, List<arx<String>> $$1, euf $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected cvl a(cvl $$0, est $$1) {
      $$0.a(kr.K, cyt.a, this::a);
      return $$0;
   }

   public cyt a(cyt $$0) {
      List<arx<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public eui<evg> b() {
      return euj.O;
   }
}
