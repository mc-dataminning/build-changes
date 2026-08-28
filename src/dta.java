import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dta extends dsv implements dsw {
   public static final MapCodec<dta> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsw.a.e.fieldOf("weathering_state").forGetter(dta::q), t()).apply($$0, dta::new)
   );
   private final dsw.a f;

   @Override
   protected MapCodec<dta> a() {
      return e;
   }

   protected dta(dsw.a $$0, dww.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwx $$0) {
      return dsw.c($$0.b()).isPresent();
   }

   public dsw.a q() {
      return this.f;
   }
}
