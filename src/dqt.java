import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqt extends dqo implements dqp {
   public static final MapCodec<dqt> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqp.a.e.fieldOf("weathering_state").forGetter(dqt::l), u()).apply($$0, dqt::new)
   );
   private final dqp.a f;

   @Override
   protected MapCodec<dqt> a() {
      return e;
   }

   protected dqt(dqp.a $$0, dun.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
