import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exl extends exc {
   public static final MapCodec<exl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(ks.b.fieldOf("components").forGetter($$0x -> $$0x.b)).apply($$0, exl::new)
   );
   private final ks b;

   private exl(List<eyy> $$0, ks $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exe<exl> b() {
      return exf.k;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      $$0.a(this.b);
      return $$0;
   }

   public static <T> exc.a<?> a(ku<T> $$0, T $$1) {
      return a($$2 -> new exl($$2, ks.a().a($$0, $$1).a()));
   }
}
