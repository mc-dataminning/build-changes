import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fbs extends fbb {
   public static final MapCodec<fbs> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axr.b(mh.aU).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, fbs::new)
   );
   private final axr<czd> b;

   private fbs(List<fcx> $$0, axr<czd> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fbd<fbs> b() {
      return fbe.G;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      js<czd> $$2 = $$1.d().F_().f(mh.aU);
      Optional<jf<czd>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kk.ab, new dca($$3.get()));
      }

      return $$0;
   }

   public static fbb.a<?> a(axr<czd> $$0) {
      return a($$1 -> new fbs($$1, $$0));
   }
}
