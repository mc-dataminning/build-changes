import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbk extends fam {
   public static final MapCodec<fbk> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(das.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, fbk::new));
   private final je<das> b;

   private fbk(List<fci> $$0, je<das> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fao<fbk> b() {
      return fap.F;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      $$0.a(kj.R, dau.a, this.b, dau::b);
      return $$0;
   }

   public static fam.a<?> a(je<das> $$0) {
      return a($$1 -> new fbk($$1, $$0));
   }
}
