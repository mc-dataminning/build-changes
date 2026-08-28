import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fcx extends fcg {
   public static final MapCodec<fcx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ayc.b(mi.aU).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, fcx::new)
   );
   private final ayc<dad> b;

   private fcx(List<fec> $$0, ayc<dad> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fci<fcx> b() {
      return fcj.G;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      jt<dad> $$2 = $$1.d().J_().f(mi.aU);
      Optional<jg<dad>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kl.ab, new dda($$3.get()));
      }

      return $$0;
   }

   public static fcg.a<?> a(ayc<dad> $$0) {
      return a($$1 -> new fcx($$1, $$0));
   }
}
