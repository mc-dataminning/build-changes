import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drf extends dke implements drd {
   public static final MapCodec<drf> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvs.a.fieldOf("block_set_type").forGetter(dke::b), drd.a.e.fieldOf("weathering_state").forGetter(drf::q), t()).apply($$0, drf::new)
   );
   private final drd.a m;

   @Override
   public MapCodec<drf> a() {
      return l;
   }

   protected drf(dvs $$0, drd.a $$1, dvc.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$0.c(dke.f) == dvz.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dvd $$0) {
      return drd.c($$0.b()).isPresent();
   }

   public drd.a q() {
      return this.m;
   }
}
