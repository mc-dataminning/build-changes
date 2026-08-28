import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtt extends dsu implements dtm {
   public static final MapCodec<dtt> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dyc.a.fieldOf("block_set_type").forGetter(dsu::q), dtm.a.e.fieldOf("weathering_state").forGetter(dtt::r), t()).apply($$0, dtt::new)
   );
   private final dtm.a n;

   @Override
   public MapCodec<dtt> a() {
      return m;
   }

   protected dtt(dyc $$0, dtm.a $$1, dxm.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dxn $$0) {
      return dtm.c($$0.b()).isPresent();
   }

   public dtm.a r() {
      return this.n;
   }
}
