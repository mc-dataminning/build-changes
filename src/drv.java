import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drv extends dqw implements dro {
   public static final MapCodec<drv> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwd.a.fieldOf("block_set_type").forGetter(dqw::q), dro.a.e.fieldOf("weathering_state").forGetter(drv::r), t()).apply($$0, drv::new)
   );
   private final dro.a n;

   @Override
   public MapCodec<drv> a() {
      return m;
   }

   protected drv(dwd $$0, dro.a $$1, dvn.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dvo $$0, arq $$1, jh $$2, azv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvo $$0) {
      return dro.c($$0.b()).isPresent();
   }

   public dro.a r() {
      return this.n;
   }
}
