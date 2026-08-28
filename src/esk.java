import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esk extends erp {
   public static final MapCodec<esk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(aky.a(lq.G).fieldOf("item").forGetter($$0x -> $$0x.b)).apply($$0, esk::new)
   );
   private final ji<cuf> b;

   private esk(List<etn> $$0, ji<cuf> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public err<esk> b() {
      return ers.f;
   }

   @Override
   public cuk a(cuk $$0, eqd $$1) {
      return $$0.a(this.b.a(), $$0.I());
   }
}
