import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsz extends dlu implements dsx {
   public static final MapCodec<dsz> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxn.a.fieldOf("block_set_type").forGetter(dlu::b), dsx.a.e.fieldOf("weathering_state").forGetter(dsz::q), t()).apply($$0, dsz::new)
   );
   private final dsx.a m;

   @Override
   public MapCodec<dsz> a() {
      return l;
   }

   protected dsz(dxn $$0, dsx.a $$1, dwx.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if ($$0.c(dlu.f) == dxt.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dwy $$0) {
      return dsx.c($$0.b()).isPresent();
   }

   public dsx.a q() {
      return this.m;
   }
}
