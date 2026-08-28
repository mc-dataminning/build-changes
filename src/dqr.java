import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqr extends djp implements dqp {
   public static final MapCodec<dqr> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvd.a.fieldOf("block_set_type").forGetter(djp::b), dqp.a.e.fieldOf("weathering_state").forGetter(dqr::l), u()).apply($$0, dqr::new)
   );
   private final dqp.a m;

   @Override
   public MapCodec<dqr> a() {
      return l;
   }

   protected dqr(dvd $$0, dqp.a $$1, dun.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$0.c(djp.f) == dvk.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(duo $$0) {
      return dqp.c($$0.b()).isPresent();
   }

   public dqp.a l() {
      return this.m;
   }
}
