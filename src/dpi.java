import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpi extends dnr implements dpc {
   public static final MapCodec<dpi> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpc.a.e.fieldOf("weathering_state").forGetter(dgx::c), dta.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dpi::new)
   );
   private final dpc.a J;

   @Override
   public MapCodec<dpi> a() {
      return I;
   }

   public dpi(dpc.a $$0, dta $$1, dsz.d $$2) {
      super($$1, $$2);
      this.J = $$0;
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dta $$0) {
      return dpc.c($$0.b()).isPresent();
   }

   public dpc.a m() {
      return this.J;
   }
}
