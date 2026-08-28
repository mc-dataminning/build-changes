import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doo extends dgw implements don {
   public static final MapCodec<doo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(don.a.e.fieldOf("weathering_state").forGetter(doo::m), u()).apply($$0, doo::new)
   );
   private final don.a e;

   @Override
   protected MapCodec<doo> a() {
      return d;
   }

   public doo(don.a $$0, dsk.d $$1) {
      super($$1);
      this.e = $$0;
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
      return this.e;
   }
}
