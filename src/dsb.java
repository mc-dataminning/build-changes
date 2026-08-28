import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsb extends dqk implements drv {
   public static final MapCodec<dsb> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drv.a.e.fieldOf("weathering_state").forGetter(djr::c), dvv.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dsb::new)
   );
   private final drv.a K;

   @Override
   public MapCodec<dsb> a() {
      return J;
   }

   public dsb(drv.a $$0, dvv $$1, dvu.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvv $$0) {
      return drv.c($$0.b()).isPresent();
   }

   public drv.a q() {
      return this.K;
   }
}
