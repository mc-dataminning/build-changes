import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ewr extends ewa {
   public static final MapCodec<ewr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axs.b(ma.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, ewr::new)
   );
   private final axs<cwf> b;

   private ewr(List<exy> $$0, axs<cwf> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ewc<ewr> b() {
      return ewd.G;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      kd<cwf> $$2 = $$1.d().J_().e(ma.I);
      Optional<jq<cwf>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(ku.Z, $$3.get());
      }

      return $$0;
   }

   public static ewa.a<?> a(axs<cwf> $$0) {
      return a($$1 -> new ewr($$1, $$0));
   }
}
