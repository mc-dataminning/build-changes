import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpl extends dom implements dpe {
   public static final MapCodec<dpl> m = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dtr.a.fieldOf("block_set_type").forGetter(dom::m), dpe.a.e.fieldOf("weathering_state").forGetter(dpl::n), u()).apply($$0, dpl::new)
   );
   private final dpe.a n;

   @Override
   public MapCodec<dpl> a() {
      return m;
   }

   protected dpl(dtr $$0, dpe.a $$1, dtb.d $$2) {
      super($$0, $$2);
      this.n = $$1;
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean d_(dtc $$0) {
      return dpe.c($$0.b()).isPresent();
   }

   public dpe.a n() {
      return this.n;
   }
}
