import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtt extends dsc implements dtn {
   public static final MapCodec<dtt> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtn.a.e.fieldOf("weathering_state").forGetter(dlf::c), dxo.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dtt::new)
   );
   private final dtn.a K;

   @Override
   public MapCodec<dtt> a() {
      return J;
   }

   public dtt(dtn.a $$0, dxo $$1, dxn.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxo $$0) {
      return dtn.c($$0.b()).isPresent();
   }

   public dtn.a q() {
      return this.K;
   }
}
