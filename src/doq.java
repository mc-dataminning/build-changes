import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class doq extends dol implements dom {
   public static final MapCodec<doq> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dom.a.e.fieldOf("weathering_state").forGetter(doq::m), u()).apply($$0, doq::new)
   );
   private final dom.a f;

   @Override
   protected MapCodec<doq> a() {
      return e;
   }

   protected doq(dom.a $$0, dsj.d $$1) {
      super($$1);
      this.f = $$0;
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
      return this.f;
   }
}
