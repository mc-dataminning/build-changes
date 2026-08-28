import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eyl extends exu {
   public static final MapCodec<eyl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ayk.b(mb.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eyl::new)
   );
   private final ayk<cxd> b;

   private eyl(List<ezs> $$0, ayk<cxd> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exw<eyl> b() {
      return exx.G;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      kd<cxd> $$2 = $$1.d().K_().e(mb.I);
      Optional<jq<cxd>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(ku.Z, $$3.get());
      }

      return $$0;
   }

   public static exu.a<?> a(ayk<cxd> $$0) {
      return a($$1 -> new eyl($$1, $$0));
   }
}
