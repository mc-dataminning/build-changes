import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eus extends eug {
   public static final MapCodec<eus> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vd.j.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, eus::new));
   private final uf b;

   private eus(List<ewe> $$0, uf $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eui<eus> b() {
      return euj.j;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      cya.a(kr.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static eug.a<?> a(uf $$0) {
      return a($$1 -> new eus($$1, $$0));
   }
}
