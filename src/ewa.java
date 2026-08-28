import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ewa extends evj {
   public static final MapCodec<ewa> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axp.b(ly.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ewa::new)
   );
   private final axp<cvq> b;

   private ewa(List<exh> $$0, axp<cvq> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evl<ewa> b() {
      return evm.G;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      kc<cvq> $$2 = $$1.d().H_().e(ly.I);
      Optional<jp<cvq>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kt.Y, $$3.get());
      }

      return $$0;
   }

   public static evj.a<?> a(axp<cvq> $$0) {
      return a($$1 -> new ewa($$1, $$0));
   }
}
