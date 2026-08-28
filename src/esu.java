import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esu extends erv {
   public static final MapCodec<esu> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(lp.i.r().fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, esu::new));
   private final ji<cwp> b;

   private esu(List<ett> $$0, ji<cwp> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public erx<esu> b() {
      return ery.F;
   }

   @Override
   public cuq a(cuq $$0, eqj $$1) {
      $$0.a(km.G, cwr.a, this.b, cwr::b);
      return $$0;
   }

   public static erv.a<?> a(ji<cwp> $$0) {
      return a($$1 -> new esu($$1, $$0));
   }
}
