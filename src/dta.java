import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dta extends djn implements dsx {
   public static final MapCodec<dta> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsx.a.e.fieldOf("weathering_state").forGetter(dkp::c), t()).apply($$0, dta::new)
   );
   private final dsx.a e;

   @Override
   public MapCodec<dta> a() {
      return d;
   }

   public dta(dsx.a $$0, dwx.d $$1) {
      super($$1);
      this.e = $$0;
   }

   @Override
   protected void b(dwy $$0, ard $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwy $$0) {
      return dsx.c($$0.b()).isPresent();
   }

   public dsx.a q() {
      return this.e;
   }
}
