import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dor extends dmk implements dom {
   public static final MapCodec<dor> f = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dom.a.e.fieldOf("weathering_state").forGetter(dgi::c), u()).apply($$0, dor::new)
   );
   private final dom.a g;

   @Override
   public MapCodec<dor> a() {
      return f;
   }

   public dor(dom.a $$0, dsj.d $$1) {
      super($$1);
      this.g = $$0;
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dsk $$0) {
      return dom.c($$0.b()).isPresent();
   }

   public dom.a m() {
      return this.g;
   }
}
