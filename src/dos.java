import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dos extends dml implements don {
   public static final MapCodec<dos> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(don.a.e.fieldOf("weathering_state").forGetter(dgj::c), u()).apply($$0, dos::new)
   );
   private final don.a g;

   @Override
   public MapCodec<dos> a() {
      return f;
   }

   public dos(don.a $$0, dsk.d $$1) {
      super($$1);
      this.g = $$0;
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
      return this.g;
   }
}
