import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eyt extends eyc {
   public static final MapCodec<eyt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ayk.b(mb.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eyt::new)
   );
   private final ayk<cxi> b;

   private eyt(List<ezy> $$0, ayk<cxi> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eye<eyt> b() {
      return eyf.G;
   }

   @Override
   public cxp a(cxp $$0, ewp $$1) {
      kd<cxi> $$2 = $$1.d().K_().e(mb.I);
      Optional<jq<cxi>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(ku.Z, $$3.get());
      }

      return $$0;
   }

   public static eyc.a<?> a(ayk<cxi> $$0) {
      return a($$1 -> new eyt($$1, $$0));
   }
}
