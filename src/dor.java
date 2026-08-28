import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dor extends dom implements don {
   public static final MapCodec<dor> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(don.a.e.fieldOf("weathering_state").forGetter(dor::m), u()).apply($$0, dor::new)
   );
   private final don.a f;

   @Override
   protected MapCodec<dor> a() {
      return e;
   }

   protected dor(don.a $$0, dsk.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsl $$0) {
      return don.c($$0.b()).isPresent();
   }

   public don.a m() {
      return this.f;
   }
}
