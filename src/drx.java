import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drx extends dkw implements drv {
   public static final MapCodec<drx> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwk.a.fieldOf("block_set_type").forGetter(dkw::b), drv.a.e.fieldOf("weathering_state").forGetter(drx::q), t()).apply($$0, drx::new)
   );
   private final drv.a m;

   @Override
   public MapCodec<drx> a() {
      return l;
   }

   protected drx(dwk $$0, drv.a $$1, dvu.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$0.c(dkw.f) == dwq.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dvv $$0) {
      return drv.c($$0.b()).isPresent();
   }

   public drv.a q() {
      return this.m;
   }
}
