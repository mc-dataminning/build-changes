import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evw extends evj {
   static final MapCodec<evw> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(eye.a.fieldOf("value").forGetter($$0x -> $$0x.b)).apply($$0, evw::new));
   private final eyd b;

   private evw(List<exh> $$0, eyd $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.a();
   }

   @Override
   public evl<evw> b() {
      return evm.R;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      $$0.b(kt.p, new cyh(this.b.a($$1)));
      return $$0;
   }
}
