import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ewg extends evp {
   public static final MapCodec<ewg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axq.b(lz.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ewg::new)
   );
   private final axq<cvu> b;

   private ewg(List<exn> $$0, axq<cvu> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public evr<ewg> b() {
      return evs.G;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      kd<cvu> $$2 = $$1.d().H_().e(lz.I);
      Optional<jq<cvu>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(ku.Z, $$3.get());
      }

      return $$0;
   }

   public static evp.a<?> a(axq<cvu> $$0) {
      return a($$1 -> new ewg($$1, $$0));
   }
}
