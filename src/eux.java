import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eux extends eug {
   public static final MapCodec<eux> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axi.b(lv.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eux::new)
   );
   private final axi<cvd> b;

   private eux(List<ewe> $$0, axi<cvd> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eui<eux> b() {
      return euj.G;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      ka<cvd> $$2 = $$1.d().F_().d(lv.I);
      Optional<jn<cvd>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kr.R, $$3.get());
      }

      return $$0;
   }

   public static eug.a<?> a(axi<cvd> $$0) {
      return a($$1 -> new eux($$1, $$0));
   }
}
