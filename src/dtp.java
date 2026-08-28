import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtp extends dmk implements dtn {
   public static final MapCodec<dtp> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyd.a.fieldOf("block_set_type").forGetter(dmk::b), dtn.a.e.fieldOf("weathering_state").forGetter(dtp::q), t()).apply($$0, dtp::new)
   );
   private final dtn.a m;

   @Override
   public MapCodec<dtp> a() {
      return l;
   }

   protected dtp(dyd $$0, dtn.a $$1, dxn.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$0.c(dmk.f) == dyj.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dxo $$0) {
      return dtn.c($$0.b()).isPresent();
   }

   public dtn.a q() {
      return this.m;
   }
}
