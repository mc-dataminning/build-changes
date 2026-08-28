import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class est extends eru {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(lp.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, est::new));
   private final ji<cwo> b;

   private est(List<ets> $$0, ji<cwo> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erw<est> b() {
      return erx.F;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      $$0.a(km.G, cwq.a, this.b, cwq::b);
      return $$0;
   }

   public static eru.a<?> a(ji<cwo> $$0) {
      return a($$1 -> new est($$1, $$0));
   }
}
