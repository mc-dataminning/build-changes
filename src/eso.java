import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eso extends erp {
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(lp.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eso::new));
   private final ji<cwj> b;

   private eso(List<etn> $$0, ji<cwj> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public err<eso> b() {
      return ers.F;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      $$0.a(km.F, cwl.a, this.b, cwl::b);
      return $$0;
   }

   public static erp.a<?> a(ji<cwj> $$0) {
      return a($$1 -> new eso($$1, $$0));
   }
}
