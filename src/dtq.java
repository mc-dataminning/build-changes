import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtq extends dkd implements dtn {
   public static final MapCodec<dtq> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtn.a.e.fieldOf("weathering_state").forGetter(dlf::c), t()).apply($$0, dtq::new)
   );
   private final dtn.a e;

   @Override
   public MapCodec<dtq> a() {
      return d;
   }

   public dtq(dtn.a $$0, dxn.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
