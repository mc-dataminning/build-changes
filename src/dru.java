import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dru extends dqd implements dro {
   public static final MapCodec<dru> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dro.a.e.fieldOf("weathering_state").forGetter(djk::c), dvo.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dru::new)
   );
   private final dro.a K;

   @Override
   public MapCodec<dru> a() {
      return J;
   }

   public dru(dro.a $$0, dvo $$1, dvn.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvo $$0) {
      return dro.c($$0.b()).isPresent();
   }

   public dro.a q() {
      return this.K;
   }
}
