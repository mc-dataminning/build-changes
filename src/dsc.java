import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsc extends drd implements drv {
   public static final MapCodec<dsc> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwk.a.fieldOf("block_set_type").forGetter(drd::q), drv.a.e.fieldOf("weathering_state").forGetter(dsc::r), t()).apply($$0, dsc::new)
   );
   private final drv.a n;

   @Override
   public MapCodec<dsc> a() {
      return m;
   }

   protected dsc(dwk $$0, drv.a $$1, dvu.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dvv $$0) {
      return drv.c($$0.b()).isPresent();
   }

   public drv.a r() {
      return this.n;
   }
}
