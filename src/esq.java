import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esq extends erv {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(alc.a(lq.G).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, esq::new)
   );
   private final ji<cul> b;

   private esq(List<ett> $$0, ji<cul> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erx<esq> b() {
      return ery.f;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      return $$0.a(this.b.a(), $$0.I());
   }
}
