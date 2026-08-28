import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eys extends eyb {
   public static final MapCodec<eys> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ayk.b(mb.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eys::new)
   );
   private final ayk<cxh> b;

   private eys(List<ezx> $$0, ayk<cxh> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eyd<eys> b() {
      return eye.G;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      kd<cxh> $$2 = $$1.d().K_().e(mb.I);
      Optional<jq<cxh>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(ku.Z, $$3.get());
      }

      return $$0;
   }

   public static eyb.a<?> a(ayk<cxh> $$0) {
      return a($$1 -> new eys($$1, $$0));
   }
}
