import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class fbl extends fau {
   public static final MapCodec<fbl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(axr.b(mg.aU).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, fbl::new)
   );
   private final axr<cyw> b;

   private fbl(List<fcq> $$0, axr<cyw> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public faw<fbl> b() {
      return fax.G;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      jr<cyw> $$2 = $$1.d().F_().f(mg.aU);
      Optional<je<cyw>> $$3 = $$2.a(this.b, $$1.b());
      if ($$3.isPresent()) {
         $$0.b(kj.ab, new dbt($$3.get()));
      }

      return $$0;
   }

   public static fau.a<?> a(axr<cyw> $$0) {
      return a($$1 -> new fbl($$1, $$0));
   }
}
