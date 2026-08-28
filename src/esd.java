import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class esd extends erp {
   static final MapCodec<esd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(euj.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, esd::new));
   private final eui b;

   private esd(List<etn> $$0, eui $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<esw<?>> a() {
      return this.b.a();
   }

   @Override
   public err<esd> b() {
      return ers.R;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      $$0.b(km.n, new cxa(this.b.a($$1)));
      return $$0;
   }
}
