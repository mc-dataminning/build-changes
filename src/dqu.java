import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqu extends don implements dqp {
   public static final MapCodec<dqu> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dqp.a.e.fieldOf("weathering_state").forGetter(dik::c), u()).apply($$0, dqu::new)
   );
   private final dqp.a g;

   @Override
   public MapCodec<dqu> a() {
      return f;
   }

   public dqu(dqp.a $$0, dun.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
