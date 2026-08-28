import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dta extends drj implements dsu {
   public static final MapCodec<dta> J = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsu.a.e.fieldOf("weathering_state").forGetter(dkm::c), dwv.a.fieldOf("base_state").forGetter($$0x -> $$0x.I), t()).apply($$0, dta::new)
   );
   private final dsu.a K;

   @Override
   public MapCodec<dta> a() {
      return J;
   }

   public dta(dsu.a $$0, dwv $$1, dwu.d $$2) {
      super($$1, $$2);
      this.K = $$0;
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean f(dwv $$0) {
      return dsu.c($$0.b()).isPresent();
   }

   public dsu.a q() {
      return this.K;
   }
}
