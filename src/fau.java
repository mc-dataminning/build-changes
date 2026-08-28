import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fau extends faa {
   public static final MapCodec<fau> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cyo.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, fau::new));
   private final je<cyo> b;

   private fau(List<fbw> $$0, je<cyo> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fac<fau> b() {
      return fad.f;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      return $$0.a(this.b.a());
   }
}
