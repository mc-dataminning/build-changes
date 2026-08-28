import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fbd extends fam {
   public static final MapCodec<fbd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axr.b(mg.aT).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, fbd::new)
   );
   private final axr<cyr> b;

   private fbd(List<fci> $$0, axr<cyr> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fao<fbd> b() {
      return fap.G;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      jr<cyr> $$2 = $$1.d().F_().f(mg.aT);
      Optional<je<cyr>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kj.ab, new dbo($$3.get()));
      }

      return $$0;
   }

   public static fam.a<?> a(axr<cyr> $$0) {
      return a($$1 -> new fbd($$1, $$0));
   }
}
