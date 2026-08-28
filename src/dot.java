import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dot extends dnc implements don {
   public static final MapCodec<dot> I = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(don.a.e.fieldOf("weathering_state").forGetter(dgj::c), dsl.b.fieldOf("base_state").forGetter($$0x -> $$0x.H), u()).apply($$0, dot::new)
   );
   private final don.a J;

   @Override
   public MapCodec<dot> a() {
      return I;
   }

   public dot(don.a $$0, dsl $$1, dsk.d $$2) {
      super($$1, $$2);
      this.J = $$0;
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
      return this.J;
   }
}
