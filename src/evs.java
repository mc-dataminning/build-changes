import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class evs extends euu {
   public static final MapCodec<evs> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cxm.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, evs::new));
   private final jn<cxm> b;

   private evs(List<ews> $$0, jn<cxm> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public euw<evs> b() {
      return eux.F;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      $$0.a(kr.L, cxo.a, this.b, cxo::b);
      return $$0;
   }

   public static euu.a<?> a(jn<cxm> $$0) {
      return a($$1 -> new evs($$1, $$0));
   }
}
