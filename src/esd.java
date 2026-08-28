import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esd extends ert {
   public static final MapCodec<esd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kj.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, esd::new)
   );
   private final kj b;

   private esd(List<etr> $$0, kj $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erv<esd> b() {
      return erw.k;
   }

   @Override
   public cuo a(cuo $$0, eqh $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> ert.a<?> a(kl<T> $$0, T $$1) {
      return a($$2 -> new esd($$2, kj.a().a($$0, $$1).a()));
   }
}
