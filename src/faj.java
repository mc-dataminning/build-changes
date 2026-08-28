import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class faj extends faa {
   public static final MapCodec<faj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kh.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, faj::new)
   );
   private final kh b;

   private faj(List<fbw> $$0, kh $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fac<faj> b() {
      return fad.k;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> faa.a<?> a(ki<T> $$0, T $$1) {
      return a($$2 -> new faj($$2, kh.a().a($$0, $$1).a()));
   }
}
