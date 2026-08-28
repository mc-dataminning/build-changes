import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dta extends dqt implements dsv {
   public static final MapCodec<dta> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsv.a.e.fieldOf("weathering_state").forGetter(dkn::c), t()).apply($$0, dta::new)
   );
   private final dsv.a g;

   @Override
   public MapCodec<dta> a() {
      return f;
   }

   public dta(dsv.a $$0, dwv.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dww $$0) {
      return dsv.c($$0.b()).isPresent();
   }

   public dsv.a q() {
      return this.g;
   }
}
