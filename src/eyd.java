import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyd extends exf {
   public static final MapCodec<eyd> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(cyn.a.fieldOf("id").forGetter($$0x -> $$0x.b)).apply($$0, eyd::new));
   private final jr<cyn> b;

   private eyd(List<ezb> $$0, jr<cyn> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public exh<eyd> b() {
      return exi.F;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      $$0.a(kv.Q, cyp.a, this.b, cyp::b);
      return $$0;
   }

   public static exf.a<?> a(jr<cyn> $$0) {
      return a($$1 -> new eyd($$1, $$0));
   }
}
