import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fay extends faa {
   public static final MapCodec<fay> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(dam.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, fay::new));
   private final je<dam> b;

   private fay(List<fbw> $$0, je<dam> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fac<fay> b() {
      return fad.F;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      $$0.a(kj.R, dao.a, this.b, dao::b);
      return $$0;
   }

   public static faa.a<?> a(je<dam> $$0) {
      return a($$1 -> new fay($$1, $$0));
   }
}
