import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsy extends dst implements dsu {
   public static final MapCodec<dsy> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsu.a.e.fieldOf("weathering_state").forGetter(dsy::q), t()).apply($$0, dsy::new)
   );
   private final dsu.a f;

   @Override
   protected MapCodec<dsy> a() {
      return e;
   }

   protected dsy(dsu.a $$0, dwu.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
