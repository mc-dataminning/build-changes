import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exm extends exd {
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ks.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, exm::new)
   );
   private final ks b;

   private exm(List<eyz> $$0, ks $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exf<exm> b() {
      return exg.k;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> exd.a<?> a(ku<T> $$0, T $$1) {
      return a($$2 -> new exm($$2, ks.a().a($$0, $$1).a()));
   }
}
