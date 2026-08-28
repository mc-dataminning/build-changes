import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtu extends dsv implements dtn {
   public static final MapCodec<dtu> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyd.a.fieldOf("block_set_type").forGetter(dsv::q), dtn.a.e.fieldOf("weathering_state").forGetter(dtu::r), t()).apply($$0, dtu::new)
   );
   private final dtn.a n;

   @Override
   public MapCodec<dtu> a() {
      return m;
   }

   protected dtu(dyd $$0, dtn.a $$1, dxn.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxo $$0) {
      return dtn.c($$0.b()).isPresent();
   }

   public dtn.a r() {
      return this.n;
   }
}
