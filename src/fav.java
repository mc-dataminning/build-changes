import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fav extends fam {
   public static final MapCodec<fav> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kh.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, fav::new)
   );
   private final kh b;

   private fav(List<fci> $$0, kh $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fao<fav> b() {
      return fap.k;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> fam.a<?> a(ki<T> $$0, T $$1) {
      return a($$2 -> new fav($$2, kh.a().a($$0, $$1).a()));
   }
}
