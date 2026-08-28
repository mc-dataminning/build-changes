import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class evh extends evj {
   public static final MapCodec<evh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(etv.a.fieldOf("limit").forGetter($$0x -> $$0x.b)).apply($$0, evh::new));
   private final etv b;

   private evh(List<exh> $$0, etv $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evl<evh> b() {
      return evm.w;
   }

   @Override
   public Set<ewp<?>> a() {
      return this.b.a();
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      int $$2 = this.b.a($$1, $$0.L());
      $$0.e($$2);
      return $$0;
   }

   public static evj.a<?> a(etv $$0) {
      return a($$1 -> new evh($$1, $$0));
   }
}
