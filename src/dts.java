import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dts extends drl implements dtn {
   public static final MapCodec<dts> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtn.a.e.fieldOf("weathering_state").forGetter(dlf::c), t()).apply($$0, dts::new)
   );
   private final dtn.a g;

   @Override
   public MapCodec<dts> a() {
      return f;
   }

   public dts(dtn.a $$0, dxn.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
