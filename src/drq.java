import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drq extends dkp implements dro {
   public static final MapCodec<drq> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwd.a.fieldOf("block_set_type").forGetter(dkp::b), dro.a.e.fieldOf("weathering_state").forGetter(drq::q), t()).apply($$0, drq::new)
   );
   private final dro.a m;

   @Override
   public MapCodec<drq> a() {
      return l;
   }

   protected drq(dwd $$0, dro.a $$1, dvn.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$0.c(dkp.f) == dwj.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dvo $$0) {
      return dro.c($$0.b()).isPresent();
   }

   public dro.a q() {
      return this.m;
   }
}
