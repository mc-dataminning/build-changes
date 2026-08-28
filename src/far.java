import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class far extends faa {
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axp.b(mg.aS).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, far::new)
   );
   private final axp<cyl> b;

   private far(List<fbw> $$0, axp<cyl> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fac<far> b() {
      return fad.G;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      jr<cyl> $$2 = $$1.d().F_().f(mg.aS);
      Optional<je<cyl>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kj.ab, new dbi($$3.get()));
      }

      return $$0;
   }

   public static faa.a<?> a(axp<cyl> $$0) {
      return a($$1 -> new far($$1, $$0));
   }
}
