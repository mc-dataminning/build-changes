import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dph extends dna implements dpc {
   public static final MapCodec<dph> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpc.a.e.fieldOf("weathering_state").forGetter(dgx::c), u()).apply($$0, dph::new)
   );
   private final dpc.a g;

   @Override
   public MapCodec<dph> a() {
      return f;
   }

   public dph(dpc.a $$0, dsz.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
