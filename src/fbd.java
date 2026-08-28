import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbd extends fau {
   public static final MapCodec<fbd> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(kh.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, fbd::new)
   );
   private final kh b;

   private fbd(List<fcq> $$0, kh $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public faw<fbd> b() {
      return fax.k;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> fau.a<?> a(ki<T> $$0, T $$1) {
      return a($$2 -> new fbd($$2, kh.a().a($$0, $$1).a()));
   }
}
