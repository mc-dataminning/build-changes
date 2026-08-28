import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dop extends dho implements don {
   public static final MapCodec<dop> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dta.a.fieldOf("block_set_type").forGetter(dho::b), don.a.e.fieldOf("weathering_state").forGetter(dop::m), u()).apply($$0, dop::new)
   );
   private final don.a m;

   @Override
   public MapCodec<dop> a() {
      return l;
   }

   protected dop(dta $$0, don.a $$1, dsk.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(dho.f) == dth.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsl $$0) {
      return don.c($$0.b()).isPresent();
   }

   public don.a m() {
      return this.m;
   }
}
