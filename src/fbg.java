import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbg extends fam {
   public static final MapCodec<fbg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cyu.e.fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, fbg::new));
   private final je<cyu> b;

   private fbg(List<fci> $$0, je<cyu> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fao<fbg> b() {
      return fap.f;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      return $$0.a(this.b.a());
   }
}
