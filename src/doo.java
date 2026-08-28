import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doo extends dhn implements dom {
   public static final MapCodec<doo> l = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsz.a.fieldOf("block_set_type").forGetter(dhn::b), dom.a.e.fieldOf("weathering_state").forGetter(doo::m), u()).apply($$0, doo::new)
   );
   private final dom.a m;

   @Override
   public MapCodec<doo> a() {
      return l;
   }

   protected doo(dsz $$0, dom.a $$1, dsj.d $$2) {
      super($$0, $$2);
      this.m = $$1;
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$0.c(dhn.f) == dtg.b) {
         this.a_($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsk $$0) {
      return dom.c($$0.b()).isPresent();
   }

   public dom.a m() {
      return this.m;
   }
}
