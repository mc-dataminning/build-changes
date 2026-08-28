import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqv extends dpe implements dqp {
   public static final MapCodec<dqv> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqp.a.e.fieldOf("weathering_state").forGetter(dik::c), duo.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), u()).apply($$0, dqv::new)
   );
   private final dqp.a K;

   @Override
   public MapCodec<dqv> a() {
      return J;
   }

   public dqv(dqp.a $$0, duo $$1, dun.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(duo $$0) {
      return dqp.c($$0.b()).isPresent();
   }

   public dqp.a l() {
      return this.K;
   }
}
