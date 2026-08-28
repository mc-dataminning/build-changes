import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpi extends dpd implements dpe {
   public static final MapCodec<dpi> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpe.a.e.fieldOf("weathering_state").forGetter(dpi::m), u()).apply($$0, dpi::new)
   );
   private final dpe.a f;

   @Override
   protected MapCodec<dpi> a() {
      return e;
   }

   protected dpi(dpe.a $$0, dtb.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dtc $$0) {
      return dpe.c($$0.b()).isPresent();
   }

   public dpe.a m() {
      return this.f;
   }
}
