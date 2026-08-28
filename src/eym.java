import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class eym extends exv {
   public static final MapCodec<eym> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(aya.b(mb.I).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eym::new)
   );
   private final aya<cwz> b;

   private eym(List<ezr> $$0, aya<cwz> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exx<eym> b() {
      return exy.G;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      kd<cwz> $$2 = $$1.d().K_().e(mb.I);
      Optional<jq<cwz>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(ku.Z, $$3.get());
      }

      return $$0;
   }

   public static exv.a<?> a(aya<cwz> $$0) {
      return a($$1 -> new eym($$1, $$0));
   }
}
